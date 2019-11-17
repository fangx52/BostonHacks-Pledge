package com.example.pledgeapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PledgeItemAdapter extends
        RecyclerView.Adapter<PledgeItemAdapter.PledgeViewHolder> {
    // member variables
        private LayoutInflater mInflater;
        private ArrayList<PledgeItem> pledgeArray;
        private Context mContext;

    class PledgeViewHolder extends RecyclerView.ViewHolder {

        public TextView categoryView;
        public TextView pledgeView;
        public TextView endDateView;
        PledgeItemAdapter mAdapter;


        public PledgeViewHolder(@NonNull View itemView, PledgeItemAdapter adapter) {
            super(itemView);
            categoryView = itemView.findViewById(R.id.card_category);
            pledgeView = itemView.findViewById(R.id.card_pledge);
            endDateView = itemView.findViewById(R.id.card_enddate);
            this.mAdapter = adapter;
        }

        void bindTo(PledgeItem currentItem) {
            // populate the textviews with data
            categoryView.setText(currentItem.getCategory());
            pledgeView.setText(currentItem.getPledge());
            endDateView.setText(currentItem.getEndDate());
        }
    }

    // constructor
    public PledgeItemAdapter(Context context, ArrayList<PledgeItem> allPledges) {

        mInflater = LayoutInflater.from(context);
        this.pledgeArray = allPledges;
    }

    @NonNull
    @Override
    public PledgeItemAdapter.PledgeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.pledge_items, parent, false);
        return new PledgeViewHolder(mItemView, this);
        //return new PledgeViewHolder(mInflater.inflate(R.layout.pledge_items,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PledgeItemAdapter.PledgeViewHolder holder, int position) {
        PledgeItem mCurrent = pledgeArray.get(position);
        // populate the textviews with data
        holder.bindTo(mCurrent);
    }

    @Override
    public int getItemCount() {
        return pledgeArray.size();
    }
}

