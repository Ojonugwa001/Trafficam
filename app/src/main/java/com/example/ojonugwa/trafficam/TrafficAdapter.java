package com.example.ojonugwa.trafficam;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TrafficAdapter extends ArrayAdapter<TrafficFeeds> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param feeds A List of TrafficFeeds objects to display in a list
     */
    public TrafficAdapter(Activity context, ArrayList<TrafficFeeds> feeds){
        // Here, we initialize the   ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, feeds);

    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        TrafficFeeds currentTrafficFeed = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.user_name);
        // Get the username from the current TrafficFeed object and
        // set this text on the name TextView
        nameTextView.setText(currentTrafficFeed.getUsername());

        TextView descrTextView = listItemView.findViewById(R.id.descr);
        // Get the username from the current TrafficFeed object and
        // set this text on the name TextView
        descrTextView.setText(currentTrafficFeed.getDescr());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView =  listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current TrafficFeed object and
        // set the image to iconView
        iconView.setImageResource(currentTrafficFeed.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
