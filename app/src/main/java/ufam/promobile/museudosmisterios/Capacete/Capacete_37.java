package ufam.promobile.museudosmisterios.Capacete;

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

public class Capacete_37 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capacete_37);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button anteriorCapacete37 = (Button) findViewById(R.id.button_capacete_37_anterior);
        final TextView texto = (TextView) findViewById(R.id.textView_capacete_37_1);
        final Button proximo1Capacete37 = (Button) findViewById(R.id.button_capacete_37_proximo1);
        final Button anterior2Capacete37= (Button) findViewById(R.id.button_capacete_37_anterior2);
        final ImageView imagem = (ImageView) findViewById(R.id.imageView_capacete_37);


        anteriorCapacete37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.capacete_37_1);
                proximo1Capacete37.setVisibility(View.VISIBLE);
                anteriorCapacete37.setVisibility(View.INVISIBLE);
                anterior2Capacete37.setVisibility(View.VISIBLE);
                imagem.setVisibility(View.INVISIBLE);

            }
        });


        proximo1Capacete37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.capacete_37_2);
                proximo1Capacete37.setVisibility(View.INVISIBLE);
                anterior2Capacete37.setVisibility(View.INVISIBLE);
                anteriorCapacete37.setVisibility(View.VISIBLE);
                imagem.setVisibility(View.VISIBLE);
            }
        });

        anterior2Capacete37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_37.this, Moeda_33.class);
                startActivity(intent);
            }
        });
    }

}
