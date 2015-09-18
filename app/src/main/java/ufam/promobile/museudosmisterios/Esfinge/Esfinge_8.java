package ufam.promobile.museudosmisterios.Esfinge;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Moeda.Moeda_16;
import ufam.promobile.museudosmisterios.R;

public class Esfinge_8 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_8);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textViewTexto_esfinge_8_1);
        final Button proximoEsfinge8_1 = (Button) findViewById(R.id.button_esfinge_8_proximo1);
        final Button proximoEsfinge8_2 = (Button) findViewById(R.id.button_esfinge_8_proximo2);
        final Button anteriorEsfinge8 = (Button) findViewById(R.id.button_esfinge_8_anterior);

        texto.setText(R.string.esfinge_8_1);

        //Botão para passar o texto
        proximoEsfinge8_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.esfinge_8_2);
                proximoEsfinge8_1.setVisibility(View.INVISIBLE);
                proximoEsfinge8_2.setVisibility(View.VISIBLE);
            };
        });

        //Botão para passar o texto
        proximoEsfinge8_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.esfinge_8_3);
                proximoEsfinge8_2.setVisibility(View.INVISIBLE);

            };
        });

        anteriorEsfinge8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_8.this, Moeda_16.class);
                startActivity(intent);
            };
        });
    }

}
