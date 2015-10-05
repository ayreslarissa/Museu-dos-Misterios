package ufam.promobile.museudosmisterios.Capacete;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;

public class Capacete_14 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capacete_14);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }
        final Button anteriorCapacete14 = (Button) findViewById(R.id.button_capacete_14_anterior);
        final TextView texto = (TextView) findViewById(R.id.textView_capacete_14_1);
        final Button proximo1Capacete14 = (Button) findViewById(R.id.button_capacete_14_proximo1);
        final Button proximo2Capacete14 = (Button) findViewById(R.id.button_capacete_14_proximo2);

        anteriorCapacete14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.capacete_14_1);
                proximo1Capacete14.setVisibility(View.VISIBLE);
                proximo2Capacete14.setVisibility(View.INVISIBLE);
                anteriorCapacete14.setVisibility(View.INVISIBLE);
            }
        });


        proximo1Capacete14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.capacete_14_2);
                proximo1Capacete14.setVisibility(View.INVISIBLE);
                proximo2Capacete14.setVisibility(View.VISIBLE);
                anteriorCapacete14.setVisibility(View.VISIBLE);
            }
        });

        proximo2Capacete14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_14.this, Capacete_17.class);
                startActivity(intent);
            }
        });

    }

}
