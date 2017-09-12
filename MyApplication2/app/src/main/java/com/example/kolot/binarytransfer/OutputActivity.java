package com.example.kolot.binarytransfer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {
    private TextView binOutput, hexOutput, tenOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        binOutput = (TextView) findViewById(R.id.binOutput);
        hexOutput = (TextView) findViewById(R.id.hexOutput);
        tenOutput = (TextView) findViewById(R.id.tenOutput);

        Intent intent = getIntent();
        String inputString = intent.getStringExtra("input");
        tenOutput.setText(inputString);
    }
}
