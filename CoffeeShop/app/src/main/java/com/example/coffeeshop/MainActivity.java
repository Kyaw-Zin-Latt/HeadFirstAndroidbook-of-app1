package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView ;
    Button button1 , button2;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imgBattery);
        button1 = findViewById(R.id.btnIncrease);
        button2 = findViewById(R.id.btnDecrease);
    }

    public void increase(View view) {
        i++;
       switch (i){
           case 1:
               imageView.setImageLevel(1);
               break;
           case 2:
               imageView.setImageLevel(2);
               break;
           case 3:
               imageView.setImageLevel(3);
               break;
           case 4:
               imageView.setImageLevel(4);
               break;
       }

    }

    public void decrease(View view) {
       i--;

        switch (i){
            case 1:

                imageView.setImageLevel(1);
                break;
            case 2:
                imageView.setImageLevel(2);
                break;
            case 3:
                imageView.setImageLevel(3);
                break;
            case 4:
                imageView.setImageLevel(4);
                break;
        }

    }
}