package com.example.ojonugwa.trafficam;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TrafficActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);

        ArrayList<String> feeds = new ArrayList<>();
        feeds.add("one");
        feeds.add("two");
        feeds.add("three");
        feeds.add("four");
        feeds.add("five");
        feeds.add("six");
        feeds.add("seven");
        feeds.add("eight");
        feeds.add("nine");
        feeds.add("ten");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, feeds);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        // Setup FAB to open EditorActivity
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrafficActivity.this, WatcherActivity.class);
                startActivity(intent);
            }
        });

    }
}
