package com.example.bmicalculator.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bmicalculator.R;
import com.example.bmicalculator.controller.Controller;

public class MainActivity extends AppCompatActivity {

    // Les attributs de classe MainActivity
    private final int REQUEST_CODE = 1;
    private EditText etWeight ;
    private EditText etHeight;
    private Button btnCalculer;
    private  Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight =0, height = 0;

                boolean verifWeight = false , verifHeight = false;

                if (!etWeight.getText().toString().isEmpty())
                    weight = Double.valueOf(etWeight.getText().toString());
                else
                    Toast.makeText(MainActivity.this, "Veuillez saisir votre poids (en kg)", Toast.LENGTH_SHORT).show();

                if (weight <= 0)
                    Toast.makeText(MainActivity.this, "Le poids ne peut pas etre négatif", Toast.LENGTH_LONG).show();
                else
                    verifWeight = true;

                if (!etHeight.getText().toString().isEmpty())
                    height = Double.valueOf(etHeight.getText().toString());
                else
                    Toast.makeText(MainActivity.this, "Veuillez saisir votre taille (en m)", Toast.LENGTH_SHORT).show();

                if (height <= 0)
                    Toast.makeText(MainActivity.this, "La taille ne peut pas etre négatif", Toast.LENGTH_LONG).show();
                else
                    verifHeight = true;

                if (verifWeight && verifHeight) {

                    /* à comleter */
                    controller = Controller.getInstance();
                    controller.createBMI(weight,height);
                    Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                    intent.putExtra("result",controller.getBmi());
                    intent.putExtra("Bmi",controller.getResult());
                    startActivityForResult(intent,REQUEST_CODE);
                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_CANCELED){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }

    }

    private void init() {
        // à compléter
        etWeight =(EditText)findViewById(R.id.etWeight);
        etHeight =(EditText)findViewById(R.id.etHeight);
        btnCalculer =(Button)findViewById(R.id.btnCalculer);
    }
}

