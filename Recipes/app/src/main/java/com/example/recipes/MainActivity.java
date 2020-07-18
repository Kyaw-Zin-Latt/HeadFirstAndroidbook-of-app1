package com.example.recipes;

import android.graphics.Movie;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.MotionEvent;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Flat White",R.drawable.ic_action_name),
                new MyListData("Flat Black", R.drawable.ic_action_name),
                new MyListData("Cappucino", R.drawable.ic_action_name),
                new MyListData("Latte", R.drawable.ic_action_name),
                new MyListData("Americano", R.drawable.ic_action_name),
                new MyListData("Cortado", R.drawable.ic_action_name),
                new MyListData("Espresso", R.drawable.ic_action_name),
                new MyListData("Macchiato", R.drawable.ic_action_name),
                new MyListData("Premium Filter Coffee", R.drawable.ic_action_name),
                new MyListData("Iced Latte", R.drawable.ic_action_name),
                new MyListData("Iced Mocha", R.drawable.ic_action_name),
                new MyListData("Iced Americano", R.drawable.ic_action_name),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        WordListAdapter adapter = new WordListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}