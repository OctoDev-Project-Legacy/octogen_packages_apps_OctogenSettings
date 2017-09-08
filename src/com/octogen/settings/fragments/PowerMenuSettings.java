/**
    Copyright 2017 OctoDev Project

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.octogen.settings.fragments;

import android.content.Context;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.UserInfo;
import android.os.Bundle;
import android.os.UserHandle;
import android.os.UserManager;
import android.support.v7.preference.ListPreference;
import android.support.v7.preference.PreferenceManager;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceCategory;
import android.support.v7.preference.PreferenceScreen;
import android.support.v7.preference.Preference.OnPreferenceChangeListener;
import android.support.v14.preference.SwitchPreference;
import android.provider.Settings;
import com.android.settings.R;
import android.support.annotation.NonNull;
import com.android.internal.logging.nano.MetricsProto;
import com.android.internal.util.abc.AbcUtils;
import com.android.settings.SettingsPreferenceFragment;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import android.provider.SearchIndexableResource;
import android.text.TextUtils;
import android.util.Log;
import com.android.settings.search.BaseSearchIndexProvider;
import com.android.settings.search.Indexable;
import com.octogen.settings.preferences.SecureSettingSwitchPreference;


public class PowerMenuSettings extends SettingsPreferenceFragment
                implements Preference.OnPreferenceChangeListener, Indexable {

    private static final String TAG = "PowerMenuSettings";
    private static final String POWER_MENU_ANIMATIONS = "power_menu_animations";
    private static final String TORCH_POWER_BUTTON_GESTURE = "torch_power_button_gesture";

    private ListPreference mPowerMenuAnimations;
    private SecureSettingSwitchPreference mAdvancedReboot;
    private ListPreference mTorchPowerButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.octogen_settings_power);

        final ContentResolver resolver = getActivity().getContentResolver();
        final PreferenceScreen prefScreen = getPreferenceScreen();

        mPowerMenuAnimations = (ListPreference) findPreference(POWER_MENU_ANIMATIONS);
        mPowerMenuAnimations.setValue(String.valueOf(Settings.System.getInt(
                getContentResolver(), Settings.System.POWER_MENU_ANIMATIONS, 0)));
        mPowerMenuAnimations.setSummary(mPowerMenuAnimations.getEntry());
        mPowerMenuAnimations.setOnPreferenceChangeListener(this);

        mAdvancedReboot = (SecureSettingSwitchPreference)
                findPreference(Settings.Secure.ADVANCED_REBOOT);
        mAdvancedReboot.setOnPreferenceChangeListener(this);

        if (!AbcUtils.deviceHasFlashlight(getContext())) {
            Preference toRemove = prefScreen.findPreference(TORCH_POWER_BUTTON_GESTURE);
            if (toRemove != null) {
                prefScreen.removePreference(toRemove);
            }
        } else {
            mTorchPowerButton = (ListPreference) findPreference(TORCH_POWER_BUTTON_GESTURE);
            int mTorchPowerButtonValue = Settings.Secure.getInt(resolver,
                    Settings.Secure.TORCH_POWER_BUTTON_GESTURE, 0);
            mTorchPowerButton.setValue(Integer.toString(mTorchPowerButtonValue));
            mTorchPowerButton.setSummary(mTorchPowerButton.getEntry());
            mTorchPowerButton.setOnPreferenceChangeListener(this);
        }

    }

    @Override
    public boolean onPreferenceTreeClick(Preference preference) {
        return super.onPreferenceTreeClick(preference);
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {

        ContentResolver resolver = getActivity().getContentResolver();

        boolean result = false;
        if (preference instanceof ListPreference) {
            if (preference == mPowerMenuAnimations) {
               Settings.System.putInt(getContentResolver(), Settings.System.POWER_MENU_ANIMATIONS,
                       Integer.valueOf((String) newValue));
               mPowerMenuAnimations.setValue(String.valueOf(newValue));
               mPowerMenuAnimations.setSummary(mPowerMenuAnimations.getEntry());
               return true;
            }
        } else if (preference instanceof SecureSettingSwitchPreference) {
            if (preference == mAdvancedReboot) {
               boolean value = (Boolean) newValue;
               Settings.Secure.putInt(getContentResolver(), Settings.Secure.ADVANCED_REBOOT,
                       value ? 1:0);
               Settings.Secure.putInt(getContentResolver(), Settings.Secure.GLOBAL_ACTION_DNAA,
                       value ? 1:0);
            }
            return true;
        }

        if (preference == mTorchPowerButton) {
            int mTorchPowerButtonValue = Integer.valueOf((String) newValue);
            int index = mTorchPowerButton.findIndexOfValue((String) newValue);
            mTorchPowerButton.setSummary(
                    mTorchPowerButton.getEntries()[index]);
            Settings.Secure.putInt(resolver, Settings.Secure.TORCH_POWER_BUTTON_GESTURE,
                    mTorchPowerButtonValue);
            if (mTorchPowerButtonValue == 1) {
                //if doubletap for torch is enabled, switch off double tap for camera
                Settings.Secure.putInt(resolver, Settings.Secure.CAMERA_DOUBLE_TAP_POWER_GESTURE_DISABLED,
                        1);
            }
            return true;
        }

        return result;
    }

    public static final Indexable.SearchIndexProvider SEARCH_INDEX_DATA_PROVIDER = new BaseSearchIndexProvider() {

        @Override
        public List<SearchIndexableResource> getXmlResourcesToIndex(Context context,
                boolean enabled) {
            ArrayList<SearchIndexableResource> result =
                    new ArrayList<SearchIndexableResource>();

            SearchIndexableResource sir = new SearchIndexableResource(context);
            sir.xmlResId = R.xml.octogen_settings_power;
            result.add(sir);

            return result;
        }

        @Override
        public List<String> getNonIndexableKeys(Context context) {
            ArrayList<String> result = new ArrayList<String>();
            return result;
        }
    };

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.OCTOGEN_SETTINGS;
    }

}
