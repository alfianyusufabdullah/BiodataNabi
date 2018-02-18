package com.alfianyusufabdullah.biodatanabi;

import android.app.Application;

import com.alfianyusufabdullah.biodatanabi.utils.PreferencesApp;

/**
 * Created by jonesrandom on 2/17/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PreferencesApp.initPreferences(this);
    }
}
