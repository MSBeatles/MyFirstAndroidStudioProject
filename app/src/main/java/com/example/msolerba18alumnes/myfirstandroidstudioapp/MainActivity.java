package com.example.msolerba18alumnes.myfirstandroidstudioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((TextView)findViewById(R.id.textView1)).getText().equals(getResources().getText(R.string.hola))) {
                    TextView text1 = (TextView) findViewById(R.id.textView1);
                    text1.setText(R.string.hola2);
                }
                else{
                    TextView text1 = (TextView) findViewById(R.id.textView1);
                    text1.setText(R.string.hola);
                }
            }
        });

    }
}
