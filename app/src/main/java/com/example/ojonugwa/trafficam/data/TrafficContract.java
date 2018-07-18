package com.example.ojonugwa.trafficam.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Pets app.
 */
public final class TrafficContract {

    // Empty constructor to prevent someone from accidentally instantiating the contract class,
    private TrafficContract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public final class TrafficEntry implements BaseColumns {

        /** Name of database table for Trafficam */
        public final static String TABLE_NAME = "";

        /**
         * Unique ID number for the feeds (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Traffic description.
         *
         * Type: STRING
         */
        public final static String DESCRIPTION = "description";
    }

}
