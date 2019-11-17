package com.example.pledgeapplication.ui.notifications;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pledgeapplication.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DiscoverItemAdapter extends
        RecyclerView.Adapter<DiscoverItemAdapter.DiscoverItemHolder> {
    // member variables
    private LayoutInflater mInflater;
    private ArrayList<DiscoverItem> dashboardArray;
    private Context mContext;

    class DiscoverItemHolder extends RecyclerView.ViewHolder {

        public TextView locationView;
        public TextView titleView;
        public TextView dateView;
        //image
        public TextView linkView;
        public TextView infoView;
        DiscoverItemAdapter mAdapter;


        public DiscoverItemHolder(@NonNull View itemView, DiscoverItemAdapter adapter) {
            super(itemView);
            locationView = itemView.findViewById(R.id.location_text);
            titleView = itemView.findViewById(R.id.title_text);
            infoView = itemView.findViewById(R.id.info_text);
            dateView = itemView.findViewById(R.id.date_text);
            linkView = itemView.findViewById(R.id.link_text);
            this.mAdapter = adapter;
        }

        void bindTo(DiscoverItem currentItem) {
            // populate the textviews with data
            locationView.setText(currentItem.getLocation());
            titleView.setText(currentItem.getTitle());
            infoView.setText(currentItem.getInfo());
            dateView.setText(currentItem.getDate());
            linkView.setText(currentItem.getLink());
        }
    }

    // constructor
    public DiscoverItemAdapter(Context context, ArrayList<DiscoverItem> allDashboards) {

        mInflater = LayoutInflater.from(context);
        this.dashboardArray = allDashboards;
    }

    @NonNull
    @Override
    public DiscoverItemAdapter.DiscoverItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.discover_items, parent, false);
        return new DiscoverItemHolder(mItemView, this);
        //return new DashboardItemHolder(mInflater.inflate(R.layout.pledge_items,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DiscoverItemAdapter.DiscoverItemHolder holder, int position) {
        DiscoverItem mCurrent = dashboardArray.get(position);
        // populate the textviews with data
        holder.bindTo(mCurrent);
    }

    @Override
    public int getItemCount() {
        return dashboardArray.size();
    }
}
