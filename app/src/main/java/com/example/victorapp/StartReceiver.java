package com.example.victorapp;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;

public class StartReceiver extends BroadcastReceiver {

    public StartReceiver() {

    }

    private static final String TAG = "KIOSK";

    public void onReceive(Context context, Intent intent) {
//        if ((intent.getAction().equals(Intent.ACTION_SCREEN_ON)) ||
//                (intent.getAction().equals(Intent.ACTION_SCREEN_ON))){
//            Toast toast = Toast.makeText(context.getApplicationContext(),
//                    "KIOSK ACTION_SCREEN_ON", Toast.LENGTH_LONG);
//            toast.show();
//            Log.d(TAG, "KIOSK ACTION_SCREEN_ON");
//            // ваш код здесь
//        }
        Intent launcher = new Intent();
        launcher.setClassName(context, "com.example.victorapp.MainActivity");
        launcher.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(launcher);
    }
}
