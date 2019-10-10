package com.ayst.sample.items.other;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ScreenOffAdminReceiver extends DeviceAdminReceiver {
    private static final String TAG = "ScreenOffAdminReceiver";

    @Override
    public void onEnabled(Context context, Intent intent) {
        Log.d(TAG, "onEnabled");
    }
    @Override
    public void onDisabled(Context context, Intent intent) {
        Log.d(TAG, "onDisabled");
    }
}