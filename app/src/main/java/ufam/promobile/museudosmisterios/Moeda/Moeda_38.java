package ufam.promobile.museudosmisterios.Moeda;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Capacete.Capacete_8;
import ufam.promobile.museudosmisterios.R;

public class Moeda_38 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda_38);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_moeda_38);
        final TextView proximo = (TextView) findViewById(R.id.textView_moeda_38_proximo);
        final TextView voltar = (TextView) findViewById(R.id.textView_moeda_38_voltar);

        texto.setText(R.string.moeda_38_1);

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_38_2);
                proximo.setVisibility(View.INVISIBLE);
                voltar.setVisibility(View.VISIBLE);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_38.this, Capacete_8.class);
                startActivity(intent);
            }
        });
    }

}
