package com.example.pledgeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class AddPledgeActivity extends AppCompatActivity{

    Spinner spinnerCategories;
    EditText pledgeInput;
    EditText startDate;
    EditText endDate;
    EditText penalty;
    FloatingActionButton buttonAdd;
    DatabaseReference databasePledge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_pledge);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        databasePledge= FirebaseDatabase.getInstance().getReference("pledge");

        spinnerCategories=(Spinner) findViewById(R.id.category);
        pledgeInput=(EditText) findViewById(R.id.pledgeInput);
        startDate=(EditText) findViewById(R.id.startdate);
        endDate=(EditText) findViewById(R.id.enddate);
        penalty=(EditText) findViewById(R.id.penalty);
        buttonAdd = findViewById(R.id.addPledge);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                addPledge();

            }
        });
        //buttonAdd=(Button) findViewById(R.id.addPledge);
    }
    private void addPledge(){
        String category=spinnerCategories.getSelectedItem().toString();
        String pledge=pledgeInput.getText().toString().trim();
        String start=startDate.getText().toString().trim();
        String end=endDate.getText().toString().trim();
        String penal=penalty.getText().toString().trim();
        if (!TextUtils.isEmpty(category)){
            String id=databasePledge.push().getKey();
            PledgeItem pledges=new PledgeItem(id, category,pledge,start,end,penal);
            databasePledge.child(id).setValue(pledges);
            Toast.makeText(this,"Pledge Added",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Please input a category",Toast.LENGTH_LONG).show();
        }


    }

}
