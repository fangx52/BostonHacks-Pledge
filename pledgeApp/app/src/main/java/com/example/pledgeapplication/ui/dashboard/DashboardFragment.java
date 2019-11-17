package com.example.pledgeapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pledgeapplication.R;

import java.util.ArrayList;


public class DashboardFragment extends Fragment {


    private DashboardItemAdapter mAdapter;
    private RecyclerView recyclerView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // get a reference to recyclerView
        View rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);
        recyclerView = rootView.findViewById(R.id.dashrecyclerview);
        //RecyclerView recyclerView = new RecyclerView(getContext());
        // set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        // create an adapter
        ArrayList<DashboardItem> allDashboards = initDashboardArray();
        mAdapter = new DashboardItemAdapter(getContext(), allDashboards);

        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

//
        // set item animator to default animator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }

    // initializes the data - dashboard arrays
    public ArrayList<DashboardItem> initDashboardArray() {
        ArrayList<DashboardItem> allDashboards = new ArrayList<DashboardItem>();
        DashboardItem d1 = new DashboardItem("Elton rode the bus instead of driving to work all month.");
        DashboardItem d2 = new DashboardItem("Andrew didn't use plastic cups for a week.");
        allDashboards.add(d1);
        allDashboards.add(d2);
        return allDashboards;
    }

}