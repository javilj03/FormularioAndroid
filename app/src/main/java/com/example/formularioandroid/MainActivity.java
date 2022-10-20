package com.example.formularioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtInputNombre, txtInputApellido, txtInputCorreo, txtInputComent;
    Button btnConfirm, btnLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConfirm = findViewById(R.id.btnConfirmar);
        btnLimpiar = findViewById(R.id.btnLimp);

        txtInputNombre = findViewById(R.id.txtInputName);
        txtInputApellido = findViewById(R.id.txtInputApellidos);
        txtInputCorreo = findViewById(R.id.txtInputCorreo);
        txtInputComent = findViewById(R.id.txtInputComent);


    }
}