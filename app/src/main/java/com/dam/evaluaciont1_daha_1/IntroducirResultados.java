package com.dam.evaluaciont1_daha_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntroducirResultados extends AppCompatActivity {

    Button btn_select_t1, btn_select_t2, btn_save, btn_clear;
    EditText et_date, et_phase, et_team1, et_team2, et_goals1, et_goals2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducir_resultados);

        btn_select_t1 = findViewById(R.id.btn_select_team1);
        btn_select_t2 = findViewById(R.id.btn_select_team2);
        btn_save = findViewById(R.id.btn_save);
        btn_clear = findViewById(R.id.btn_clear);

        et_date = findViewById(R.id.et_date_hour);
        et_phase = findViewById(R.id.et_group_phase);
        et_team1 = findViewById(R.id.et_team1);
        et_team2 = findViewById(R.id.et_team2);
        et_goals1 = findViewById(R.id.et_goals_team1);
        et_goals2 = findViewById(R.id.et_goals_team2);

        btn_select_t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IntroducirResultados.this, SeleccionEquipo.class);
            }
        });

        btn_select_t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IntroducirResultados.this, SeleccionEquipo.class);
            }
        });


    }
}