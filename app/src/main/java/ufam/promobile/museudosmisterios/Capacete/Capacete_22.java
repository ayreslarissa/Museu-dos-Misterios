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

import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_31;

public class Capacete_22 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capacete_22);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximo1Capacete22 = (Button) findViewById(R.id.button_capacete_22_proximo1);
        final Button proximo2Capacete22 = (Button) findViewById(R.id.button_capacete_22_proximo2);

        final Button voltarCapacete22 = (Button) findViewById(R.id.button_capacete_22_voltar);
        final TextView texto = (TextView) findViewById(R.id.textView_capacete_22_1);
        final ImageView imagem = (ImageView) findViewById(R.id.imageView_capacete_22);

        voltarCapacete22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_22.this, Vaso_31.class);
                startActivity(intent);
            }
        });


        proximo1Capacete22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.capacete_22_2);
                proximo1Capacete22.setVisibility(View.INVISIBLE);
                proximo2Capacete22.setVisibility(View.VISIBLE);
            }
        });

        proximo2Capacete22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.capacete_22_3);
                proximo2Capacete22.setVisibility(View.INVISIBLE);
                imagem.setVisibility(View.VISIBLE);
            }
        });


    }


}
