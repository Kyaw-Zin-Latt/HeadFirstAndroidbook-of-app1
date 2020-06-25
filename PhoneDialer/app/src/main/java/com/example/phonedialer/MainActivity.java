package com.example.phonedialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.phone_text);
        if (editText != null){
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                    boolean handled = true;
                    if (actionId == EditorInfo.IME_ACTION_SEND){
                        String phone = null;
                        if (editText != null) phone = "tel:" +
                                editText.getText().toString();
//                        dialNumber();
                        handled = true;
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(phone));
                        startActivity(intent);
                    }
                    return handled;
                }
            });
        }

    }
//    private void dialNumber() {
//        // Find the editText_main view.
//        EditText editText = findViewById(R.id.phone_text);
//        String phoneNum = null;
//
//        // If the editText field is not null,
//        // concatenate "tel: " with the phone number string.
//        if (editText != null) phoneNum = "tel:" + editText.getText().toString();
//
//        // Log the concatenated phone number for dialing.
//        Log.d(TAG, "dialNumber: " + phoneNum);
//
//        // Specify the intent.
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//
//        // Set the data for the intent as the phone number.
//        intent.setData(Uri.parse(phoneNum));
//
//        // If the intent resolves to a package (app),
//        // start the activity with the intent.
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        } else {
//            Log.d(TAG, "ImplicitIntents: Can't handle this!");
//        }
//    }
}