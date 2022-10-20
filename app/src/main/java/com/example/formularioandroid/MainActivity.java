package com.example.formularioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txtInputNombre, txtInputApellido, txtInputCorreo, txtInputComent;
    Button btnConfirm, btnLimpiar;
    Persona p;
    List<Persona> list = new ArrayList<>();
    CheckBox CBSub;

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

        CBSub = findViewById(R.id.checkBox);

    }
    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.btnConfirmar:
                leerTexto();

                break;
            case R.id.btnLimp:
                limpiar();
                break;
        }
        leerTexto();
    }

    public void leerTexto(){
        String nom = txtInputNombre.getText().toString();
        String ape = txtInputApellido.getText().toString();
        String cor = txtInputCorreo.getText().toString();
        String com = txtInputComent.getText().toString();

        p = new Persona(nom,ape,cor,com);
        list.add(p);

        limpiar();

    }
    public void limpiar(){
        txtInputNombre.setText("");
        txtInputApellido.setText("");
        txtInputCorreo.setText("");
        txtInputComent.setText("");
        CBSub.setChecked(false);
    }
}