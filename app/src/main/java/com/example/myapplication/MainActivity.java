package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView listView = (android.widget.ListView) findViewById(R.id.Lista);

        Log.d( "MainActivity", "onCreate: Started");

        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("ALEXANDRE MARQUES DE OLIVEIRA");
        nomes.add("ALEXANDRE MARQUES DE OLIVEIRA");
        nomes.add("ALEXANDRE MARQUES DE OLIVEIRA");
        nomes.add("ALEXANDRE MARQUES DE OLIVEIRA");
        nomes.add("ALEXANDRE MARQUES DE OLIVEIRA");

        ArrayAdapter adapter = new ArrayAdapter( this, android.R.layout.simple_list_item_1,nomes);
        listView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}