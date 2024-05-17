package com.example.t5_a5_banuelosruizeduardoalejo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner1,spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinnerGrados1);
        spinner2 = findViewById(R.id.spinnerGrados2);

        //CARGAR SPINNER's
        String grados [] = {"Celsisu","Fahrenheit","Kelvin","Rankine"};

        ArrayAdapter<String>adaptadorGrados = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, grados);

        spinner1.setAdapter(adaptadorGrados);
        spinner2.setAdapter(adaptadorGrados);

        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}