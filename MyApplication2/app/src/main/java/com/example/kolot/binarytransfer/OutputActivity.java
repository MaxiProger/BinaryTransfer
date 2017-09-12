package com.example.kolot.binarytransfer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity  {
    private TextView binOutput, hexOutput, tenOutput;
    String inputString;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        binOutput = (TextView) findViewById(R.id.binOutput);
        hexOutput = (TextView) findViewById(R.id.hexOutput);
        tenOutput = (TextView) findViewById(R.id.tenOutput);

        Intent intent = getIntent();
        inputString = intent.getStringExtra("input");
        inputString=String.valueOf(Calculate.toInt(inputString));
        tenOutput.setText(inputString);
    }

}
