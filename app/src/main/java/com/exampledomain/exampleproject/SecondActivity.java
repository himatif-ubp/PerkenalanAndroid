package com.exampledomain.exampleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewTangkep = (TextView) findViewById(R.id.textViewTangkep);

        Intent intentTangkap = getIntent();
        String intentDataPanjang = intentTangkap.getStringExtra("PANJANG");
        String intentDataLebar = intentTangkap.getStringExtra("LEBAR");
        textViewTangkep.setText(intentDataPanjang+" dan "+intentDataLebar);

    }
}
