package com.example.ojonugwa.trafficam;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class TrafficActivity extends AppCompatActivity {

    // Completed (1) Create a private static final int called NUM_LIST_ITEMS and set it equal to 100
    private static final int NUM_LIST_ITEMS = 100;

    private TrafficAdapter mAdapter;
    private RecyclerView mTrafficList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);

        // Setup FAB to open EditorActivity
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrafficActivity.this, WatcherActivity.class);
                startActivity(intent);
            }
        });

        // Completed (4) Use findViewById to store a reference to the RecyclerView in mNumbersList
        mTrafficList = (RecyclerView) findViewById(R.id.rv_numbers);

        // Completed (5) Create a LinearLayoutManager variable called layoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        // Completed (6) Use setLayoutManager on mNumbersList with the LinearLayoutManager we created above
        mTrafficList.setLayoutManager(layoutManager);

        // Completed (7) Use setHasFixedSize(true) to designate that the contents of the RecyclerView won't change an item's size
        mTrafficList.setHasFixedSize(true);

        // Completed (8) Store a new GreenAdapter in mAdapter and pass it NUM_LIST_ITEMS
        mAdapter = new TrafficAdapter(NUM_LIST_ITEMS);

        // Completed (9) Set the GreenAdapter you created on mNumbersList
        mTrafficList.setAdapter(mAdapter);

    }
}
