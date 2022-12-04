package com.dam.evaluaciont1_daha_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dam.evaluaciont1_daha_1.data.ResultList;

public class ConsultarResultados extends AppCompatActivity {

    Button btn_select;
    EditText et_country;

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
                //select the country from the list and show the results from ResultList
                Intent intent = new Intent(ConsultarResultados.this, SeleccionEquipo.class);
                startActivity(intent);



            }
        });


    }
}