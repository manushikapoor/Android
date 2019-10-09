package com.example.emi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                EditText r = (EditText) findViewById(R.id.editText2);
                EditText n = (EditText) findViewById(R.id.editText3);
                EditText res = (EditText) findViewById(R.id.editText4);


                final Double s1 = Double.parseDouble(p.getText().toString());
                final Double s2 = Double.parseDouble(r.getText().toString());
                final Double s3 = Double.parseDouble(n.getText().toString());

                Double s4=(s1 * s2 * (float)Math.pow(1 + s2, s3)) / (float)(Math.pow(1 + s2, s3) - 1);

                res.setText(String.valueOf(s4));
            }
        });
    }

}

