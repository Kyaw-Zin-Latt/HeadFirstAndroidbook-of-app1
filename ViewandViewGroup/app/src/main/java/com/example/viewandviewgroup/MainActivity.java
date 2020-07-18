package com.example.viewandviewgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        toggleButton = findViewById(R.id.toggleButton1);
//        aSwitch = findViewById(R.id.switch1);
//
//
//    }
//    public void displayToast(String message){
//        Toast.makeText(getApplicationContext() ,message, Toast.LENGTH_SHORT).show();
//    }
//    public void toast(View view){
//        Spinner spinner = (Spinner)findViewById(R.id.spinner);
//        String string = String.valueOf(spinner.getSelectedItem());
//        displayToast(string);
//    }
//
//
//    public void onToggleButtonClicked(View view) {
//        boolean on = toggleButton.isChecked();
//        if (on) {
//            displayToast("toggle1 was on");
//        }else {
//            displayToast("toggle1 was off" );
//
//        }
//    }
//
//    public void onSwitchClicked(View view) {
//        boolean on = aSwitch.isChecked();
//        if (on){
//           displayToast("switch was on");
//        }else {
//            displayToast("switch was off");
//        }
//    }
//
//    public void OnCheckClicked(View view) {
//        boolean checked = ((CheckBox)view).isChecked();
//        switch (view.getId()){
//            case R.id.checkBox1:
//               if (checked)
//                   displayToast("Milk was checked");
//               else
//                   displayToast("Milk was unchecked");
//                break;
//            case R.id.checkBox2:
//                if (checked)
//                    displayToast("Coffee was checked");
//                else
//                    displayToast("Coffee was unchecked");
//                break;
//        }
//    }
//
//    public void onRadioClicked(View view) {
//        boolean checked = ((RadioButton)view).isChecked();
//        if (checked){
//            displayToast("Radiobutton was checked");
//        }else {
//            displayToast("Radiobutton was unchecked");
//        }
    }




}