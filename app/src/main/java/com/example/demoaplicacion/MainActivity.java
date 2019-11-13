package com.example.demoaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume(){
        super.onResume();
        //en este punto la aplicación ya cargó
        Toast.makeText(this, "Aplicacion iniciada", Toast.LENGTH_SHORT).show();
        //this en un activity: es el contexto o escencia de una pantalla
        //This es de tipo contexto
    }

    @Override
    protected  void onStop(){
        // Super este  ejecuta un codigo extra para que el codigo otros se ejecute
        //
        super.onStop();
        Toast.makeText(this, "Aplicacion Stopeada", Toast.LENGTH_SHORT).show();
    }

}
