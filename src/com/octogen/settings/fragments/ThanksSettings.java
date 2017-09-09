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

public class ThanksSettings extends SettingsPreferenceFragment {

    private static final String KEY_OCTOGEN_THANKS_1 = "thanks_1";
    private static final String KEY_OCTOGEN_THANKS_2 = "thanks_2";
    private static final String KEY_OCTOGEN_THANKS_3 = "thanks_3";
    private static final String KEY_OCTOGEN_THANKS_4 = "thanks_4";
    private static final String KEY_OCTOGEN_THANKS_5 = "thanks_5";
    private static final String KEY_OCTOGEN_THANKS_6 = "thanks_6";
    private static final String KEY_OCTOGEN_THANKS_7 = "thanks_7";
    private static final String KEY_OCTOGEN_THANKS_8 = "thanks_8";
    private static final String KEY_OCTOGEN_THANKS_9 = "thanks_9";
    private static final String KEY_OCTOGEN_THANKS_10 = "thanks_10";
    private static final String KEY_OCTOGEN_THANKS_11 = "thanks_11";
    private static final String KEY_OCTOGEN_THANKS_12 = "thanks_12";
    private static final String KEY_OCTOGEN_THANKS_13 = "thanks_13";
    private static final String KEY_OCTOGEN_THANKS_14 = "thanks_14";
    private static final String KEY_OCTOGEN_THANKS_15 = "thanks_15";
    private static final String KEY_OCTOGEN_THANKS_16 = "thanks_16";
    private static final String KEY_OCTOGEN_THANKS_17 = "thanks_17";
    private static final String KEY_OCTOGEN_THANKS_18 = "thanks_18";
    private static final String KEY_OCTOGEN_THANKS_19 = "thanks_19";
    private static final String KEY_OCTOGEN_THANKS_20 = "thanks_20";
    private static final String KEY_OCTOGEN_THANKS_21 = "thanks_21";
    private static final String KEY_OCTOGEN_THANKS_22 = "thanks_22";
    private static final String KEY_OCTOGEN_THANKS_23 = "thanks_23";
    private static final String KEY_OCTOGEN_THANKS_24 = "thanks_24";
    private static final String KEY_OCTOGEN_THANKS_25 = "thanks_25";
    private static final String KEY_OCTOGEN_THANKS_26 = "thanks_26";
    private static final String KEY_OCTOGEN_THANKS_27 = "thanks_27";
    private static final String KEY_OCTOGEN_THANKS_28 = "thanks_28";
    private static final String KEY_OCTOGEN_THANKS_29 = "thanks_29";
    private static final String KEY_OCTOGEN_THANKS_30 = "thanks_30";
    private static final String KEY_OCTOGEN_THANKS_31 = "thanks_31";
    private static final String KEY_OCTOGEN_THANKS_32 = "thanks_32";
    private static final String KEY_OCTOGEN_THANKS_33 = "thanks_33";
    private static final String KEY_OCTOGEN_THANKS_34 = "thanks_34";
    private static final String KEY_OCTOGEN_THANKS_35 = "thanks_35";
    private static final String KEY_OCTOGEN_THANKS_36 = "thanks_36";
    private static final String KEY_OCTOGEN_THANKS_37 = "thanks_37";
    private static final String KEY_OCTOGEN_THANKS_38 = "thanks_38";
    private static final String KEY_OCTOGEN_THANKS_39 = "thanks_39";
    private static final String KEY_OCTOGEN_THANKS_40 = "thanks_40";
    private static final String KEY_OCTOGEN_THANKS_41 = "thanks_41";
    private static final String KEY_OCTOGEN_THANKS_42 = "thanks_42";
    private static final String KEY_OCTOGEN_THANKS_43 = "thanks_43";
    private static final String KEY_OCTOGEN_THANKS_44 = "thanks_44";
    private static final String KEY_OCTOGEN_THANKS_45 = "thanks_45";
    private static final String KEY_OCTOGEN_THANKS_46 = "thanks_46";
    private static final String KEY_OCTOGEN_THANKS_47 = "thanks_47";
    private static final String KEY_OCTOGEN_THANKS_48 = "thanks_48";
    private static final String KEY_OCTOGEN_THANKS_49 = "thanks_49";
    private static final String KEY_OCTOGEN_THANKS_50 = "thanks_50";
    private static final String KEY_OCTOGEN_THANKS_51 = "thanks_51";
    private static final String KEY_OCTOGEN_THANKS_52 = "thanks_52";
    private static final String KEY_OCTOGEN_THANKS_53 = "thanks_53";
    private static final String KEY_OCTOGEN_THANKS_54 = "thanks_54";
    private static final String KEY_OCTOGEN_THANKS_55 = "thanks_55";
    private static final String KEY_OCTOGEN_THANKS_56 = "thanks_56";
    private static final String KEY_OCTOGEN_THANKS_57 = "thanks_57";
    private static final String KEY_OCTOGEN_THANKS_58 = "thanks_58";
    private static final String KEY_OCTOGEN_THANKS_59 = "thanks_59";
    private static final String KEY_OCTOGEN_THANKS_60 = "thanks_60";
    private static final String KEY_OCTOGEN_THANKS_61 = "thanks_61";
    private static final String KEY_OCTOGEN_THANKS_62 = "thanks_62";
    private static final String KEY_OCTOGEN_THANKS_63 = "thanks_63";
    private static final String KEY_OCTOGEN_THANKS_64 = "thanks_64";
    private static final String KEY_OCTOGEN_THANKS_65 = "thanks_65";
    private static final String KEY_OCTOGEN_THANKS_66 = "thanks_66";
    private static final String KEY_OCTOGEN_THANKS_67 = "thanks_67";
    private static final String KEY_OCTOGEN_THANKS_68 = "thanks_68";
    private static final String KEY_OCTOGEN_THANKS_69 = "thanks_69";
    private static final String KEY_OCTOGEN_THANKS_70 = "thanks_70";
    private static final String KEY_OCTOGEN_THANKS_71 = "thanks_71";
    private static final String KEY_OCTOGEN_THANKS_72 = "thanks_72";
    private static final String KEY_OCTOGEN_THANKS_73 = "thanks_73";
    private static final String KEY_OCTOGEN_THANKS_74 = "thanks_74";
    private static final String KEY_OCTOGEN_THANKS_75 = "thanks_75";
    private static final String KEY_OCTOGEN_THANKS_76 = "thanks_76";
    private static final String KEY_OCTOGEN_THANKS_77 = "thanks_77";
    private static final String KEY_OCTOGEN_THANKS_78 = "thanks_78";
    private static final String KEY_OCTOGEN_THANKS_79 = "thanks_79";
    private static final String KEY_OCTOGEN_THANKS_80 = "thanks_80";
    private static final String KEY_OCTOGEN_THANKS_81 = "thanks_81";
    private static final String KEY_OCTOGEN_THANKS_82 = "thanks_82";
    private static final String KEY_OCTOGEN_THANKS_83 = "thanks_83";
    private static final String KEY_OCTOGEN_THANKS_84 = "thanks_84";
    private static final String KEY_OCTOGEN_THANKS_85 = "thanks_85";
    private static final String KEY_OCTOGEN_THANKS_86 = "thanks_86";
    private static final String KEY_OCTOGEN_THANKS_87 = "thanks_87";
    private static final String KEY_OCTOGEN_THANKS_88 = "thanks_88";
    private static final String KEY_OCTOGEN_THANKS_89 = "thanks_89";
    private static final String KEY_OCTOGEN_THANKS_90 = "thanks_90";
    private static final String KEY_OCTOGEN_THANKS_91 = "thanks_91";
    private static final String KEY_OCTOGEN_THANKS_92 = "thanks_92";
    private static final String KEY_OCTOGEN_THANKS_93 = "thanks_93";
    private static final String KEY_OCTOGEN_THANKS_94 = "thanks_94";
    private static final String KEY_OCTOGEN_THANKS_95 = "thanks_95";
    private static final String KEY_OCTOGEN_THANKS_96 = "thanks_96";
    private static final String KEY_OCTOGEN_THANKS_97 = "thanks_97";
    private static final String KEY_OCTOGEN_THANKS_98 = "thanks_98";
    private static final String KEY_OCTOGEN_THANKS_99 = "thanks_99";
    private static final String KEY_OCTOGEN_THANKS_100 = "thanks_100";
    private static final String KEY_OCTOGEN_THANKS_101 = "thanks_101";

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        addPreferencesFromResource(R.xml.octogen_settings_thanks);

	findPreference(KEY_OCTOGEN_THANKS_1).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_2).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_3).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_4).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_5).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_6).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_7).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_8).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_9).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_10).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_11).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_12).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_13).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_14).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_15).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_16).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_17).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_18).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_19).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_20).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_21).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_22).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_23).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_24).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_25).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_26).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_27).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_28).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_29).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_30).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_31).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_32).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_33).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_34).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_35).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_36).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_37).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_38).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_39).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_40).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_41).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_42).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_43).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_44).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_45).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_46).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_47).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_48).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_49).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_50).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_51).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_52).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_53).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_54).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_55).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_56).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_57).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_58).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_59).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_60).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_61).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_62).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_63).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_64).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_65).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_66).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_67).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_68).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_69).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_70).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_71).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_72).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_73).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_74).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_75).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_76).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_77).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_78).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_79).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_80).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_81).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_82).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_83).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_84).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_85).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_86).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_87).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_88).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_89).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_90).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_91).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_92).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_93).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_94).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_95).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_96).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_97).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_98).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_99).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_100).setEnabled(true);
	findPreference(KEY_OCTOGEN_THANKS_101).setEnabled(true);
	
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
