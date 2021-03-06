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
package com.github.shareme.greenandroid.typeicons_typeface;

import android.content.Context;
import android.graphics.Typeface;

import com.github.shareme.greenandroid.iconicscore.typeface.IIcon;
import com.github.shareme.greenandroid.iconicscore.typeface.ITypeface;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

@SuppressWarnings("unused")
public class Typeicons implements ITypeface {
    private static final String TTF_FILE = "typeicons-font-v2.0.7.1.ttf";
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
        return "typ";
    }

    @Override
    public String getFontName() {
        return "Typeicons";
    }

    @Override
    public String getVersion() {
        return "2.0.7.1";
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
        return "Stephen Hutchings";
    }

    @Override
    public String getUrl() {
        return "http://typicons.com/";
    }

    @Override
    public String getDescription() {
        return "336 pixel perfect, all-purpose vector icons";
    }

    @Override
    public String getLicense() {
        return "SIL OPEN FONT LICENSE";
    }

    @Override
    public String getLicenseUrl() {
        return "http://scripts.sil.org/cms/scripts/page.php?item_id=OFL_web";
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
        typ_adjust_brightness('\ue000'),
        typ_adjust_contrast('\ue001'),
        typ_anchor_outline('\ue002'),
        typ_anchor('\ue003'),
        typ_archive('\ue004'),
        typ_arrow_back_outline('\ue005'),
        typ_arrow_back('\ue006'),
        typ_arrow_down_outline('\ue007'),
        typ_arrow_down_thick('\ue008'),
        typ_arrow_down('\ue009'),
        typ_arrow_forward_outline('\ue00a'),
        typ_arrow_forward('\ue00b'),
        typ_arrow_left_outline('\ue00c'),
        typ_arrow_left_thick('\ue00d'),
        typ_arrow_left('\ue00e'),
        typ_arrow_loop_outline('\ue00f'),
        typ_arrow_loop('\ue010'),
        typ_arrow_maximise_outline('\ue011'),
        typ_arrow_maximise('\ue012'),
        typ_arrow_minimise_outline('\ue013'),
        typ_arrow_minimise('\ue014'),
        typ_arrow_move_outline('\ue015'),
        typ_arrow_move('\ue016'),
        typ_arrow_repeat_outline('\ue017'),
        typ_arrow_repeat('\ue018'),
        typ_arrow_right_outline('\ue019'),
        typ_arrow_right_thick('\ue01a'),
        typ_arrow_right('\ue01b'),
        typ_arrow_shuffle('\ue01c'),
        typ_arrow_sorted_down('\ue01d'),
        typ_arrow_sorted_up('\ue01e'),
        typ_arrow_sync_outline('\ue01f'),
        typ_arrow_sync('\ue020'),
        typ_arrow_unsorted('\ue021'),
        typ_arrow_up_outline('\ue022'),
        typ_arrow_up_thick('\ue023'),
        typ_arrow_up('\ue024'),
        typ_at('\ue025'),
        typ_attachment_outline('\ue026'),
        typ_attachment('\ue027'),
        typ_backspace_outline('\ue028'),
        typ_backspace('\ue029'),
        typ_battery_charge('\ue02a'),
        typ_battery_full('\ue02b'),
        typ_battery_high('\ue02c'),
        typ_battery_low('\ue02d'),
        typ_battery_mid('\ue02e'),
        typ_beaker('\ue02f'),
        typ_beer('\ue030'),
        typ_bell('\ue031'),
        typ_book('\ue032'),
        typ_bookmark('\ue033'),
        typ_briefcase('\ue034'),
        typ_brush('\ue035'),
        typ_business_card('\ue036'),
        typ_calculator('\ue037'),
        typ_calendar_outline('\ue038'),
        typ_calendar('\ue039'),
        typ_camera_outline('\ue03a'),
        typ_camera('\ue03b'),
        typ_cancel_outline('\ue03c'),
        typ_cancel('\ue03d'),
        typ_chart_area_outline('\ue03e'),
        typ_chart_area('\ue03f'),
        typ_chart_bar_outline('\ue040'),
        typ_chart_bar('\ue041'),
        typ_chart_line_outline('\ue042'),
        typ_chart_line('\ue043'),
        typ_chart_pie_outline('\ue044'),
        typ_chart_pie('\ue045'),
        typ_chevron_left_outline('\ue046'),
        typ_chevron_left('\ue047'),
        typ_chevron_right_outline('\ue048'),
        typ_chevron_right('\ue049'),
        typ_clipboard('\ue04a'),
        typ_cloud_storage('\ue04b'),
        typ_cloud_storage_outline('\ue054'),
        typ_code_outline('\ue04c'),
        typ_code('\ue04d'),
        typ_coffee('\ue04e'),
        typ_cog_outline('\ue04f'),
        typ_cog('\ue050'),
        typ_compass('\ue051'),
        typ_contacts('\ue052'),
        typ_credit_card('\ue053'),
        typ_css3('\ue055'),
        typ_database('\ue056'),
        typ_delete_outline('\ue057'),
        typ_delete('\ue058'),
        typ_device_desktop('\ue059'),
        typ_device_laptop('\ue05a'),
        typ_device_phone('\ue05b'),
        typ_device_tablet('\ue05c'),
        typ_directions('\ue05d'),
        typ_divide_outline('\ue05e'),
        typ_divide('\ue05f'),
        typ_document_add('\ue060'),
        typ_document_delete('\ue061'),
        typ_document_text('\ue062'),
        typ_document('\ue063'),
        typ_download_outline('\ue064'),
        typ_download('\ue065'),
        typ_dropbox('\ue066'),
        typ_edit('\ue067'),
        typ_eject_outline('\ue068'),
        typ_eject('\ue069'),
        typ_equals_outline('\ue06a'),
        typ_equals('\ue06b'),
        typ_export_outline('\ue06c'),
        typ_export('\ue06d'),
        typ_eye_outline('\ue06e'),
        typ_eye('\ue06f'),
        typ_feather('\ue070'),
        typ_film('\ue071'),
        typ_filter('\ue072'),
        typ_flag_outline('\ue073'),
        typ_flag('\ue074'),
        typ_flash_outline('\ue075'),
        typ_flash('\ue076'),
        typ_flow_children('\ue077'),
        typ_flow_merge('\ue078'),
        typ_flow_parallel('\ue079'),
        typ_flow_switch('\ue07a'),
        typ_folder_add('\ue07b'),
        typ_folder_delete('\ue07c'),
        typ_folder_open('\ue07d'),
        typ_folder('\ue07e'),
        typ_gift('\ue07f'),
        typ_globe_outline('\ue080'),
        typ_globe('\ue081'),
        typ_group_outline('\ue082'),
        typ_group('\ue083'),
        typ_headphones('\ue084'),
        typ_heart_full_outline('\ue085'),
        typ_heart_half_outline('\ue086'),
        typ_heart_outline('\ue087'),
        typ_heart('\ue088'),
        typ_home_outline('\ue089'),
        typ_home('\ue08a'),
        typ_html5('\ue08b'),
        typ_image_outline('\ue08c'),
        typ_image('\ue08d'),
        typ_infinity_outline('\ue08e'),
        typ_infinity('\ue08f'),
        typ_info_large_outline('\ue090'),
        typ_info_large('\ue091'),
        typ_info_outline('\ue092'),
        typ_info('\ue093'),
        typ_input_checked_outline('\ue094'),
        typ_input_checked('\ue095'),
        typ_key_outline('\ue096'),
        typ_key('\ue097'),
        typ_keyboard('\ue098'),
        typ_leaf('\ue099'),
        typ_lightbulb('\ue09a'),
        typ_link_outline('\ue09b'),
        typ_link('\ue09c'),
        typ_location_arrow_outline('\ue09d'),
        typ_location_arrow('\ue09e'),
        typ_location_outline('\ue09f'),
        typ_location('\ue0a0'),
        typ_lock_closed_outline('\ue0a1'),
        typ_lock_closed('\ue0a2'),
        typ_lock_open_outline('\ue0a3'),
        typ_lock_open('\ue0a4'),
        typ_mail('\ue0a5'),
        typ_map('\ue0a6'),
        typ_media_eject_outline('\ue0a7'),
        typ_media_eject('\ue0a8'),
        typ_media_fast_forward_outline('\ue0a9'),
        typ_media_fast_forward('\ue0aa'),
        typ_media_pause_outline('\ue0ab'),
        typ_media_pause('\ue0ac'),
        typ_media_play_outline('\ue0ad'),
        typ_media_play_reverse_outline('\ue0ae'),
        typ_media_play_reverse('\ue0af'),
        typ_media_play('\ue0b0'),
        typ_media_record_outline('\ue0b1'),
        typ_media_record('\ue0b2'),
        typ_media_rewind_outline('\ue0b3'),
        typ_media_rewind('\ue0b4'),
        typ_media_stop_outline('\ue0b5'),
        typ_media_stop('\ue0b6'),
        typ_message_typing('\ue0b7'),
        typ_message('\ue0b8'),
        typ_messages('\ue0b9'),
        typ_microphone_outline('\ue0ba'),
        typ_microphone('\ue0bb'),
        typ_minus_outline('\ue0bc'),
        typ_minus('\ue0bd'),
        typ_mortar_board('\ue0be'),
        typ_news('\ue0bf'),
        typ_notes_outline('\ue0c0'),
        typ_notes('\ue0c1'),
        typ_pen('\ue0c2'),
        typ_pencil('\ue0c3'),
        typ_phone_outline('\ue0c4'),
        typ_phone('\ue0c5'),
        typ_pi_outline('\ue0c6'),
        typ_pi('\ue0c7'),
        typ_pin_outline('\ue0c8'),
        typ_pin('\ue0c9'),
        typ_pipette('\ue0ca'),
        typ_plane_outline('\ue0cb'),
        typ_plane('\ue0cc'),
        typ_plug('\ue0cd'),
        typ_plus_outline('\ue0ce'),
        typ_plus('\ue0cf'),
        typ_point_of_interest_outline('\ue0d0'),
        typ_point_of_interest('\ue0d1'),
        typ_power_outline('\ue0d2'),
        typ_power('\ue0d3'),
        typ_printer('\ue0d4'),
        typ_puzzle_outline('\ue0d5'),
        typ_puzzle('\ue0d6'),
        typ_radar_outline('\ue0d7'),
        typ_radar('\ue0d8'),
        typ_refresh_outline('\ue0d9'),
        typ_refresh('\ue0da'),
        typ_rss_outline('\ue0db'),
        typ_rss('\ue0dc'),
        typ_scissors_outline('\ue0dd'),
        typ_scissors('\ue0de'),
        typ_shopping_bag('\ue0df'),
        typ_shopping_cart('\ue0e0'),
        typ_social_at_circular('\ue0e1'),
        typ_social_dribbble_circular('\ue0e2'),
        typ_social_dribbble('\ue0e3'),
        typ_social_facebook_circular('\ue0e4'),
        typ_social_facebook('\ue0e5'),
        typ_social_flickr_circular('\ue0e6'),
        typ_social_flickr('\ue0e7'),
        typ_social_github_circular('\ue0e8'),
        typ_social_github('\ue0e9'),
        typ_social_google_plus_circular('\ue0ea'),
        typ_social_google_plus('\ue0eb'),
        typ_social_instagram_circular('\ue0ec'),
        typ_social_instagram('\ue0ed'),
        typ_social_last_fm_circular('\ue0ee'),
        typ_social_last_fm('\ue0ef'),
        typ_social_linkedin_circular('\ue0f0'),
        typ_social_linkedin('\ue0f1'),
        typ_social_pinterest_circular('\ue0f2'),
        typ_social_pinterest('\ue0f3'),
        typ_social_skype_outline('\ue0f4'),
        typ_social_skype('\ue0f5'),
        typ_social_tumbler_circular('\ue0f6'),
        typ_social_tumbler('\ue0f7'),
        typ_social_twitter_circular('\ue0f8'),
        typ_social_twitter('\ue0f9'),
        typ_social_vimeo_circular('\ue0fa'),
        typ_social_vimeo('\ue0fb'),
        typ_social_youtube_circular('\ue0fc'),
        typ_social_youtube('\ue0fd'),
        typ_sort_alphabetically_outline('\ue0fe'),
        typ_sort_alphabetically('\ue0ff'),
        typ_sort_numerically_outline('\ue100'),
        typ_sort_numerically('\ue101'),
        typ_spanner_outline('\ue102'),
        typ_spanner('\ue103'),
        typ_spiral('\ue104'),
        typ_star_full_outline('\ue105'),
        typ_star_half_outline('\ue106'),
        typ_star_half('\ue107'),
        typ_star_outline('\ue108'),
        typ_star('\ue109'),
        typ_starburst_outline('\ue10a'),
        typ_starburst('\ue10b'),
        typ_stopwatch('\ue10c'),
        typ_support('\ue10d'),
        typ_tabs_outline('\ue10e'),
        typ_tag('\ue10f'),
        typ_tags('\ue110'),
        typ_th_large_outline('\ue111'),
        typ_th_large('\ue112'),
        typ_th_list_outline('\ue113'),
        typ_th_list('\ue114'),
        typ_th_menu_outline('\ue115'),
        typ_th_menu('\ue116'),
        typ_th_small_outline('\ue117'),
        typ_th_small('\ue118'),
        typ_thermometer('\ue119'),
        typ_thumbs_down('\ue11a'),
        typ_thumbs_ok('\ue11b'),
        typ_thumbs_up('\ue11c'),
        typ_tick_outline('\ue11d'),
        typ_tick('\ue11e'),
        typ_ticket('\ue11f'),
        typ_time('\ue120'),
        typ_times_outline('\ue121'),
        typ_times('\ue122'),
        typ_trash('\ue123'),
        typ_tree('\ue124'),
        typ_upload_outline('\ue125'),
        typ_upload('\ue126'),
        typ_user_add_outline('\ue127'),
        typ_user_add('\ue128'),
        typ_user_delete_outline('\ue129'),
        typ_user_delete('\ue12a'),
        typ_user_outline('\ue12b'),
        typ_user('\ue12c'),
        typ_vendor_android('\ue12d'),
        typ_vendor_apple('\ue12e'),
        typ_vendor_microsoft('\ue12f'),
        typ_video_outline('\ue130'),
        typ_video('\ue131'),
        typ_volume_down('\ue132'),
        typ_volume_mute('\ue133'),
        typ_volume_up('\ue134'),
        typ_volume('\ue135'),
        typ_warning_outline('\ue136'),
        typ_warning('\ue137'),
        typ_watch('\ue138'),
        typ_waves_outline('\ue139'),
        typ_waves('\ue13a'),
        typ_weather_cloudy('\ue13b'),
        typ_weather_downpour('\ue13c'),
        typ_weather_night('\ue13d'),
        typ_weather_partly_sunny('\ue13e'),
        typ_weather_shower('\ue13f'),
        typ_weather_snow('\ue140'),
        typ_weather_stormy('\ue141'),
        typ_weather_sunny('\ue142'),
        typ_weather_windy_cloudy('\ue143'),
        typ_weather_windy('\ue144'),
        typ_wi_fi_outline('\ue145'),
        typ_wi_fi('\ue146'),
        typ_wine('\ue147'),
        typ_world_outline('\ue148'),
        typ_world('\ue149'),
        typ_zoom_in_outline('\ue14a'),
        typ_zoom_in('\ue14b'),
        typ_zoom_out_outline('\ue14c'),
        typ_zoom_out('\ue14d'),
        typ_zoom_outline('\ue14e'),
        typ_zoom('\ue14f');

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
                typeface = new Typeicons();
            }
            return typeface;
        }
    }
}
