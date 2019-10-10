package com.example.incometexcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonListener();
    }

    private void buttonListener() {

        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                EditText p = (EditText) findViewById(R.id.editText);

                TextView res=(TextView)findViewById(R.id.textView3);

                final Double a = Double.parseDouble(p.getText().toString());

                if(a<500000){
                    res.setText("You have 0 income tax");

                }
                else if(a>=500000&&a<1000000){
                    float ans=(float)((10*a)/100);
                    res.setText("Your income tax is "+ans);
                }
                else if(a>=1000000&&a<1500000){
                    float ans=(float)((15*a)/100);
                    res.setText("Your income tax is "+ans);
                }
                else{
                    float ans=(float)((18*a)/100);
                    res.setText("Your income tax is "+ans);
                }
            }
        });
    }

}

