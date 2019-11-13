package com.example.demoaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnProducts;
    private Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // enlazando activity + Layouts
        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutus);

        btnProducts.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                //Log.i(Settings.INFO, "Products");
                Intent i = new Intent(MainActivity.this,
                            ProductListActivity.class);
                startActivity(i);
                }
            });
        btnAboutUs.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               // Log.i(Settings.INFO, "About us");
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });
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
