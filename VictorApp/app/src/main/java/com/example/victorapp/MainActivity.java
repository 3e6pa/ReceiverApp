package com.example.victorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "KIOSK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ButtonClick(View view) {
        Toast toast = Toast.makeText(view.getContext(),
                "KIOSK LAUNCHING", Toast.LENGTH_LONG);
        toast.show();
    }
}
