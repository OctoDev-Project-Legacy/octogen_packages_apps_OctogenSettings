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

public class AboutSettings extends SettingsPreferenceFragment {

    private static final String KEY_OCTOGEN_CHANGELOG = "octogen_changelog";

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        addPreferencesFromResource(R.xml.octogen_settings_about);

        findPreference(KEY_OCTOGEN_CHANGELOG).setEnabled(true);
    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.OCTOGEN_SETTINGS;
    }
}
