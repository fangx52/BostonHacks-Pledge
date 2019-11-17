package com.example.pledgeapplication.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pledgeapplication.R;

import java.util.ArrayList;

public class DiscoverFragment extends Fragment {


    private DiscoverItemAdapter mAdapter;
    private RecyclerView recyclerView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // get a reference to recyclerView
        View rootView = inflater.inflate(R.layout.fragment_notifications, container, false);
        recyclerView = rootView.findViewById(R.id.discoverrecyclerview);
        //RecyclerView recyclerView = new RecyclerView(getContext());
        // set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        // create an adapter
        ArrayList<DiscoverItem> allDiscovers = initDiscoverArray();
        mAdapter = new DiscoverItemAdapter(getContext(), allDiscovers);

        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

//
        // set item animator to default animator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }

    // initializes the data - dashboard arrays
    public ArrayList<DiscoverItem> initDiscoverArray() {
        ArrayList<DiscoverItem> allDiscover = new ArrayList<DiscoverItem>();
        DiscoverItem dd1 = new DiscoverItem("Elton rode the bus instead of driving to work all month.",
                "Other", "Other", "Other", "Other");
        DiscoverItem dd2 = new DiscoverItem("Andrew didn't use plastic cups for a week.",
                "Other", "Other", "Other", "Other");
        allDiscover.add(dd1);
        allDiscover.add(dd2);
        return allDiscover;
    }

}