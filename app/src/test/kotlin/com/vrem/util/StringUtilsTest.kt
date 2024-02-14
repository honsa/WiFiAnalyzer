/*
 * WiFiAnalyzer
 * Copyright (C) 2015 - 2024 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.vrem.util

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.Locale

class StringUtilsTest {

    @Test
    fun testSpecialTrim() {
        // setup
        val expected = "ABS ADF"
        val value = "    ABS    ADF    "
        // execute
        val actual: String = value.specialTrim()
        // verify
        assertEquals(expected, actual)
    }

    @Test
    fun testToCapitalize() {
        // setup
        val expected = "Value"
        val value = "value"
        // execute
        val actual: String = value.toCapitalize(Locale.US)
        // verify
        assertEquals(expected, actual)
    }

    @Test
    fun testNullToEmptyWhenNull() {
        // setup
        val expected = String.EMPTY
        val value = null
        // execute
        val actual: String = String.nullToEmpty(value)
        // verify
        assertEquals(expected, actual)
    }

    @Test
    fun testNullToEmpty() {
        // setup
        val expected = "value"
        val value = "value"
        // execute
        val actual: String = String.nullToEmpty(value)
        // verify
        assertEquals(expected, actual)
    }


}