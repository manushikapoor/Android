package com.manushi.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    buttonListener();


    }
    public void buttonListener(){

        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e=(EditText)findViewById(R.id.editText);
                String n=e.getText().toString();


            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            i.putExtra("name",n);
            startActivity(i);
            };
    });
    }
}
