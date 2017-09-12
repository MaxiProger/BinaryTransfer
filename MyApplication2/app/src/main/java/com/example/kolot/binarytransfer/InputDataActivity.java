package com.example.kolot.binarytransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class InputDataActivity extends AppCompatActivity {
    private EditText textInput;
    private Spinner spinner;
    private Button buttonTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);
        textInput = (EditText) findViewById(R.id.textInput);
        spinner = (Spinner) findViewById(R.id.spinner);
        buttonTransfer = (Button) findViewById(R.id.buttonTransfer);

        buttonTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dataType = String.valueOf(spinner.getSelectedItem());
                //if(dataType.contains("Десятичная:")) {
                String inputData = textInput.getText().toString();
                Intent intent = new Intent(InputDataActivity.this, OutputActivity.class);
                intent.putExtra("input", inputData);
                startActivity(intent);

            }
        });
    }
}
