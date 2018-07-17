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

        ArrayList<TrafficFeeds> feeds = new ArrayList<>();
        feeds.add(new TrafficFeeds("Fact", "The term ~happily ever after~ was orriginally " +
                "used as happily untily they died"));

        ArrayAdapter<TrafficFeeds> itemsAdapter =
                new ArrayAdapter<TrafficFeeds>(this, R.layout.list_item, feeds);

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
