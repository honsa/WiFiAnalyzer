/*
 *    Copyright (C) 2015 - 2016 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.vrem.wifianalyzer.wifi.band;

import android.support.annotation.NonNull;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WiFiChannelCountry {
        static final String UNKNOWN = "Unknown country";
        static final List<Integer> DEFAULT_CHANNELS_GHZ_2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        static final List<Integer> DEFAULT_CHANNELS_GHZ_5 = Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64);

    private static final WiFiChannelCountry[] COUNTRY_CHANNELS = new WiFiChannelCountry[]{
            new WiFiChannelCountry("AE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "United Arab Emirates"),
            new WiFiChannelCountry("AG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Antigua and Barbuda"),
            new WiFiChannelCountry("AN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Netherlands Antilles"),
            new WiFiChannelCountry("AR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Argentina"),
            new WiFiChannelCountry("AS",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "American Samoa"),
            new WiFiChannelCountry("AT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Austria"),
            new WiFiChannelCountry("AU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Australia"),
            new WiFiChannelCountry("AW",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Aruba"),
            new WiFiChannelCountry("AZ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Azerbaijan"),
            new WiFiChannelCountry("BA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Bosnia"),
            new WiFiChannelCountry("BB",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Barbados"),
            new WiFiChannelCountry("BD",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161, 165),
                    "Bangladesh"),
            new WiFiChannelCountry("BE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Belgium"),
            new WiFiChannelCountry("BG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Bulgaria"),
            new WiFiChannelCountry("BH",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Bahrain"),
            new WiFiChannelCountry("BM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Bermuda"),
            new WiFiChannelCountry("BN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Brunei"),
            new WiFiChannelCountry("BO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Bolivia"),
            new WiFiChannelCountry("BR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Brazil"),
            new WiFiChannelCountry("BS",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Bahamas"),
            new WiFiChannelCountry("BT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Bhutan"),
            new WiFiChannelCountry("BY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Belarus"),
            new WiFiChannelCountry("CA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Canada"),
            new WiFiChannelCountry("CH",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Switzerland"),
            new WiFiChannelCountry("CL",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Chile"),
            new WiFiChannelCountry("CN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161, 165),
                    "China"),
            new WiFiChannelCountry("CO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Colombia"),
            new WiFiChannelCountry("CR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Costa Rica"),
            new WiFiChannelCountry("CU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161),
                    "Cuba"),
            new WiFiChannelCountry("CV",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Cape Verde"),
            new WiFiChannelCountry("CY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Cyprus"),
            new WiFiChannelCountry("CZ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Czech Republic"),
            new WiFiChannelCountry("DE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Germany"),
            new WiFiChannelCountry("DK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Denmark"),
            new WiFiChannelCountry("DM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Dominica"),
            new WiFiChannelCountry("DO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Dominican Republic"),
            new WiFiChannelCountry("EC",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Ecuador"),
            new WiFiChannelCountry("EE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Estonia"),
            new WiFiChannelCountry("EG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Egypt"),
            new WiFiChannelCountry("ES",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Spain"),
            new WiFiChannelCountry("FI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Finland"),
            new WiFiChannelCountry("FK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Falkland Islands"),
            new WiFiChannelCountry("FM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Federated States of Micronesia"),
            new WiFiChannelCountry("FR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "France"),
            new WiFiChannelCountry("GB",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "United Kingdom"),
            new WiFiChannelCountry("GF",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "French Guiana"),
            new WiFiChannelCountry("GG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Guernsey"),
            new WiFiChannelCountry("GI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Gibralter"),
            new WiFiChannelCountry("GP",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Guadeloupe"),
            new WiFiChannelCountry("GR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Greece"),
            new WiFiChannelCountry("GT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Guatemala"),
            new WiFiChannelCountry("GU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Guam"),
            new WiFiChannelCountry("HK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Hong Kong"),
            new WiFiChannelCountry("HN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161, 165),
                    "Honduras"),
            new WiFiChannelCountry("HR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Croatia"),
            new WiFiChannelCountry("HT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Haiti"),
            new WiFiChannelCountry("HU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Hungary"),
            new WiFiChannelCountry("ID",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Indonesia"),
            new WiFiChannelCountry("IE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Ireland"),
            new WiFiChannelCountry("IL",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64),
                    "Israel"),
            new WiFiChannelCountry("IM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Isle of Man"),
            new WiFiChannelCountry("IN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "India"),
            new WiFiChannelCountry("IR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161),
                    "Iran"),
            new WiFiChannelCountry("IS",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Iceland"),
            new WiFiChannelCountry("IT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Italy"),
            new WiFiChannelCountry("JE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Jersey"),
            new WiFiChannelCountry("JM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161, 165),
                    "Jamaica"),
            new WiFiChannelCountry("JO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48),
                    "Jordan"),
            new WiFiChannelCountry("JP",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Japan"),
            new WiFiChannelCountry("KE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48),
                    "Kenya"),
            new WiFiChannelCountry("KI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Kiribati"),
            new WiFiChannelCountry("KR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161),
                    "Korea Republic"),
            new WiFiChannelCountry("KW",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Kuwait"),
            new WiFiChannelCountry("KY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Cayman Islands"),
            new WiFiChannelCountry("LA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "LAO People's Democratic Republic"),
            new WiFiChannelCountry("LB",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Lebanon"),
            new WiFiChannelCountry("LI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Liechtenstein"),
            new WiFiChannelCountry("LK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Sri Lanka"),
            new WiFiChannelCountry("LS",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Lesotho"),
            new WiFiChannelCountry("LT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Lithuania"),
            new WiFiChannelCountry("LU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Luxembourg"),
            new WiFiChannelCountry("LV",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Latvia"),
            new WiFiChannelCountry("MA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48),
                    "Morocco"),
            new WiFiChannelCountry("MC",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64),
                    "Monaco"),
            new WiFiChannelCountry("MK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Macedonia"),
            new WiFiChannelCountry("MO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161),
                    "Macao"),
            new WiFiChannelCountry("MP",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Northern Mariana Islands"),
            new WiFiChannelCountry("MQ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Martinique"),
            new WiFiChannelCountry("MR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Mauritania"),
            new WiFiChannelCountry("MT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Malta"),
            new WiFiChannelCountry("MU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Mauritius"),
            new WiFiChannelCountry("MV",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Maldives"),
            new WiFiChannelCountry("MW",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Malawi"),
            new WiFiChannelCountry("MX",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64),
                    "Mexico"),
            new WiFiChannelCountry("MY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Malaysia"),
            new WiFiChannelCountry("NG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Nigeria"),
            new WiFiChannelCountry("NI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Nicaragua"),
            new WiFiChannelCountry("NL",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Netherlands"),
            new WiFiChannelCountry("NO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Norway"),
            new WiFiChannelCountry("NZ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "New Zealand"),
            new WiFiChannelCountry("OM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Oman"),
            new WiFiChannelCountry("PA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Panama"),
            new WiFiChannelCountry("PE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Peru"),
            new WiFiChannelCountry("PG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Papua New Guinea"),
            new WiFiChannelCountry("PH",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Philippines"),
            new WiFiChannelCountry("PK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161, 165),
                    "Pakistan"),
            new WiFiChannelCountry("PL",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Poland"),
            new WiFiChannelCountry("PM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64),
                    "St. Pierre and Miquelon"),
            new WiFiChannelCountry("PR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Puerto Rico"),
            new WiFiChannelCountry("PT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Portugal"),
            new WiFiChannelCountry("RE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Reunion"),
            new WiFiChannelCountry("RO",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Romania"),
            new WiFiChannelCountry("RU",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Russia"),
            new WiFiChannelCountry("SA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161),
                    "Saudi Arabia"),
            new WiFiChannelCountry("SE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Sweden"),
            new WiFiChannelCountry("SG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Singapore"),
            new WiFiChannelCountry("SI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Slovenia"),
            new WiFiChannelCountry("SK",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Slovak Republic"),
            new WiFiChannelCountry("SV",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "El Salvador"),
            new WiFiChannelCountry("SY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161),
                    "Syria"),
            new WiFiChannelCountry("TH",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Thailand"),
            new WiFiChannelCountry("TJ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Tajikistan"),
            new WiFiChannelCountry("TN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Tunisia"),
            new WiFiChannelCountry("TR",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 132, 136, 140),
                    "Turkey"),
            new WiFiChannelCountry("TT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Trinidad & Tobago"),
            new WiFiChannelCountry("TW",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 56, 60, 64, 149, 153, 157, 161, 165),
                    new ArrayList<Integer>(),
                    "Taiwan"),
            new WiFiChannelCountry("TZ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(149, 153, 157, 161),
                    "Tanzania"),
            new WiFiChannelCountry("UA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Ukraine"),
            new WiFiChannelCountry("UM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "United States (Minor Outlying Islands)"),
            new WiFiChannelCountry("US",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "United States"),
            new WiFiChannelCountry("UY",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Uruguay"),
            new WiFiChannelCountry("UZ",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Uzbekistan"),
            new WiFiChannelCountry("VA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    new ArrayList<Integer>(),
                    "Holy See (Vatican City State)"),
            new WiFiChannelCountry("VE",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Venezuela"),
            new WiFiChannelCountry("VG",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Virgin Islands (British)"),
            new WiFiChannelCountry("VI",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 149, 153, 157, 161, 165),
                    "Virgin Islands (United States)"),
            new WiFiChannelCountry("VN",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 149, 153, 157, 161, 165),
                    "Vietnam"),
            new WiFiChannelCountry("YT",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Mayotte"),
            new WiFiChannelCountry("ZA",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "South Africa"),
            new WiFiChannelCountry("ZM",
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                    Arrays.asList(36, 40, 44, 48, 52, 56, 60, 64, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140),
                    "Zambia")
    };

    private final String countryCode;
    private final String countryName;
    private final List<Integer> channelsGHZ_2;
    private final List<Integer> channelsGHZ_5;

    private WiFiChannelCountry() {
            countryCode = StringUtils.EMPTY;
            countryName = "Unknown";
            channelsGHZ_2 = DEFAULT_CHANNELS_GHZ_2;
            channelsGHZ_5 = DEFAULT_CHANNELS_GHZ_5;
    }

    private WiFiChannelCountry(@NonNull String countryCode, @NonNull List<Integer> channelsGHZ_2, List<Integer> channelsGHZ_5, @NonNull String countryName) {
        this.countryCode = countryCode;
        this.channelsGHZ_2 = channelsGHZ_2;
        this.channelsGHZ_5 = channelsGHZ_5.isEmpty() ? DEFAULT_CHANNELS_GHZ_5 : channelsGHZ_5;
        this.countryName = countryName;
    }

        public static WiFiChannelCountry find(@NonNull String countryCode) {
        for (WiFiChannelCountry wiFiChannelCountry : COUNTRY_CHANNELS) {
                if (wiFiChannelCountry.getCountryCode().equalsIgnoreCase(countryCode)) {
                return wiFiChannelCountry;
            }
        }
                return new WiFiChannelCountry(countryCode, DEFAULT_CHANNELS_GHZ_2, DEFAULT_CHANNELS_GHZ_5, UNKNOWN);
    }

        public static List<WiFiChannelCountry> getAll() {
                return Collections.unmodifiableList(Arrays.asList(COUNTRY_CHANNELS));
        }

        public String getCountryCode() {
        return countryCode;
    }

        public String getCountryName() {
        return countryName;
    }

        public List<Integer> getChannelsGHZ_2() {
        return Collections.unmodifiableList(channelsGHZ_2);
    }

        public List<Integer> getChannelsGHZ_5() {
        return Collections.unmodifiableList(channelsGHZ_5);
    }

    boolean isChannelAvailableGHZ_2(int channel) {
        return channelsGHZ_2.contains(channel);
    }

    boolean isChannelAvailableGHZ_5(int channel) {
        return channelsGHZ_5.contains(channel);
    }
}
