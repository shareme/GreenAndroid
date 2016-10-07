/*
 * Copyright 2014 Mike Penz
 * Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.shareme.greenandroid.weather_icons_typeface;

import android.content.Context;
import android.graphics.Typeface;

import com.github.shareme.greenandroid.iconicscore.typeface.IIcon;
import com.github.shareme.greenandroid.iconicscore.typeface.ITypeface;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

@SuppressWarnings("unused")
public class WeatherIcons implements ITypeface {
    private static final String TTF_FILE = "weather-icons-v2.0.10.ttf";

    private static Typeface typeface = null;

    private static HashMap<String, Character> mChars;

    @Override
    public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    @Override
    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap<String, Character> aChars = new HashMap<String, Character>();
            for (Icon v : Icon.values()) {
                aChars.put(v.name(), v.character);
            }
            mChars = aChars;
        }

        return mChars;
    }

    @Override
    public String getMappingPrefix() {
        return "wic";
    }

    @Override
    public String getFontName() {
        return "Weather Icons";
    }

    @Override
    public String getVersion() {
        return "2.0.10";
    }

    @Override
    public int getIconCount() {
        return mChars.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> icons = new LinkedList<String>();

        for (Icon value : Icon.values()) {
            icons.add(value.name());
        }

        return icons;
    }

    @Override
    public String getAuthor() {
        return "Erik Flowers";
    }

    @Override
    public String getUrl() {
        return "http://weathericons.io/";
    }

    @Override
    public String getDescription() {
        return "Weather Icons is the only icon font and CSS with 222 weather themed icons, ready to be dropped right into Bootstrap, or any project that needs high quality weather, maritime, and meteorological based icons!";
    }

    @Override
    public String getLicense() {
        return "SIL OFL 1.1";
    }

    @Override
    public String getLicenseUrl() {
        return "http://scripts.sil.org/cms/scripts/page.php?site_id=nrsi&id=OFL";
    }

    @Override
    public Typeface getTypeface(Context context) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + TTF_FILE);
            } catch (Exception e) {
                return null;
            }
        }
        return typeface;
    }

    public enum Icon implements IIcon {
        wic_day_sunny('\uf00d'),
        wic_day_cloudy('\uf002'),
        wic_day_cloudy_gusts('\uf000'),
        wic_day_cloudy_windy('\uf001'),
        wic_day_fog('\uf003'),
        wic_day_hail('\uf004'),
        wic_day_haze('\uf0b6'),
        wic_day_lightning('\uf005'),
        wic_day_rain('\uf008'),
        wic_day_rain_mix('\uf006'),
        wic_day_rain_wind('\uf007'),
        wic_day_showers('\uf009'),
        wic_day_sleet('\uf0b2'),
        wic_day_sleet_storm('\uf068'),
        wic_day_snow('\uf00a'),
        wic_day_snow_thunderstorm('\uf06b'),
        wic_day_snow_wind('\uf065'),
        wic_day_sprinkle('\uf00b'),
        wic_day_storm_showers('\uf00e'),
        wic_day_sunny_overcast('\uf00c'),
        wic_day_thunderstorm('\uf010'),
        wic_day_windy('\uf085'),
        wic_solar_eclipse('\uf06e'),
        wic_hot('\uf072'),
        wic_day_cloudy_high('\uf07d'),
        wic_day_light_wind('\uf0c4'),
        wic_night_clear('\uf02e'),
        wic_night_alt_cloudy('\uf086'),
        wic_night_alt_cloudy_gusts('\uf022'),
        wic_night_alt_cloudy_windy('\uf023'),
        wic_night_alt_hail('\uf024'),
        wic_night_alt_lightning('\uf025'),
        wic_night_alt_rain('\uf028'),
        wic_night_alt_rain_mix('\uf026'),
        wic_night_alt_rain_wind('\uf027'),
        wic_night_alt_showers('\uf029'),
        wic_night_alt_sleet('\uf0b4'),
        wic_night_alt_sleet_storm('\uf06a'),
        wic_night_alt_snow('\uf02a'),
        wic_night_alt_snow_thunderstorm('\uf06d'),
        wic_night_alt_snow_wind('\uf067'),
        wic_night_alt_sprinkle('\uf02b'),
        wic_night_alt_storm_showers('\uf02c'),
        wic_night_alt_thunderstorm('\uf02d'),
        wic_night_cloudy('\uf031'),
        wic_night_cloudy_gusts('\uf02f'),
        wic_night_cloudy_windy('\uf030'),
        wic_night_fog('\uf04a'),
        wic_night_hail('\uf032'),
        wic_night_lightning('\uf033'),
        wic_night_partly_cloudy('\uf083'),
        wic_night_rain('\uf036'),
        wic_night_rain_mix('\uf034'),
        wic_night_rain_wind('\uf035'),
        wic_night_showers('\uf037'),
        wic_night_sleet('\uf0b3'),
        wic_night_sleet_storm('\uf069'),
        wic_night_snow('\uf038'),
        wic_night_snow_thunderstorm('\uf06c'),
        wic_night_snow_wind('\uf066'),
        wic_night_sprinkle('\uf039'),
        wic_night_storm_showers('\uf03a'),
        wic_night_thunderstorm('\uf03b'),
        wic_lunar_eclipse('\uf070'),
        wic_stars('\uf077'),
        wic_night_alt_cloudy_high('\uf07e'),
        wic_night_cloudy_high('\uf080'),
        wic_night_alt_partly_cloudy('\uf081'),
        wic_cloud('\uf041'),
        wic_cloudy('\uf013'),
        wic_cloudy_gusts('\uf011'),
        wic_cloudy_windy('\uf012'),
        wic_fog('\uf014'),
        wic_hail('\uf015'),
        wic_rain('\uf019'),
        wic_rain_mix('\uf017'),
        wic_rain_wind('\uf018'),
        wic_showers('\uf01a'),
        wic_sleet('\uf0b5'),
        wic_sprinkle('\uf01c'),
        wic_storm_showers('\uf01d'),
        wic_thunderstorm('\uf01e'),
        wic_snow_wind('\uf064'),
        wic_snow('\uf01b'),
        wic_smog('\uf074'),
        wic_smoke('\uf062'),
        wic_lightning('\uf016'),
        wic_raindrops('\uf04e'),
        wic_raindrop('\uf078'),
        wic_dust('\uf063'),
        wic_snowflake_cold('\uf076'),
        wic_windy('\uf021'),
        wic_strong_wind('\uf050'),
        wic_sandstorm('\uf082'),
        wic_earthquake('\uf0c6'),
        wic_fire('\uf0c7'),
        wic_flood('\uf07c'),
        wic_meteor('\uf071'),
        wic_tsunami('\uf0c5'),
        wic_volcano('\uf0c8'),
        wic_hurricane('\uf073'),
        wic_tornado('\uf056'),
        wic_small_craft_advisory('\uf0cc'),
        wic_gale_warning('\uf0cd'),
        wic_storm_warning('\uf0ce'),
        wic_hurricane_warning('\uf0cf'),
        wic_wind_direction('\uf0b1'),
        wic_alien('\uf075'),
        wic_celsius('\uf03c'),
        wic_fahrenheit('\uf045'),
        wic_degrees('\uf042'),
        wic_thermometer('\uf055'),
        wic_thermometer_exterior('\uf053'),
        wic_thermometer_internal('\uf054'),
        wic_cloud_down('\uf03d'),
        wic_cloud_up('\uf040'),
        wic_cloud_refresh('\uf03e'),
        wic_horizon('\uf047'),
        wic_horizon_alt('\uf046'),
        wic_sunrise('\uf051'),
        wic_sunset('\uf052'),
        wic_moonrise('\uf0c9'),
        wic_moonset('\uf0ca'),
        wic_refresh('\uf04c'),
        wic_refresh_alt('\uf04b'),
        wic_umbrella('\uf084'),
        wic_barometer('\uf079'),
        wic_humidity('\uf07a'),
        wic_na('\uf07b'),
        wic_train('\uf0cb'),
        wic_moon_new('\uf095'),
        wic_moon_waxing_crescent_1('\uf096'),
        wic_moon_waxing_crescent_2('\uf097'),
        wic_moon_waxing_crescent_3('\uf098'),
        wic_moon_waxing_crescent_4('\uf099'),
        wic_moon_waxing_crescent_5('\uf09a'),
        wic_moon_waxing_crescent_6('\uf09b'),
        wic_moon_first_quarter('\uf09c'),
        wic_moon_waxing_gibbous_1('\uf09d'),
        wic_moon_waxing_gibbous_2('\uf09e'),
        wic_moon_waxing_gibbous_3('\uf09f'),
        wic_moon_waxing_gibbous_4('\uf0a0'),
        wic_moon_waxing_gibbous_5('\uf0a1'),
        wic_moon_waxing_gibbous_6('\uf0a2'),
        wic_moon_full('\uf0a3'),
        wic_moon_waning_gibbous_1('\uf0a4'),
        wic_moon_waning_gibbous_2('\uf0a5'),
        wic_moon_waning_gibbous_3('\uf0a6'),
        wic_moon_waning_gibbous_4('\uf0a7'),
        wic_moon_waning_gibbous_5('\uf0a8'),
        wic_moon_waning_gibbous_6('\uf0a9'),
        wic_moon_third_quarter('\uf0aa'),
        wic_moon_waning_crescent_1('\uf0ab'),
        wic_moon_waning_crescent_2('\uf0ac'),
        wic_moon_waning_crescent_3('\uf0ad'),
        wic_moon_waning_crescent_4('\uf0ae'),
        wic_moon_waning_crescent_5('\uf0af'),
        wic_moon_waning_crescent_6('\uf0b0'),
        wic_moon_alt_new('\uf0eb'),
        wic_moon_alt_waxing_crescent_1('\uf0d0'),
        wic_moon_alt_waxing_crescent_2('\uf0d1'),
        wic_moon_alt_waxing_crescent_3('\uf0d2'),
        wic_moon_alt_waxing_crescent_4('\uf0d3'),
        wic_moon_alt_waxing_crescent_5('\uf0d4'),
        wic_moon_alt_waxing_crescent_6('\uf0d5'),
        wic_moon_alt_first_quarter('\uf0d6'),
        wic_moon_alt_waxing_gibbous_1('\uf0d7'),
        wic_moon_alt_waxing_gibbous_2('\uf0d8'),
        wic_moon_alt_waxing_gibbous_3('\uf0d9'),
        wic_moon_alt_waxing_gibbous_4('\uf0da'),
        wic_moon_alt_waxing_gibbous_5('\uf0db'),
        wic_moon_alt_waxing_gibbous_6('\uf0dc'),
        wic_moon_alt_full('\uf0dd'),
        wic_moon_alt_waning_gibbous_1('\uf0de'),
        wic_moon_alt_waning_gibbous_2('\uf0df'),
        wic_moon_alt_waning_gibbous_3('\uf0e0'),
        wic_moon_alt_waning_gibbous_4('\uf0e1'),
        wic_moon_alt_waning_gibbous_5('\uf0e2'),
        wic_moon_alt_waning_gibbous_6('\uf0e3'),
        wic_moon_alt_third_quarter('\uf0e4'),
        wic_moon_alt_waning_crescent_1('\uf0e5'),
        wic_moon_alt_waning_crescent_2('\uf0e6'),
        wic_moon_alt_waning_crescent_3('\uf0e7'),
        wic_moon_alt_waning_crescent_4('\uf0e8'),
        wic_moon_alt_waning_crescent_5('\uf0e9'),
        wic_moon_alt_waning_crescent_6('\uf0ea'),
        wic_moon_0('\uf095'),
        wic_moon_1('\uf096'),
        wic_moon_2('\uf097'),
        wic_moon_3('\uf098'),
        wic_moon_4('\uf099'),
        wic_moon_5('\uf09a'),
        wic_moon_6('\uf09b'),
        wic_moon_7('\uf09c'),
        wic_moon_8('\uf09d'),
        wic_moon_9('\uf09e'),
        wic_moon_10('\uf09f'),
        wic_moon_11('\uf0a0'),
        wic_moon_12('\uf0a1'),
        wic_moon_13('\uf0a2'),
        wic_moon_14('\uf0a3'),
        wic_moon_15('\uf0a4'),
        wic_moon_16('\uf0a5'),
        wic_moon_17('\uf0a6'),
        wic_moon_18('\uf0a7'),
        wic_moon_19('\uf0a8'),
        wic_moon_20('\uf0a9'),
        wic_moon_21('\uf0aa'),
        wic_moon_22('\uf0ab'),
        wic_moon_23('\uf0ac'),
        wic_moon_24('\uf0ad'),
        wic_moon_25('\uf0ae'),
        wic_moon_26('\uf0af'),
        wic_moon_27('\uf0b0'),
        wic_time_1('\uf08a'),
        wic_time_2('\uf08b'),
        wic_time_3('\uf08c'),
        wic_time_4('\uf08d'),
        wic_time_5('\uf08e'),
        wic_time_6('\uf08f'),
        wic_time_7('\uf090'),
        wic_time_8('\uf091'),
        wic_time_9('\uf092'),
        wic_time_10('\uf093'),
        wic_time_11('\uf094'),
        wic_time_12('\uf089'),
        wic_direction_up('\uf058'),
        wic_direction_up_right('\uf057'),
        wic_direction_right('\uf04d'),
        wic_direction_down_right('\uf088'),
        wic_direction_down('\uf044'),
        wic_direction_down_left('\uf043'),
        wic_direction_left('\uf048'),
        wic_direction_up_left('\uf087'),
        wic_wind_beaufort_0('\uf0b7'),
        wic_wind_beaufort_1('\uf0b8'),
        wic_wind_beaufort_2('\uf0b9'),
        wic_wind_beaufort_3('\uf0ba'),
        wic_wind_beaufort_4('\uf0bb'),
        wic_wind_beaufort_5('\uf0bc'),
        wic_wind_beaufort_6('\uf0bd'),
        wic_wind_beaufort_7('\uf0be'),
        wic_wind_beaufort_8('\uf0bf'),
        wic_wind_beaufort_9('\uf0c0'),
        wic_wind_beaufort_10('\uf0c1'),
        wic_wind_beaufort_11('\uf0c2'),
        wic_wind_beaufort_12('\uf0c3'),
        wic_yahoo_0('\uf056'),
        wic_yahoo_1('\uf00e'),
        wic_yahoo_2('\uf073'),
        wic_yahoo_3('\uf01e'),
        wic_yahoo_4('\uf01e'),
        wic_yahoo_5('\uf017'),
        wic_yahoo_6('\uf017'),
        wic_yahoo_7('\uf017'),
        wic_yahoo_8('\uf015'),
        wic_yahoo_9('\uf01a'),
        wic_yahoo_10('\uf015'),
        wic_yahoo_11('\uf01a'),
        wic_yahoo_12('\uf01a'),
        wic_yahoo_13('\uf01b'),
        wic_yahoo_14('\uf00a'),
        wic_yahoo_15('\uf064'),
        wic_yahoo_16('\uf01b'),
        wic_yahoo_17('\uf015'),
        wic_yahoo_18('\uf017'),
        wic_yahoo_19('\uf063'),
        wic_yahoo_20('\uf014'),
        wic_yahoo_21('\uf021'),
        wic_yahoo_22('\uf062'),
        wic_yahoo_23('\uf050'),
        wic_yahoo_24('\uf050'),
        wic_yahoo_25('\uf076'),
        wic_yahoo_26('\uf013'),
        wic_yahoo_27('\uf031'),
        wic_yahoo_28('\uf002'),
        wic_yahoo_29('\uf031'),
        wic_yahoo_30('\uf002'),
        wic_yahoo_31('\uf02e'),
        wic_yahoo_32('\uf00d'),
        wic_yahoo_33('\uf083'),
        wic_yahoo_34('\uf00c'),
        wic_yahoo_35('\uf017'),
        wic_yahoo_36('\uf072'),
        wic_yahoo_37('\uf00e'),
        wic_yahoo_38('\uf00e'),
        wic_yahoo_39('\uf00e'),
        wic_yahoo_40('\uf01a'),
        wic_yahoo_41('\uf064'),
        wic_yahoo_42('\uf01b'),
        wic_yahoo_43('\uf064'),
        wic_yahoo_44('\uf00c'),
        wic_yahoo_45('\uf00e'),
        wic_yahoo_46('\uf01b'),
        wic_yahoo_47('\uf00e'),
        wic_yahoo_3200('\uf077'),
        wic_forecast_io_clear_day('\uf00d'),
        wic_forecast_io_clear_night('\uf02e'),
        wic_forecast_io_rain('\uf019'),
        wic_forecast_io_snow('\uf01b'),
        wic_forecast_io_sleet('\uf0b5'),
        wic_forecast_io_wind('\uf050'),
        wic_forecast_io_fog('\uf014'),
        wic_forecast_io_cloudy('\uf013'),
        wic_forecast_io_partly_cloudy_day('\uf002'),
        wic_forecast_io_partly_cloudy_night('\uf031'),
        wic_forecast_io_hail('\uf015'),
        wic_forecast_io_thunderstorm('\uf01e'),
        wic_forecast_io_tornado('\uf056'),
        wic_wmo4680_0('\uf055'),
        wic_wmo4680_00('\uf055'),
        wic_wmo4680_1('\uf013'),
        wic_wmo4680_01('\uf013'),
        wic_wmo4680_2('\uf055'),
        wic_wmo4680_02('\uf055'),
        wic_wmo4680_3('\uf013'),
        wic_wmo4680_03('\uf013'),
        wic_wmo4680_4('\uf014'),
        wic_wmo4680_04('\uf014'),
        wic_wmo4680_5('\uf014'),
        wic_wmo4680_05('\uf014'),
        wic_wmo4680_10('\uf014'),
        wic_wmo4680_11('\uf014'),
        wic_wmo4680_12('\uf016'),
        wic_wmo4680_18('\uf050'),
        wic_wmo4680_20('\uf014'),
        wic_wmo4680_21('\uf017'),
        wic_wmo4680_22('\uf017'),
        wic_wmo4680_23('\uf019'),
        wic_wmo4680_24('\uf01b'),
        wic_wmo4680_25('\uf015'),
        wic_wmo4680_26('\uf01e'),
        wic_wmo4680_27('\uf063'),
        wic_wmo4680_28('\uf063'),
        wic_wmo4680_29('\uf063'),
        wic_wmo4680_30('\uf014'),
        wic_wmo4680_31('\uf014'),
        wic_wmo4680_32('\uf014'),
        wic_wmo4680_33('\uf014'),
        wic_wmo4680_34('\uf014'),
        wic_wmo4680_35('\uf014'),
        wic_wmo4680_40('\uf017'),
        wic_wmo4680_41('\uf01c'),
        wic_wmo4680_42('\uf019'),
        wic_wmo4680_43('\uf01c'),
        wic_wmo4680_44('\uf019'),
        wic_wmo4680_45('\uf015'),
        wic_wmo4680_46('\uf015'),
        wic_wmo4680_47('\uf01b'),
        wic_wmo4680_48('\uf01b'),
        wic_wmo4680_50('\uf01c'),
        wic_wmo4680_51('\uf01c'),
        wic_wmo4680_52('\uf019'),
        wic_wmo4680_53('\uf019'),
        wic_wmo4680_54('\uf076'),
        wic_wmo4680_55('\uf076'),
        wic_wmo4680_56('\uf076'),
        wic_wmo4680_57('\uf01c'),
        wic_wmo4680_58('\uf019'),
        wic_wmo4680_60('\uf01c'),
        wic_wmo4680_61('\uf01c'),
        wic_wmo4680_62('\uf019'),
        wic_wmo4680_63('\uf019'),
        wic_wmo4680_64('\uf015'),
        wic_wmo4680_65('\uf015'),
        wic_wmo4680_66('\uf015'),
        wic_wmo4680_67('\uf017'),
        wic_wmo4680_68('\uf017'),
        wic_wmo4680_70('\uf01b'),
        wic_wmo4680_71('\uf01b'),
        wic_wmo4680_72('\uf01b'),
        wic_wmo4680_73('\uf01b'),
        wic_wmo4680_74('\uf076'),
        wic_wmo4680_75('\uf076'),
        wic_wmo4680_76('\uf076'),
        wic_wmo4680_77('\uf01b'),
        wic_wmo4680_78('\uf076'),
        wic_wmo4680_80('\uf019'),
        wic_wmo4680_81('\uf01c'),
        wic_wmo4680_82('\uf019'),
        wic_wmo4680_83('\uf019'),
        wic_wmo4680_84('\uf01d'),
        wic_wmo4680_85('\uf017'),
        wic_wmo4680_86('\uf017'),
        wic_wmo4680_87('\uf017'),
        wic_wmo4680_89('\uf015'),
        wic_wmo4680_90('\uf016'),
        wic_wmo4680_91('\uf01d'),
        wic_wmo4680_92('\uf01e'),
        wic_wmo4680_93('\uf01e'),
        wic_wmo4680_94('\uf016'),
        wic_wmo4680_95('\uf01e'),
        wic_wmo4680_96('\uf01e'),
        wic_wmo4680_99('\uf056'),
        wic_owm_200('\uf01e'),
        wic_owm_201('\uf01e'),
        wic_owm_202('\uf01e'),
        wic_owm_210('\uf016'),
        wic_owm_211('\uf016'),
        wic_owm_212('\uf016'),
        wic_owm_221('\uf016'),
        wic_owm_230('\uf01e'),
        wic_owm_231('\uf01e'),
        wic_owm_232('\uf01e'),
        wic_owm_300('\uf01c'),
        wic_owm_301('\uf01c'),
        wic_owm_302('\uf019'),
        wic_owm_310('\uf017'),
        wic_owm_311('\uf019'),
        wic_owm_312('\uf019'),
        wic_owm_313('\uf01a'),
        wic_owm_314('\uf019'),
        wic_owm_321('\uf01c'),
        wic_owm_500('\uf01c'),
        wic_owm_501('\uf019'),
        wic_owm_502('\uf019'),
        wic_owm_503('\uf019'),
        wic_owm_504('\uf019'),
        wic_owm_511('\uf017'),
        wic_owm_520('\uf01a'),
        wic_owm_521('\uf01a'),
        wic_owm_522('\uf01a'),
        wic_owm_531('\uf01d'),
        wic_owm_600('\uf01b'),
        wic_owm_601('\uf01b'),
        wic_owm_602('\uf0b5'),
        wic_owm_611('\uf017'),
        wic_owm_612('\uf017'),
        wic_owm_615('\uf017'),
        wic_owm_616('\uf017'),
        wic_owm_620('\uf017'),
        wic_owm_621('\uf01b'),
        wic_owm_622('\uf01b'),
        wic_owm_701('\uf01a'),
        wic_owm_711('\uf062'),
        wic_owm_721('\uf0b6'),
        wic_owm_731('\uf063'),
        wic_owm_741('\uf014'),
        wic_owm_761('\uf063'),
        wic_owm_762('\uf063'),
        wic_owm_771('\uf011'),
        wic_owm_781('\uf056'),
        wic_owm_800('\uf00d'),
        wic_owm_801('\uf011'),
        wic_owm_802('\uf011'),
        wic_owm_803('\uf012'),
        wic_owm_804('\uf013'),
        wic_owm_900('\uf056'),
        wic_owm_901('\uf01d'),
        wic_owm_902('\uf073'),
        wic_owm_903('\uf076'),
        wic_owm_904('\uf072'),
        wic_owm_905('\uf021'),
        wic_owm_906('\uf015'),
        wic_owm_957('\uf050'),
        wic_owm_day_200('\uf010'),
        wic_owm_day_201('\uf010'),
        wic_owm_day_202('\uf010'),
        wic_owm_day_210('\uf005'),
        wic_owm_day_211('\uf005'),
        wic_owm_day_212('\uf005'),
        wic_owm_day_221('\uf005'),
        wic_owm_day_230('\uf010'),
        wic_owm_day_231('\uf010'),
        wic_owm_day_232('\uf010'),
        wic_owm_day_300('\uf00b'),
        wic_owm_day_301('\uf00b'),
        wic_owm_day_302('\uf008'),
        wic_owm_day_310('\uf008'),
        wic_owm_day_311('\uf008'),
        wic_owm_day_312('\uf008'),
        wic_owm_day_313('\uf008'),
        wic_owm_day_314('\uf008'),
        wic_owm_day_321('\uf00b'),
        wic_owm_day_500('\uf00b'),
        wic_owm_day_501('\uf008'),
        wic_owm_day_502('\uf008'),
        wic_owm_day_503('\uf008'),
        wic_owm_day_504('\uf008'),
        wic_owm_day_511('\uf006'),
        wic_owm_day_520('\uf009'),
        wic_owm_day_521('\uf009'),
        wic_owm_day_522('\uf009'),
        wic_owm_day_531('\uf00e'),
        wic_owm_day_600('\uf00a'),
        wic_owm_day_601('\uf0b2'),
        wic_owm_day_602('\uf00a'),
        wic_owm_day_611('\uf006'),
        wic_owm_day_612('\uf006'),
        wic_owm_day_615('\uf006'),
        wic_owm_day_616('\uf006'),
        wic_owm_day_620('\uf006'),
        wic_owm_day_621('\uf00a'),
        wic_owm_day_622('\uf00a'),
        wic_owm_day_701('\uf009'),
        wic_owm_day_711('\uf062'),
        wic_owm_day_721('\uf0b6'),
        wic_owm_day_731('\uf063'),
        wic_owm_day_741('\uf003'),
        wic_owm_day_761('\uf063'),
        wic_owm_day_762('\uf063'),
        wic_owm_day_781('\uf056'),
        wic_owm_day_800('\uf00d'),
        wic_owm_day_801('\uf000'),
        wic_owm_day_802('\uf000'),
        wic_owm_day_803('\uf000'),
        wic_owm_day_804('\uf00c'),
        wic_owm_day_900('\uf056'),
        wic_owm_day_902('\uf073'),
        wic_owm_day_903('\uf076'),
        wic_owm_day_904('\uf072'),
        wic_owm_day_906('\uf004'),
        wic_owm_day_957('\uf050'),
        wic_owm_night_200('\uf02d'),
        wic_owm_night_201('\uf02d'),
        wic_owm_night_202('\uf02d'),
        wic_owm_night_210('\uf025'),
        wic_owm_night_211('\uf025'),
        wic_owm_night_212('\uf025'),
        wic_owm_night_221('\uf025'),
        wic_owm_night_230('\uf02d'),
        wic_owm_night_231('\uf02d'),
        wic_owm_night_232('\uf02d'),
        wic_owm_night_300('\uf02b'),
        wic_owm_night_301('\uf02b'),
        wic_owm_night_302('\uf028'),
        wic_owm_night_310('\uf028'),
        wic_owm_night_311('\uf028'),
        wic_owm_night_312('\uf028'),
        wic_owm_night_313('\uf028'),
        wic_owm_night_314('\uf028'),
        wic_owm_night_321('\uf02b'),
        wic_owm_night_500('\uf02b'),
        wic_owm_night_501('\uf028'),
        wic_owm_night_502('\uf028'),
        wic_owm_night_503('\uf028'),
        wic_owm_night_504('\uf028'),
        wic_owm_night_511('\uf026'),
        wic_owm_night_520('\uf029'),
        wic_owm_night_521('\uf029'),
        wic_owm_night_522('\uf029'),
        wic_owm_night_531('\uf02c'),
        wic_owm_night_600('\uf02a'),
        wic_owm_night_601('\uf0b4'),
        wic_owm_night_602('\uf02a'),
        wic_owm_night_611('\uf026'),
        wic_owm_night_612('\uf026'),
        wic_owm_night_615('\uf026'),
        wic_owm_night_616('\uf026'),
        wic_owm_night_620('\uf026'),
        wic_owm_night_621('\uf02a'),
        wic_owm_night_622('\uf02a'),
        wic_owm_night_701('\uf029'),
        wic_owm_night_711('\uf062'),
        wic_owm_night_721('\uf0b6'),
        wic_owm_night_731('\uf063'),
        wic_owm_night_741('\uf04a'),
        wic_owm_night_761('\uf063'),
        wic_owm_night_762('\uf063'),
        wic_owm_night_781('\uf056'),
        wic_owm_night_800('\uf02e'),
        wic_owm_night_801('\uf022'),
        wic_owm_night_802('\uf022'),
        wic_owm_night_803('\uf022'),
        wic_owm_night_804('\uf086'),
        wic_owm_night_900('\uf056'),
        wic_owm_night_902('\uf073'),
        wic_owm_night_903('\uf076'),
        wic_owm_night_904('\uf072'),
        wic_owm_night_906('\uf024'),
        wic_owm_night_957('\uf050'),
        wic_wu_chanceflurries('\uf064'),
        wic_wu_chancerain('\uf019'),
        wic_wu_chancesleat('\uf0b5'),
        wic_wu_chancesnow('\uf01b'),
        wic_wu_chancetstorms('\uf01e'),
        wic_wu_clear('\uf00d'),
        wic_wu_cloudy('\uf002'),
        wic_wu_flurries('\uf064'),
        wic_wu_hazy('\uf0b6'),
        wic_wu_mostlycloudy('\uf002'),
        wic_wu_mostlysunny('\uf00d'),
        wic_wu_partlycloudy('\uf002'),
        wic_wu_partlysunny('\uf00d'),
        wic_wu_rain('\uf01a'),
        wic_wu_sleat('\uf0b5'),
        wic_wu_snow('\uf01b'),
        wic_wu_sunny('\uf00d'),
        wic_wu_tstorms('\uf01e'),
        wic_wu_unknown('\uf00d');

        char character;

        Icon(char character) {
            this.character = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return character;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface typeface;

        public ITypeface getTypeface() {
            if (typeface == null) {
                typeface = new WeatherIcons();
            }
            return typeface;
        }
    }
}
