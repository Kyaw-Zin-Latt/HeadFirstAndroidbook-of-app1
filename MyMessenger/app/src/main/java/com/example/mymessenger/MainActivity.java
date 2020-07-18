package com.example.mymessenger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Telephony;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ShareActionProvider;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private int second = 0;
    private boolean running ;
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //To save activity's current state
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            second = savedInstanceState.getInt("second");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");

        }
        runTimer();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("second" ,second);
        outState.putBoolean("running" ,running);
        outState.putBoolean("wasRunning" , wasRunning);
    }





    public void onClickStart(View view) {
        running = true;
    }

    public void onClickStop(View view) {
        running = false;
    }

    public void onClickReset(View view) {
        running = false;
        second = 0;
    }

    @Override
    protected void onPause() {
        super.onPause();
        //when stop || pause the app , stop second is increasing
       running = false;

    }

    @Override
    protected void onResume() {
        super.onResume();
            //when resume the app from stop || pause saturation , second increae from stop saturation.
            running = true;

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        
    }

    private void runTimer() {
        final TextView textView = (TextView)findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = second/3600;
                int minutes = (second%3600)/60;
                int secs = second%60;
                String time = String.format(Locale.getDefault(),"%d:%02d:%02d",hours,minutes,secs);
                textView.setText(time);
                if (running){
                    second++;
                }
                handler.postDelayed(this,1000);
            }
        });

    }
}