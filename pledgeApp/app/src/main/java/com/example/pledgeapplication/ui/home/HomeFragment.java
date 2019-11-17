package com.example.pledgeapplication.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.pledgeapplication.PledgeItem;
import com.example.pledgeapplication.PledgeItemAdapter;
import com.example.pledgeapplication.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HomeFragment extends Fragment {


    private PledgeItemAdapter mAdapter;
    private RecyclerView recyclerView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // get a reference to recyclerView
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerview);
        //RecyclerView recyclerView = new RecyclerView(getContext());
        // set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        // create an adapter
        ArrayList<PledgeItem> allPledges = initPledgeArray();
        mAdapter = new PledgeItemAdapter(getContext(), allPledges);

        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

//
        // set item animator to default animator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
        }

    // initializes the data - pledge arrays
    public ArrayList<PledgeItem> initPledgeArray() {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(123);
        arr1.add(234);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(123);
        arr2.add(234);
        ArrayList<PledgeItem> allPledges = new ArrayList<PledgeItem>();
        PledgeItem p1 = new PledgeItem(1, "Food", "I will not eat take out for a week", "11/12/13",
                "12/12/19", "donate $10 to charity", arr1);
        PledgeItem p2 = new PledgeItem(2, "Recycle", "I will not eat take out for a week", "11/12/13",
                "12/12/19", "donate too much to charity", arr1);
        allPledges.add(p1);
        allPledges.add(p2);
        return allPledges;
    }

}


//
//public class HomeFragment extends Fragment {
//
//    // member variable
//    ArrayList<PledgeItem> pledgeItems = initPledgeArray();
//
//    // constructor
//    public HomeFragment() {}
//
//    // initializes the data - pledge arrays
//    public ArrayList<PledgeItem> initPledgeArray() {
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        arr1.add(123);
//        arr1.add(234);
//        ArrayList<Integer> arr2 = new ArrayList<>();
//        arr2.add(123);
//        arr2.add(234);
//        ArrayList<PledgeItem> allPledges = new ArrayList<PledgeItem>();
//        PledgeItem p1 = new PledgeItem(1, "Food", "I will not eat take out for a week", "11/12/13",
//                "12/12/19", "donate $10 to charity", arr1);
//        PledgeItem p2 = new PledgeItem(2, "Recycle", "I will not eat take out for a week", "11/12/13",
//                "12/12/19", "donate too much to charity", arr1);
//        allPledges.add(p1);
//        allPledges.add(p2);
//        return allPledges;
//    }
//
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        RecyclerView rv = new RecyclerView(getContext());
//        rv.setLayoutManager(new LinearLayoutManager(getContext()));
//        rv.setAdapter(new PledgeItemAdapter(pledgeItems));
//        return rv;
//    }
//
//    public class PledgeItemAdapter extends RecyclerView.Adapter<PledgeViewHolder> {
//        ArrayList<PledgeItem> items;
//        private LayoutInflater mInflater;
//
//        public PledgeItemAdapter(ArrayList<PledgeItem> pledgeItems) {
//           items = pledgeItems;
//            mInflater = LayoutInflater.from(getContext());
//        }
//
//        @Override
//        public PledgeViewHolder onCreateViewHolder(ViewGroup parent, int viewtype) {
//            View mItemView = mInflater.inflate(R.layout.pledge_items, parent, false);
//            return new PledgeViewHolder(mItemView);
//        }
//
//        @Override
//        public void onBindViewHolder(PledgeViewHolder holder, int position) {
//            PledgeItem mCurrent = items.get(position);
//            holder.cardView.findViewById(R.id.card_category)
//            holder.categoryView.setText(currentItem.getCategory());
////            pledgeView.setText(currentItem.getPledge());
////            endDateView.setText(currentItem.getEndDate());
//
//        }
//
//
//    }
//
//    public class PledgeViewHolder extends RecyclerView.ViewHolder{
//        public CardView cardView;
//        public PledgeViewHolder (View itemview) {
//            super(itemview);
//            cardView = (CardView) itemview;
//        }
//    }
//}

//<Button
//        android:id="@+id/button_main"
//                android:layout_width="wrap_content"
//                android:layout_height="wrap_content"
//                android:text="Button"
//                android:onClick="launchAddPledge"
//                app:layout_constraintBottom_toBottomOf="parent"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toTopOf="parent" />