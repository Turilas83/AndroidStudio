package com.example.mikko.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    protected void laske(View v) {
        // Input ja output
        EditText input = (EditText) findViewById(R.id.etLuku);
        TextView output = (TextView) findViewById(R.id.tvTulos);
        EditText secondInput = (EditText) findViewById(R.id.etProsentit);

        // Työstetään data...
        double luku = Double.valueOf(input.getText().toString());
        double prosentti = Double.valueOf(secondInput.getText().toString());
        double tulos = (1-(prosentti/100))*luku;

        DecimalFormat des = new DecimalFormat("0.00");
        // Näytetään tulos
        output.setText("Tulos: " + des.format(tulos));
    }
}
