package com.example.ojonugwa.trafficam;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TrafficAdapter {


    /**
     * Cache of the children views for a list item.
     */
    class TrafficViewHolder extends RecyclerView.ViewHolder {

        TextView listItemNumberView;

        public TrafficViewHolder(View itemView) {
            super(itemView);

            listItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
        }

        void bind(int listIndex) {
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }
}
