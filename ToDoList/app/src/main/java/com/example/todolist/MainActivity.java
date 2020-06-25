package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1 , checkBox2 , checkBox3 , checkBox4 , checkBox5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);

    }

    public void btnsubmit(View view) {
        StringBuffer toppings = new StringBuffer();
        if(checkBox1.isChecked()){
            toppings.append("List1 : "+getString(R.string.listening)+"\n");
        }
        if (checkBox2.isChecked()){
            toppings.append("List2 : "+getString(R.string.learning_android_development)+"\n");
        }
        if (checkBox3.isChecked()){
            toppings.append("List3 : "+getString(R.string.practice_english_language)+"\n");
        }
        if (checkBox4.isChecked()){
            toppings.append("List4 : "+getString(R.string.doing_to_improve_knowledge)+"\n");
        }
        if (checkBox5.isChecked()){
            toppings.append("List5 : "+getString(R.string.reading_book));
        }
        Toast.makeText(this , toppings ,Toast.LENGTH_SHORT).show();

    }

}