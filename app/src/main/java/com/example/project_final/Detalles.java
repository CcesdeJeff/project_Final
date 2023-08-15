package com.example.project_final;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Detalles extends AppCompatActivity {

    EditText ednombre,edcorreo,eddireccion,edid;
    Button btnregistrar;
    private int position;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        ednombre=findViewById(R.id.ednombre);
        edcorreo=findViewById(R.id.edcorreo);
        eddireccion=findViewById(R.id.edcontra);
        btnregistrar=findViewById(R.id.agreg);
        edid=findViewById(R.id.edid);


        Intent intent=getIntent();
        position=intent.getExtras().getInt("position");

        edid.setText(MainActivity.usuariosArrayList.get(position).getId());
        ednombre.setText(MainActivity.usuariosArrayList.get(position).getName());
        edcorreo.setText(MainActivity.usuariosArrayList.get(position).getCorreo());
        eddireccion.setText(MainActivity.usuariosArrayList.get(position).getDireccion());
    }
}