package com.dam.evaluaciont1_daha_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SeleccionEquipo extends AppCompatActivity implements View.OnClickListener {

    EditText et_team1;

    EditText et_choose_team;

    Button btn_accept, btn_cancel;
    Button btn_germany, btn_saudiArabia, btn_argentina, btn_australia, btn_belgium, btn_brazil,
            btn_cameroon, btn_canada, btn_korea, btn_costaRica, btn_croatia, btn_denmark,
            btn_ecuador, btn_spain, btn_usa, btn_france, btn_wales, btn_ghana,
            btn_netherlands, btn_englad, btn_Iran, btn_japan, btn_morroco,
            btn_mexico, btn_poland, btn_portugal, btn_qatar,
            btn_Senegal, btn_serbia, btn_switzerland,
            btn_tunisia, btn_uruguay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_equipo);

        et_choose_team = findViewById(R.id.et_choose_team);
        btn_accept = findViewById(R.id.btn_accept);
        btn_accept.setOnClickListener(this);
        btn_cancel = findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(this);
        btn_germany = findViewById(R.id.btn_germany);
        btn_germany.setOnClickListener(this);
        btn_saudiArabia = findViewById(R.id.btn_saudiArabia);
        btn_saudiArabia.setOnClickListener(this);
        btn_argentina = findViewById(R.id.btn_argentina);
        btn_argentina.setOnClickListener(this);
        btn_australia = findViewById(R.id.btn_australia);
        btn_australia.setOnClickListener(this);
        btn_belgium = findViewById(R.id.btn_belgium);
        btn_belgium.setOnClickListener(this);
        btn_brazil = findViewById(R.id.btn_brazil);
        btn_brazil.setOnClickListener(this);
        btn_cameroon = findViewById(R.id.btn_cameroon);
        btn_cameroon.setOnClickListener(this);
        btn_canada = findViewById(R.id.btn_canada);
        btn_canada.setOnClickListener(this);
        btn_korea = findViewById(R.id.btn_korea);
        btn_korea.setOnClickListener(this);
        btn_costaRica = findViewById(R.id.btn_costaRica);
        btn_costaRica.setOnClickListener(this);
        btn_croatia = findViewById(R.id.btn_croatia);
        btn_croatia.setOnClickListener(this);
        btn_denmark = findViewById(R.id.btn_denmark);
        btn_denmark.setOnClickListener(this);
        btn_ecuador = findViewById(R.id.btn_ecuador);
        btn_ecuador.setOnClickListener(this);
        btn_spain = findViewById(R.id.btn_spain);
        btn_spain.setOnClickListener(this);
        btn_usa = findViewById(R.id.btn_usa);
        btn_usa.setOnClickListener(this);
        btn_france = findViewById(R.id.btn_france);
        btn_france.setOnClickListener(this);
        btn_wales = findViewById(R.id.btn_wales);
        btn_wales.setOnClickListener(this);
        btn_ghana = findViewById(R.id.btn_ghana);
        btn_ghana.setOnClickListener(this);
        btn_netherlands = findViewById(R.id.btn_netherlands);
        btn_netherlands.setOnClickListener(this);
        btn_englad = findViewById(R.id.btn_england);
        btn_englad.setOnClickListener(this);
        btn_Iran = findViewById(R.id.btn_Iran);
        btn_Iran.setOnClickListener(this);
        btn_japan = findViewById(R.id.btn_japan);
        btn_japan.setOnClickListener(this);
        btn_morroco = findViewById(R.id.btn_morroco);
        btn_morroco.setOnClickListener(this);
        btn_mexico = findViewById(R.id.btn_mexico);
        btn_mexico.setOnClickListener(this);
        btn_poland = findViewById(R.id.btn_poland);
        btn_poland.setOnClickListener(this);
        btn_portugal = findViewById(R.id.btn_portugal);
        btn_portugal.setOnClickListener(this);
        btn_qatar = findViewById(R.id.btn_qatar);
        btn_qatar.setOnClickListener(this);
        btn_Senegal = findViewById(R.id.btn_Senegal);
        btn_Senegal.setOnClickListener(this);
        btn_serbia = findViewById(R.id.btn_serbia);
        btn_serbia.setOnClickListener(this);
        btn_switzerland = findViewById(R.id.btn_switzerland);
        btn_switzerland.setOnClickListener(this);
        btn_tunisia = findViewById(R.id.btn_tunisia);
        btn_tunisia.setOnClickListener(this);
        btn_uruguay = findViewById(R.id.btn_uruguay);
        btn_uruguay.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == btn_cancel) {
            System.out.println("btn_cancel");
            Intent intent = new Intent(this, IntroducirResultados.class);
        } else if (view == btn_accept) {
            System.out.println("btn_accept");
            if (et_choose_team.getText().toString().isEmpty()) {
                Toast.makeText(this, "Debes seleccionar un equipo", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, IntroducirResultados.class);
                intent.putExtra("team", et_choose_team.getText().toString());
                startActivity(intent);
                System.out.println("team: " + et_choose_team.getText().toString());
            }
        } else{
            System.out.println("equipo pulsado: " + view.getId());
            et_choose_team.setText(((Button) view).getText());
        }
    }
}