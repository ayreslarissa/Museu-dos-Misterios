package ufam.promobile.museudosmisterios.Passaro;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Moeda.Moeda_33;
import ufam.promobile.museudosmisterios.R;

public class Passaro_7 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passaro_7);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button anteriorPassaro7 = (Button) findViewById(R.id.button_passaro_7_anterior);
        final TextView texto = (TextView) findViewById(R.id.textView_passaro_7_1);
        final Button proximo1Passaro7 = (Button) findViewById(R.id.button_passaro_7_proximo1);
        final Button proximo2Passaro7 = (Button) findViewById(R.id.button_passaro_7_proximo2);
        final ImageView imagem_armadura = (ImageView) findViewById(R.id.imageView_passaro_7_1);
        final ImageView imagem_escudo = (ImageView) findViewById(R.id.imageView_passaro_7_2);

        anteriorPassaro7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.passaro_7_1);
                proximo1Passaro7.setVisibility(View.VISIBLE);
                proximo2Passaro7.setVisibility(View.INVISIBLE);
                anteriorPassaro7.setVisibility(View.INVISIBLE);
                imagem_armadura.setVisibility(View.VISIBLE);
                imagem_escudo.setVisibility(View.INVISIBLE);
            }
        });


        proximo1Passaro7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.capacete_14_2);
                proximo1Passaro7.setVisibility(View.INVISIBLE);
                proximo2Passaro7.setVisibility(View.VISIBLE);
                anteriorPassaro7.setVisibility(View.VISIBLE);
                imagem_armadura.setVisibility(View.INVISIBLE);
                imagem_escudo.setVisibility(View.VISIBLE);
            }
        });

        proximo2Passaro7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Passaro_7.this, Moeda_33.class);
                startActivity(intent);
            }
        });
    }

}
