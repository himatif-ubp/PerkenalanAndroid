package com.exampledomain.exampleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final TextView textViewHello = (TextView) findViewById(R.id.text_view_hello);
        final EditText editTextPanjang = (EditText) findViewById(R.id.editTextPanjang);
        final EditText editTextLebar = (EditText) findViewById(R.id.editTextLebar);

        Button buttonHitung = (Button) findViewById(R.id.buttonHitung);

        Button buttonToast = (Button) findViewById(R.id.buttonToast);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = editTextPanjang.getText().toString();
                String lebar = editTextLebar.getText().toString();
//                textViewHello.setText(panjang+" dan "+lebar);
                Intent intentVariable = new Intent(getApplicationContext(), SecondActivity.class);

                intentVariable.putExtra("PANJANG", panjang);
                intentVariable.putExtra("LEBAR", lebar);

                startActivity(intentVariable);
            }
        });

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = editTextPanjang.getText().toString();
                String lebar = editTextLebar.getText().toString();
                Toast.makeText(getApplicationContext(), panjang+" dan "+lebar, Toast.LENGTH_LONG).show();
            }
        });


    }
}
