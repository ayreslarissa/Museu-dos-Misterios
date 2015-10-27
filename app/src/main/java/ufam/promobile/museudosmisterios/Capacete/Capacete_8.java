package ufam.promobile.museudosmisterios.Capacete;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Moeda.Moeda_38;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_21;

public class Capacete_8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capacete_8);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_capacete_8_1);
        final TextView proximo = (TextView) findViewById(R.id.textView_capacete_8_proximo);
        final TextView bilhete = (TextView) findViewById(R.id.textView_capacete_8_2);
        final TextView primos = (TextView) findViewById(R.id.textView_capacete_8_primos);
        final TextView quadrados = (TextView) findViewById(R.id.textView_capacete_8_quadrado);
        final ImageView imagem = (ImageView) findViewById(R.id.imageView_capacete_8);

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setVisibility(View.INVISIBLE);
                proximo.setVisibility(View.INVISIBLE);
                bilhete.setVisibility(View.VISIBLE);
                primos.setVisibility(View.VISIBLE);
                quadrados.setVisibility(View.VISIBLE);
                imagem.setVisibility(View.VISIBLE);
            }
        });

        primos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_8.this, Moeda_38.class);
                startActivity(intent);
            }
        });

        quadrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_8.this, Vaso_21.class);
                startActivity(intent);
            }
        });
    }

}
