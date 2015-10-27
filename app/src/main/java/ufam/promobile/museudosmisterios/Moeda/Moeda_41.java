package ufam.promobile.museudosmisterios.Moeda;


import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_14;

public class Moeda_41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda_41);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_moeda_41);
        final TextView anterior1 = (TextView) findViewById(R.id.textView_moeda_41_anterior_1);
        final TextView voltar = (TextView) findViewById(R.id.textView_moeda_41_voltar);
        final TextView proximo1 = (TextView) findViewById(R.id.textView_moeda_41_proximo_1);
        final TextView proximo2 = (TextView) findViewById(R.id.textView_moeda_41_proximo_2);

        texto.setText(R.string.moeda_41_1);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_41_2);
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
                anterior1.setVisibility(View.VISIBLE);
            }
        });

        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_41_3);
                proximo2.setVisibility(View.INVISIBLE);
                anterior1.setVisibility(View.INVISIBLE);
                voltar.setVisibility(View.VISIBLE);
            }
        });

        anterior1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_41_1);
                proximo1.setVisibility(View.VISIBLE);
                proximo2.setVisibility(View.INVISIBLE);
                anterior1.setVisibility(View.INVISIBLE);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
