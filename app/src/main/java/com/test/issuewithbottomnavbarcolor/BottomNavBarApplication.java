package com.test.issuewithbottomnavbarcolor;

import android.app.Application;

import com.google.android.material.color.DynamicColors;

public class BottomNavBarApplication extends Application {
    @Override
    public void onCreate() {
        DynamicColors.applyToActivitiesIfAvailable(this);
        super.onCreate();
    }
}