package com.example.kolot.binarytransfer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {
    private TextView textOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        textOutput = (TextView) findViewById(R.id.textOutput);

        Intent intent = getIntent();
        String inputString = intent.getStringExtra("input");
        textOutput.setText(inputString);



    }
}
