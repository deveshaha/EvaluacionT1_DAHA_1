package com.dam.evaluaciont1_daha_1;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dam.evaluaciont1_daha_1.data.ResultList;

public class IntroducirResultados extends AppCompatActivity implements View.OnClickListener {

    private ActivityResultLauncher<Intent> selectFirstTeam;
    private ActivityResultLauncher<Intent> selectSecondTeam;

    Button btn_select_t1, btn_select_t2, btn_save, btn_clear;
    EditText et_date, et_phase, et_team1, et_team2, et_goals1, et_goals2;
    String team1;
    String team2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducir_resultados);

        btn_select_t1 = findViewById(R.id.btn_select_team1);
        btn_select_t1.setOnClickListener(this);
        btn_select_t2 = findViewById(R.id.btn_select_team2);
        btn_select_t2.setOnClickListener(this);
        btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(this);
        btn_clear = findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);

        et_date = findViewById(R.id.et_date_hour);
        et_phase = findViewById(R.id.et_group_phase);
        et_team1 = findViewById(R.id.et_team1);
        et_team2 = findViewById(R.id.et_team2);
        et_goals1 = findViewById(R.id.et_goals_team1);
        et_goals2 = findViewById(R.id.et_goals_team2);

        selectFirstTeam = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == SeleccionEquipo.RESULT_OK) {
                    team1 = result.getData().getStringExtra(SeleccionEquipo.COUNTRY);
                    et_team1.setText(team1);
                }
            }
        });

        selectSecondTeam = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == SeleccionEquipo.RESULT_OK) {
                    team2 = result.getData().getStringExtra(SeleccionEquipo.COUNTRY);
                    et_team2.setText(team2);
                }
            }
        });


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_select_team1) {
            System.out.println("Seleccionar equipo 1");
            Intent i = new Intent(IntroducirResultados.this, SeleccionEquipo.class);
            selectFirstTeam.launch(i);
        } else if (view.getId() == R.id.btn_select_team2) {
            System.out.println("Seleccionar equipo 2");
            Intent i = new Intent(IntroducirResultados.this, SeleccionEquipo.class);
            selectSecondTeam.launch(i);
        } else if (view.getId() == R.id.btn_save){
            System.out.println("Guardar");
            if (!et_date.getText().toString().matches("((\\(\\d{2}\\) ?)|(\\d{2}/))?\\d{2}/\\d{4} ([0-2][0-9]\\:[0-6][0-9])")) {
                Toast.makeText(IntroducirResultados.this, "El formato no es correcto", Toast.LENGTH_SHORT).show();
            } else {
                if (et_date.getText().toString().isEmpty() || et_phase.getText().toString().isEmpty() || et_team1.getText().toString().isEmpty()
                        || et_team2.getText().toString().isEmpty() || et_goals1.getText().toString().isEmpty() || et_goals2.getText().toString().isEmpty()) {
                    Toast.makeText(IntroducirResultados.this, "Rellena todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(IntroducirResultados.this, "Datos guardados", Toast.LENGTH_SHORT).show();
//                    ResultList.addResult(et_date.getText().toString(), et_phase.getText().toString(), et_team1.getText().toString(), et_team2.getText().toString(), et_goals1.getText(), et_goals2.getText());
                    Toast.makeText(this, "Resultado guardado", Toast.LENGTH_SHORT).show();
                }
            }
        } else if (view.getId() == R.id.btn_clear){
            System.out.println("Limpiar");
            et_date.setText("");
            et_phase.setText("");
            et_team1.setText("");
            et_team2.setText("");
            et_goals1.setText("");
            et_goals2.setText("");
        }

    }

}