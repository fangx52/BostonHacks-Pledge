package com.example.pledgeapplication.ui.dashboard;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pledgeapplication.R;

import java.util.ArrayList;
import java.util.LinkedList;

public class DashboardItemAdapter extends
        RecyclerView.Adapter<DashboardItemAdapter.DashboardItemHolder> {
    // member variables
    private LayoutInflater mInflater;
    private ArrayList<DashboardItem> dashboardArray;
    private Context mContext;

    class DashboardItemHolder extends RecyclerView.ViewHolder {

        public TextView infoView;
        DashboardItemAdapter mAdapter;


        public DashboardItemHolder(@NonNull View itemView, DashboardItemAdapter adapter) {
            super(itemView);
            infoView = itemView.findViewById(R.id.feed_text);
            this.mAdapter = adapter;
        }

        void bindTo(DashboardItem currentItem) {
            // populate the textviews with data
            infoView.setText(currentItem.getInfo());
        }
    }

    // constructor
    public DashboardItemAdapter(Context context, ArrayList<DashboardItem> allDashboards) {

        mInflater = LayoutInflater.from(context);
        this.dashboardArray = allDashboards;
    }

    @NonNull
    @Override
    public DashboardItemAdapter.DashboardItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.feed_items, parent, false);
        return new DashboardItemHolder(mItemView, this);
        //return new DashboardItemHolder(mInflater.inflate(R.layout.pledge_items,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardItemAdapter.DashboardItemHolder holder, int position) {
        DashboardItem mCurrent = dashboardArray.get(position);
        // populate the textviews with data
        holder.bindTo(mCurrent);
    }

    @Override
    public int getItemCount() {
        return dashboardArray.size();
    }
}