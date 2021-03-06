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
package com.github.shareme.greenandroid.fondation_icons_typeface;

import android.content.Context;
import android.graphics.Typeface;

import com.github.shareme.greenandroid.iconicscore.typeface.IIcon;
import com.github.shareme.greenandroid.iconicscore.typeface.ITypeface;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

@SuppressWarnings("unused")
public class FoundationIcons implements ITypeface {
    private static final String TTF_FILE = "foundation-icons-font-v3.0.0.1.ttf";
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
        return "fou";
    }

    @Override
    public String getFontName() {
        return "Foundation Icons";
    }

    @Override
    public String getVersion() {
        return "3.0.0.1";
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
        return "ZURB Inc.";
    }

    @Override
    public String getUrl() {
        return "http://zurb.com/playground/foundation-icon-fonts-3";
    }

    @Override
    public String getDescription() {
        return "Customize your icons to be any size, color, style in CSS";
    }

    @Override
    public String getLicense() {
        return "MIT Open Source License";
    }

    @Override
    public String getLicenseUrl() {
        return "https://github.com/zurb/foundation-icons/blob/master/MIT-LICENSE.txt";
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
        fou_address_book('\uf100'),
		fou_alert('\uf101'),
		fou_align_center('\uf102'),
		fou_align_justify('\uf103'),
		fou_align_left('\uf104'),
		fou_align_right('\uf105'),
		fou_anchor('\uf106'),
		fou_annotate('\uf107'),
		fou_archive('\uf108'),
		fou_arrow_down('\uf109'),
		fou_arrow_left('\uf10a'),
		fou_arrow_right('\uf10b'),
		fou_arrow_up('\uf10c'),
		fou_arrows_compress('\uf10d'),
		fou_arrows_expand('\uf10e'),
		fou_arrows_in('\uf10f'),
		fou_arrows_out('\uf110'),
		fou_asl('\uf111'),
		fou_asterisk('\uf112'),
		fou_at_sign('\uf113'),
		fou_background_color('\uf114'),
		fou_battery_empty('\uf115'),
		fou_battery_full('\uf116'),
		fou_battery_half('\uf117'),
		fou_bitcoin_circle('\uf118'),
		fou_bitcoin('\uf119'),
		fou_blind('\uf11a'),
		fou_bluetooth('\uf11b'),
		fou_bold('\uf11c'),
		fou_book_bookmark('\uf11d'),
		fou_book('\uf11e'),
		fou_bookmark('\uf11f'),
		fou_braille('\uf120'),
		fou_burst_new('\uf121'),
		fou_burst_sale('\uf122'),
		fou_burst('\uf123'),
		fou_calendar('\uf124'),
		fou_camera('\uf125'),
		fou_check('\uf126'),
		fou_checkbox('\uf127'),
		fou_clipboard_notes('\uf128'),
		fou_clipboard_pencil('\uf129'),
		fou_clipboard('\uf12a'),
		fou_clock('\uf12b'),
		fou_closed_caption('\uf12c'),
		fou_cloud('\uf12d'),
		fou_comment_minus('\uf12e'),
		fou_comment_quotes('\uf12f'),
		fou_comment_video('\uf130'),
		fou_comment('\uf131'),
		fou_comments('\uf132'),
		fou_compass('\uf133'),
		fou_contrast('\uf134'),
		fou_credit_card('\uf135'),
		fou_crop('\uf136'),
		fou_crown('\uf137'),
		fou_css3('\uf138'),
		fou_database('\uf139'),
		fou_die_five('\uf13a'),
		fou_die_four('\uf13b'),
		fou_die_one('\uf13c'),
		fou_die_six('\uf13d'),
		fou_die_three('\uf13e'),
		fou_die_two('\uf13f'),
		fou_dislike('\uf140'),
		fou_dollar_bill('\uf141'),
		fou_dollar('\uf142'),
		fou_download('\uf143'),
		fou_eject('\uf144'),
		fou_elevator('\uf145'),
		fou_euro('\uf146'),
		fou_eye('\uf147'),
		fou_fast_forward('\uf148'),
		fou_female_symbol('\uf149'),
		fou_female('\uf14a'),
		fou_filter('\uf14b'),
		fou_first_aid('\uf14c'),
		fou_flag('\uf14d'),
		fou_folder_add('\uf14e'),
		fou_folder_lock('\uf14f'),
		fou_folder('\uf150'),
		fou_foot('\uf151'),
		fou_foundation('\uf152'),
		fou_graph_bar('\uf153'),
		fou_graph_horizontal('\uf154'),
		fou_graph_pie('\uf155'),
		fou_graph_trend('\uf156'),
		fou_guide_dog('\uf157'),
		fou_hearing_aid('\uf158'),
		fou_heart('\uf159'),
		fou_home('\uf15a'),
		fou_html5('\uf15b'),
		fou_indent_less('\uf15c'),
		fou_indent_more('\uf15d'),
		fou_info('\uf15e'),
		fou_italic('\uf15f'),
		fou_key('\uf160'),
		fou_laptop('\uf161'),
		fou_layout('\uf162'),
		fou_lightbulb('\uf163'),
		fou_like('\uf164'),
		fou_link('\uf165'),
		fou_list_bullet('\uf166'),
		fou_list_number('\uf167'),
		fou_list_thumbnails('\uf168'),
		fou_list('\uf169'),
		fou_lock('\uf16a'),
		fou_loop('\uf16b'),
		fou_magnifying_glass('\uf16c'),
		fou_mail('\uf16d'),
		fou_male_female('\uf16e'),
		fou_male_symbol('\uf16f'),
		fou_male('\uf170'),
		fou_map('\uf171'),
		fou_marker('\uf172'),
		fou_megaphone('\uf173'),
		fou_microphone('\uf174'),
		fou_minus_circle('\uf175'),
		fou_minus('\uf176'),
		fou_mobile_signal('\uf177'),
		fou_mobile('\uf178'),
		fou_monitor('\uf179'),
		fou_mountains('\uf17a'),
		fou_music('\uf17b'),
		fou_next('\uf17c'),
		fou_no_dogs('\uf17d'),
		fou_no_smoking('\uf17e'),
		fou_page_add('\uf17f'),
		fou_page_copy('\uf180'),
		fou_page_csv('\uf181'),
		fou_page_delete('\uf182'),
		fou_page_doc('\uf183'),
		fou_page_edit('\uf184'),
		fou_page_export_csv('\uf185'),
		fou_page_export_doc('\uf186'),
		fou_page_export_pdf('\uf187'),
		fou_page_export('\uf188'),
		fou_page_filled('\uf189'),
		fou_page_multiple('\uf18a'),
		fou_page_pdf('\uf18b'),
		fou_page_remove('\uf18c'),
		fou_page_search('\uf18d'),
		fou_page('\uf18e'),
		fou_paint_bucket('\uf18f'),
		fou_paperclip('\uf190'),
		fou_pause('\uf191'),
		fou_paw('\uf192'),
		fou_paypal('\uf193'),
		fou_pencil('\uf194'),
		fou_photo('\uf195'),
		fou_play_circle('\uf196'),
		fou_play_video('\uf197'),
		fou_play('\uf198'),
		fou_plus('\uf199'),
		fou_pound('\uf19a'),
		fou_power('\uf19b'),
		fou_previous('\uf19c'),
		fou_price_tag('\uf19d'),
		fou_pricetag_multiple('\uf19e'),
		fou_print('\uf19f'),
		fou_prohibited('\uf1a0'),
		fou_projection_screen('\uf1a1'),
		fou_puzzle('\uf1a2'),
		fou_quote('\uf1a3'),
		fou_record('\uf1a4'),
		fou_refresh('\uf1a5'),
		fou_results_demographics('\uf1a6'),
		fou_results('\uf1a7'),
		fou_rewind_ten('\uf1a8'),
		fou_rewind('\uf1a9'),
		fou_rss('\uf1aa'),
		fou_safety_cone('\uf1ab'),
		fou_save('\uf1ac'),
		fou_share('\uf1ad'),
		fou_sheriff_badge('\uf1ae'),
		fou_shield('\uf1af'),
		fou_shopping_bag('\uf1b0'),
		fou_shopping_cart('\uf1b1'),
		fou_shuffle('\uf1b2'),
		fou_skull('\uf1b3'),
		fou_social_500px('\uf1b4'),
		fou_social_adobe('\uf1b5'),
		fou_social_amazon('\uf1b6'),
		fou_social_android('\uf1b7'),
		fou_social_apple('\uf1b8'),
		fou_social_behance('\uf1b9'),
		fou_social_bing('\uf1ba'),
		fou_social_blogger('\uf1bb'),
		fou_social_delicious('\uf1bc'),
		fou_social_designer_news('\uf1bd'),
		fou_social_deviant_art('\uf1be'),
		fou_social_digg('\uf1bf'),
		fou_social_dribbble('\uf1c0'),
		fou_social_drive('\uf1c1'),
		fou_social_dropbox('\uf1c2'),
		fou_social_evernote('\uf1c3'),
		fou_social_facebook('\uf1c4'),
		fou_social_flickr('\uf1c5'),
		fou_social_forrst('\uf1c6'),
		fou_social_foursquare('\uf1c7'),
		fou_social_game_center('\uf1c8'),
		fou_social_github('\uf1c9'),
		fou_social_google_plus('\uf1ca'),
		fou_social_hacker_news('\uf1cb'),
		fou_social_hi5('\uf1cc'),
		fou_social_instagram('\uf1cd'),
		fou_social_joomla('\uf1ce'),
		fou_social_lastfm('\uf1cf'),
		fou_social_linkedin('\uf1d0'),
		fou_social_medium('\uf1d1'),
		fou_social_myspace('\uf1d2'),
		fou_social_orkut('\uf1d3'),
		fou_social_path('\uf1d4'),
		fou_social_picasa('\uf1d5'),
		fou_social_pinterest('\uf1d6'),
		fou_social_rdio('\uf1d7'),
		fou_social_reddit('\uf1d8'),
		fou_social_skillshare('\uf1d9'),
		fou_social_skype('\uf1da'),
		fou_social_smashing_mag('\uf1db'),
		fou_social_snapchat('\uf1dc'),
		fou_social_spotify('\uf1dd'),
		fou_social_squidoo('\uf1de'),
		fou_social_stack_overflow('\uf1df'),
		fou_social_steam('\uf1e0'),
		fou_social_stumbleupon('\uf1e1'),
		fou_social_treehouse('\uf1e2'),
		fou_social_tumblr('\uf1e3'),
		fou_social_twitter('\uf1e4'),
		fou_social_vimeo('\uf1e5'),
		fou_social_windows('\uf1e6'),
		fou_social_xbox('\uf1e7'),
		fou_social_yahoo('\uf1e8'),
		fou_social_yelp('\uf1e9'),
		fou_social_youtube('\uf1ea'),
		fou_social_zerply('\uf1eb'),
		fou_social_zurb('\uf1ec'),
		fou_sound('\uf1ed'),
		fou_star('\uf1ee'),
		fou_stop('\uf1ef'),
		fou_strikethrough('\uf1f0'),
		fou_subscript('\uf1f1'),
		fou_superscript('\uf1f2'),
		fou_tablet_landscape('\uf1f3'),
		fou_tablet_portrait('\uf1f4'),
		fou_target_two('\uf1f5'),
		fou_target('\uf1f6'),
		fou_telephone_accessible('\uf1f7'),
		fou_telephone('\uf1f8'),
		fou_text_color('\uf1f9'),
		fou_thumbnails('\uf1fa'),
		fou_ticket('\uf1fb'),
		fou_torso_business('\uf1fc'),
		fou_torso_female('\uf1fd'),
		fou_torso('\uf1fe'),
		fou_torsos_all_female('\uf1ff'),
		fou_torsos_all('\uf200'),
		fou_torsos_female_male('\uf201'),
		fou_torsos_male_female('\uf202'),
		fou_torsos('\uf203'),
		fou_trash('\uf204'),
		fou_trees('\uf205'),
		fou_trophy('\uf206'),
		fou_underline('\uf207'),
		fou_universal_access('\uf208'),
		fou_unlink('\uf209'),
		fou_unlock('\uf20a'),
		fou_upload_cloud('\uf20b'),
		fou_upload('\uf20c'),
		fou_usb('\uf20d'),
		fou_video('\uf20e'),
		fou_volume_none('\uf20f'),
		fou_volume_strike('\uf210'),
		fou_volume('\uf211'),
		fou_web('\uf212'),
		fou_wheelchair('\uf213'),
		fou_widget('\uf214'),
		fou_wrench('\uf215'),
		fou_x_circle('\uf216'),
		fou_x('\uf217'),
		fou_yen('\uf218'),
		fou_zoom_in('\uf219'),
		fou_zoom_out('\uf21a');

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
                typeface = new FoundationIcons();
            }
            return typeface;
        }
    }
}
