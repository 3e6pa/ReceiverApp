package com.example.victorapp;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;

public class BootCompletedReceiver extends BroadcastReceiver {

    private static final String TAG = "MYAPP";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Toast toast = Toast.makeText(context.getApplicationContext(),
                    "LAUNCHING", Toast.LENGTH_LONG);
            toast.show();
            Log.d(TAG, "LAUNCHING");
        }
    }
}