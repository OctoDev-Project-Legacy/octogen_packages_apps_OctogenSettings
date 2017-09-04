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

import com.android.internal.logging.nano.MetricsProto;

import android.os.Bundle;
import com.android.settings.R;

import com.android.settings.SettingsPreferenceFragment;

import android.os.SystemProperties;

public class AboutSettings extends SettingsPreferenceFragment {

    private static final String KEY_OCTOGEN_LOGO = "octogen_logo";
    private static final String KEY_OCTOGEN_BUILD_DATE = "build_date";
    private static final String KEY_OCTOGEN_BUILD_TYPE = "build_type";
    private static final String KEY_OCTOGEN_BUILD_USER = "build_user";
    private static final String KEY_OCTOGEN_BUILD_VERSION = "build_version";
    private static final String KEY_OCTOGEN_CHANGELOG = "octogen_changelog";

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        addPreferencesFromResource(R.xml.octogen_settings_about);

	findPreference(KEY_OCTOGEN_LOGO).setEnabled(true);
        setValueSummary(KEY_OCTOGEN_BUILD_DATE, "ro.build.date");
	setValueSummary(KEY_OCTOGEN_BUILD_USER, "ro.build.user");
	setValueSummary(KEY_OCTOGEN_BUILD_VERSION, "ro.octogen.version");
	setValueSummary(KEY_OCTOGEN_BUILD_TYPE, "ro.octogen.type");
        findPreference(KEY_OCTOGEN_CHANGELOG).setEnabled(true);
    }

    private void setValueSummary(String preference, String property) {
        try {
            findPreference(preference).setSummary(
                    SystemProperties.get(property, 
                            getResources().getString(R.string.device_info_default)));
        } catch (RuntimeException e) {

        }
    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.OCTOGEN_SETTINGS;
    }
}
