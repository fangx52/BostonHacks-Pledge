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
        DiscoverItem dd1 = new DiscoverItem("Boston, MA",
                "Sustainability Festival", "Come out to the Boston Sustainability Festival to learn about how to be sustainable.", "11.28.19", "bostonsustainabilty.org");
        DiscoverItem dd2 = new DiscoverItem("Boston, MA",
                "Women in Green: Culture of Courage", "Women are driving the sustainability of the built environment. We are tasked with the most important mission of all: healing the earth.", "12.3.19", "https://www.eventbrite.com/e/women-in-green-culture-of-courage-tickets-77516753697?aff=ebdssbdestsearch");
        DiscoverItem dd3 = new DiscoverItem("Online",
                "#TeamTrees", "Help us plant 20 million trees around the globe by January 1st 2020.", "Now until 2020", "teamtrees.org");
        DiscoverItem dd4 = new DiscoverItem("Boston, MA",
                "Boston Sustainability Breakfast", "Join us every month for Net Impact Boston's informal breakfast meetup of sustainability professionals. ", "11.20.19", "https://www.eventbrite.com/e/boston-sustainability-breakfast-tickets-72997402195");
        allDiscover.add(dd1);
        allDiscover.add(dd2);
        allDiscover.add(dd3);
        allDiscover.add(dd4);
        return allDiscover;
    }

}