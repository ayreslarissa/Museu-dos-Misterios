package ufam.promobile.museudosmisterios.Moeda;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_20;

public class Moeda_36 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda_36);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textViewTexto_moeda_36_1);
        final Button proximoMoeda36_1 = (Button) findViewById(R.id.button_moeda_36_proximo_1);
        final Button proximoMoeda36_2 = (Button) findViewById(R.id.button_moeda_36_proximo_2);
        final Button proximoMoeda36_3 = (Button) findViewById(R.id.button_moeda_36_proximo_3);
        final Button anteriorMoeda36 = (Button) findViewById(R.id.button_moeda_36_anterior);

        texto.setText(R.string.moeda_36_1);

        //Botão para passar o texto
        proximoMoeda36_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.moeda_36_2);
                proximoMoeda36_1.setVisibility(View.INVISIBLE);
                proximoMoeda36_2.setVisibility(View.VISIBLE);
            };
        });

        //Botão para passar o texto
        proximoMoeda36_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.moeda_36_3);
                proximoMoeda36_2.setVisibility(View.INVISIBLE);
                proximoMoeda36_3.setVisibility(View.VISIBLE);
            };
        });


        proximoMoeda36_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_36.this, Sandalia_20.class);
                startActivity(intent);
            }
        });

        anteriorMoeda36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_36.this, Moeda_16.class);
                startActivity(intent);
            };
        });

    }

}
