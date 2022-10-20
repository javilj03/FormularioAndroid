package com.example.formularioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText txtInputNombre, txtInputApellido, txtInputCorreo, txtInputComent;
    Button btnConfirm, btnLimpiar;
    Persona p;
    List<Persona> list = new ArrayList<>();

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


    public void leerTexto(){
        String nombre = txtInputNombre.getText().toString();
        String apellido = txtInputApellido.getText().toString();
        String correo = txtInputCorreo.getText().toString();
        String comentario = txtInputComent.getText().toString();

        p = new Persona(nombre,apellido,correo,comentario);
        list.add(p);

        txtInputNombre.setText("");
        txtInputApellido.setText("");
        txtInputCorreo.setText("");
        txtInputComent.setText("");

    }
    public void limpiar(){
        txtInputNombre.setText("");
        txtInputApellido.setText("");
        txtInputCorreo.setText("");
        txtInputComent.setText("");
    }
}