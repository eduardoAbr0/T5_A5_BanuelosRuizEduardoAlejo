package com.example.t5_a5_banuelosruizeduardoalejo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner1,spinner2;
    EditText txtIngreso;
    TextView txtR;

    logicaConversiones log = new logicaConversiones();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinnerGrados1);
        spinner2 = findViewById(R.id.spinnerGrados2);
        txtIngreso = findViewById(R.id.txtIngreso);
        txtR = findViewById(R.id.txt_R);

        //CARGAR SPINNER's
        String grados [] = {"Celsisus","Fahrenheit","Kelvin","Rankine"};

        ArrayAdapter<String>adaptadorGrados = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, grados);

        spinner1.setAdapter(adaptadorGrados);
        spinner2.setAdapter(adaptadorGrados);

        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
    }

    //CONVERSIONES CELSIUS

    public void celsiusFahrenheit(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.celsiusFahrenheit(c)));
    }

    public  void celsiusKelvin(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.celsiusKelvin(c)));
    }

    public void celsiusRank(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.celsiusRank(c)));
    }

    //CONVERSIONES FAHRENHEIT
    public void fahrenhetiCelsius(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.fahrenheitCelsius(c)));
    }
    public void fahrenheitKelvin(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.fahrenheitKelvin(c)));
    }
    public void fahrenheitRankine(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.fahrenheitRank(c)));
    }

    //CONVERSIONES KELVIN
    public void kelvinCelsius(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.kelvinCelsius(c)));
    }
    public void kelvinFahrenheit(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.kelvinFahrenheit(c)));
    }
    public void kelvinRank(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.kelvinRank(c)));
    }

    //CONVERSIONES RANKINE
    public void rankCelsius(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.rankineCelsius(c)));
    }
    public void rankFahrenheit(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.rankineFahrenheit(c)));
    }
    public void rankKelvin(){
        double c = Double.parseDouble(txtIngreso.getText().toString());

        txtR.setText(String.valueOf(log.rankineKelvin(c)));
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int id1 = spinner1.getSelectedItemPosition();
        int id2 = spinner2.getSelectedItemPosition();


        if (!txtIngreso.getText().toString().isEmpty()) {
            //CASO PARA CELSIUS
            if (id1 == 0 || id2 == 0) {
                //FAHRENHEIT A CELSIUS
                if (id1 == 1) {
                    fahrenhetiCelsius();
                }
                //CELSIUS A FAHRENHEIT
                else if (id2 == 1) {
                    celsiusFahrenheit();
                }
                //KELVIN A CELSIUS
                else if (id1 == 2) {
                    kelvinCelsius();
                }
                //CELSIUS A KELVIN
                else if (id2 == 2) {
                    celsiusKelvin();
                }
                //RANK A CELSIUS
                else if (id1 == 3) {
                    rankCelsius();
                }
                //CELSIUS A RANK
                else if (id2 == 3) {
                    celsiusRank();
                } else {
                    Toast.makeText(this, "Conversion a el mismo tipo.", Toast.LENGTH_SHORT).show();
                }
            }
            //CASO FAHRENHEIT
            else if (id1 == 1 || id2 == 1) {
                //KELVIN A FAHRENHEIT
                if (id1 == 2) {
                    kelvinFahrenheit();
                }
                //FAHRENHEIT A KELVIN
                else if (id2 == 2) {
                    fahrenheitKelvin();
                }
                //RANK A FAHRENHEIT
                else if (id1 == 3) {
                    rankFahrenheit();
                }
                //FAHRENHEIT A RANK
                else if (id2 == 3) {
                    fahrenheitRankine();
                } else {
                    Toast.makeText(this, "Conversion a el mismo tipo.", Toast.LENGTH_SHORT).show();
                }
            }
            //CASO KELVIN
            else if (id1 == 2 || id2 == 2) {
                //RANK A KELVIN
                if (id1 == 3) {
                    rankKelvin();
                }
                //KELVIN A RANK
                else if (id2 == 3) {
                    kelvinRank();
                } else {
                    Toast.makeText(this, "Conversion a el mismo tipo.", Toast.LENGTH_SHORT).show();
                }
            } else if (id1 == 3 && id2 == 3) {
                Toast.makeText(this, "Conversion a el mismo tipo.", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Ingresa cifra a convertir.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}