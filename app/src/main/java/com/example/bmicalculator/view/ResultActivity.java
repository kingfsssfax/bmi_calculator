package com.example.bmicalculator.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bmicalculator.R;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {

    // attributs de classe ResultActivity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        init();

        // affichage de la valeur de l'IMC et de l'interprétation obtenue


        btnReturn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                // à completer
            }
        });

    }

    private void init()
    {
        /* à completer */
    }
}