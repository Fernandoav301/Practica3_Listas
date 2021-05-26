package com.example.practica3_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    ListView listfruit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listfruit=(ListView)findViewById(R.id.List);
        final String[] frutas={"Manzana","Pera","Tomate","Manzana","Pera","Tomate","Manzana","Pera","Tomate","Manzana","Pera","Tomate","Tomate","Manzana","Pera","Tomate","Tomate","Manzana","Pera","Tomate"};
        final ArrayAdapter<String> adapter=new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1,frutas);
        listfruit.setAdapter(adapter);

        listfruit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Seleccionaste el elemento: "+frutas[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}