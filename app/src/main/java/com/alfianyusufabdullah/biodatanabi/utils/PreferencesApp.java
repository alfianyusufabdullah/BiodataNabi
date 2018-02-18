package com.alfianyusufabdullah.biodatanabi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by jonesrandom on 2/17/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class PreferencesApp {

    private static PreferencesApp preferencesApp;
    private static SharedPreferences sharedPreferences;

    private PreferencesApp(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void initPreferences(Context context) {
        if (preferencesApp == null) {
            preferencesApp = new PreferencesApp(context);
        }
    }

    public static boolean isFirstLaunch() {
        return sharedPreferences.getBoolean("LAUNCH", true);
    }

    public static void hasFirstLaunch() {
        sharedPreferences.edit().putBoolean("LAUNCH", false).apply();
    }

}
