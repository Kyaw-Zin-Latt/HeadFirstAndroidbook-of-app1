package com.example.pickerfordate;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView ,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);
        textView1 = findViewById(R.id.textView3);
    }

    public void showDatePicker(View view) {
        DatePickerFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }
    public void processDatePickerResult(int year , int month , int day){
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string + "/" + day_string + "/" +year_string);
//        Toast.makeText(this , "Date :"+dateMessage ,Toast.LENGTH_SHORT).show();
        textView.setText(dateMessage);
    }

    public void showTimePicker(View view) {
        TimePickerFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),"timePicker");
    }
    public void processTimePickerResult(int hourOfDay , int minute){
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);

        String timeMessage = (hour_string + ":" + minute_string );
//        Toast.makeText(this , "Date :"+dateMessage ,Toast.LENGTH_SHORT).show();
        textView1.setText("\n"+timeMessage);
    }


}