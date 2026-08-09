/*
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.settings.fingerprint

import android.os.Bundle

import com.android.settingslib.widget.SettingsBasePreferenceFragment

import org.lineageos.settings.R

class FingerprintSettingsFragment : SettingsBasePreferenceFragment() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.fingerprint_preferences, rootKey)
    }
}