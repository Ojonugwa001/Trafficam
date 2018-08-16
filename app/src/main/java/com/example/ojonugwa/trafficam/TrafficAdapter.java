package com.example.ojonugwa.trafficam;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TrafficAdapter extends RecyclerView.Adapter<TrafficAdapter.TrafficViewHolder> {

    private int mNumberItems;

    /**
     * Constructor for TrafficAdapter that accepts a number of items to display and the specification
     * for the ListItemClickListener.
     *
     * @param numberOfItems Number of items to display in list
     */
    public TrafficAdapter(int numberOfItems) {
        mNumberItems = numberOfItems;
    }

    @NonNull
    @Override
    public TrafficViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.traffic_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        TrafficViewHolder viewHolder = new TrafficViewHolder(view);

        return viewHolder;
    }


    /**
     * OnBindViewHolder is called by the RecyclerView to display the data at the specified
     * position. In this method, we update the contents of the ViewHolder to display the correct
     * indices in the list for this particular position, using the "position" argument that is conveniently
     * passed into us.
     *
     * @param holder   The ViewHolder which should be updated to represent the contents of the
     *                 item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(TrafficViewHolder holder, int position) {
        holder.bind(position);
    }

    /**
     * This method simply returns the number of items to display. It is used behind the scenes
     * to help layout our Views and for animations.
     *
     * @return The number of items available in our forecast
     */
    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    /**
     * Cache of the children views for a list item.
     */
    class TrafficViewHolder extends RecyclerView.ViewHolder {

        TextView listItemTrafficView;
        TextView userName;
        TextView descr;

        public TrafficViewHolder(View itemView) {
            super(itemView);

            listItemTrafficView = itemView.findViewById(R.id.tv_item_number);
            userName = itemView.findViewById(R.id.user_name);
            descr = itemView.findViewById(R.id.descr);
        }

        void bind(int listIndex) {
            listItemTrafficView.setText(String.valueOf(listIndex));
            userName.setText("Fact");
            descr.setText("The term ~happily ever after~ was orriginally used as happily until they died");
        }
    }
}
