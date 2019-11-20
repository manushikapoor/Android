package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4;
    Button btClick;
    public static final String preference="key";
    public static final String Name="namekey1";
    public static final String Sap="namekey2";
    public static final String Rno="namekey3";
    public static final String Branch="namekey4";
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        et4=(EditText)findViewById(R.id.editText4);
        btClick=(Button)findViewById(R.id.button1);


            btClick=(Button)findViewById(R.id.button1);
            btClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String name=et1.getText().toString();
                    String Sapid=et2.getText().toString();
                    String Rollno=et3.getText().toString();
                    String Branchname=et4.getText().toString();


                   preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString(Name,name);
                    editor.putString(Sap, Sapid);
                    editor.putString(Rno,Rollno);
                    editor.putString(Branch,Branchname);

                    editor.apply();

                    Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                    startActivity(intent);
                }
            });





    }
}

