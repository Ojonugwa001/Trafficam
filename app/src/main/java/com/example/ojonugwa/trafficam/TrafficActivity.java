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

        // Create an ArrayList of TrafficFeed objects
        ArrayList<TrafficFeeds> feeds = new ArrayList<>();
        feeds.add(new TrafficFeeds("Fact", "The term ~happily ever after~ was originally " +
                "used as happily until they died", R.drawable.baseline_traffic_white_48));

        feeds.add(new TrafficFeeds("Fact", "The term ~happily ever after~ was originally " +
                "used as happily until they died", R.drawable.default_image_thumbnail));

        feeds.add(new TrafficFeeds("Abi", "The term ~happily ever after~ was originally " +
                "used as happily until they died", R.drawable.sample_img));

        // Create an {@link TrafficAdapter}, whose data source is a list of
        // {@link TrafficFeed}s. The adapter knows how to create list item views for each item
        // in the list.
        TrafficAdapter itemsAdapter = new TrafficAdapter(this, feeds);

        // Get a reference to the ListView, and attach the adapter to the listView.
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
