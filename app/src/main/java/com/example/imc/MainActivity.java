package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText peso;
EditText altura;

EditText resultado;
EditText resul;

EditText imprima;

Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso = findViewById(R.id.etpeso);
        altura = findViewById(R.id.etaltura);
        calcular = findViewById(R.id.calcular);
        resul = findViewById(R.id.etresul);
        imprima= findViewById(R.id.etimprima);



        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float peso1 = Float.parseFloat(peso.getText().toString());
                float altura1 = Float.parseFloat(altura.getText().toString());
                float resultado = peso1/(altura1*altura1);

                if (resultado < 18.5) {
                      String baixo="PESO BAIXO";
                      imprima.setText(String.valueOf(baixo));
                } else if (resultado < 24.9) {
                    String medio="PESO NORMAL OU ADEQUADO";
                    imprima.setText(String.valueOf(medio));
                } else {
                    String alto="SOBREPESO";
                    imprima.setText(String.valueOf(alto));
                }

                resul.setText(String.valueOf(resultado));
            }
        });
    }
}