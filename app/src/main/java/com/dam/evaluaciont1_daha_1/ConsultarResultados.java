package com.dam.evaluaciont1_daha_1;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dam.evaluaciont1_daha_1.data.ResultList;

import java.util.ArrayList;

public class ConsultarResultados extends AppCompatActivity {

    Button btn_select;
    EditText et_country;

    String country;

    ActivityResultLauncher<Intent> selectCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_resultados);

        //invoke the selection activity and get the results from ResultList
        btn_select = findViewById(R.id.btn_select);
        et_country = findViewById(R.id.et_country);

        btn_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectCountry = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == SeleccionEquipo.RESULT_OK) {
                            country = result.getData().getStringExtra(SeleccionEquipo.COUNTRY);
                            et_country.setText(country);
                        }
                    }
                });

                Intent intent = new Intent(ConsultarResultados.this, SeleccionEquipo.class);
                selectCountry.launch(intent);



            }
        });


    }
}