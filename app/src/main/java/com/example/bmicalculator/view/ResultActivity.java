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
    private TextView tvBMI , tvInterpretation;
    private Button btnReturn;
    private String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        init();
        // affichage de la valeur de l'IMC et de l'interprétation obtenue
        Intent intent = getIntent();
        String bm = intent.getStringExtra("result");
        String res = intent.getStringExtra("bmi");
        if (intent != null){
            tvBMI.setText(bm);
            tvInterpretation.setText(res);
        }


        btnReturn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                // à completer
                Intent intent = new Intent();
                if (bm !=null && res !=null){
                    setResult(RESULT_OK,intent);
                }
                else setResult(RESULT_CANCELED,intent);
                finish();
            }
        });

    }

    private void init()
    {
        /* à completer */
        tvBMI = (TextView) findViewById(R.id.tvBMI);
        tvInterpretation = (TextView) findViewById(R.id.tvInterpretation);
        btnReturn = (Button) findViewById(R.id.btnReturn);
    }
}