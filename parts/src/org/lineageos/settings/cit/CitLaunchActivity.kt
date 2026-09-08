/*
 * SPDX-FileCopyrightText: 2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.settings.cit

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class CitLaunchActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            startActivity(Intent().apply {
                component = ComponentName("com.miui.cit", "com.miui.cit.home.HomeActivity")
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            })
        } catch (e: Exception) {
            Log.e(TAG, "Failed to launch CIT", e)
            Toast.makeText(this, "CIT app not found", Toast.LENGTH_SHORT).show()
        }
        finish()
    }

    companion object {
        private const val TAG = "CitLaunchActivity"
    }
}