package com.example.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.sharedpreferences.MainActivity.Branch;
import static com.example.sharedpreferences.MainActivity.Name;
import static com.example.sharedpreferences.MainActivity.Rno;
import static com.example.sharedpreferences.MainActivity.Sap;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvName=(TextView)findViewById(R.id.tvNameShow);
        TextView tvSap=(TextView)findViewById(R.id.tvSapShow);
        TextView tvRoll=(TextView)findViewById(R.id.tvRollShow);
        TextView tvBranch=(TextView)findViewById(R.id.tvBranchShow);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String name1=preferences.getString(Name,null);
        String sap1=preferences.getString(Sap,null);
        String Roll1=preferences.getString(Rno,null);
        String Branch1=preferences.getString(Branch,null);

        tvName.setText(name1);
        tvSap.setText(sap1);
        tvRoll.setText(Roll1);
        tvBranch.setText(Branch1);



    }

}



