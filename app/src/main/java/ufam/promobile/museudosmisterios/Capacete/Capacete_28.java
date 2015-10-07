package ufam.promobile.museudosmisterios.Capacete;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Passaro.Passaro_7;
import ufam.promobile.museudosmisterios.R;

public class Capacete_28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capacete_28);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button anteriorCapacete28 = (Button) findViewById(R.id.button_capacete_28_anterior);
        final TextView texto = (TextView) findViewById(R.id.textView_capacete_28_1);
        final Button proximo1Capacete28 = (Button) findViewById(R.id.button_capacete_28_proximo1);
        final Button proximo2Capacete28 = (Button) findViewById(R.id.button_capacete_28_proximo2);

        anteriorCapacete28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.capacete_28_1);
                proximo1Capacete28.setVisibility(View.VISIBLE);
                proximo2Capacete28.setVisibility(View.INVISIBLE);
                anteriorCapacete28.setVisibility(View.INVISIBLE);
            }
        });


        proximo1Capacete28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.capacete_14_2);
                proximo1Capacete28.setVisibility(View.INVISIBLE);
                proximo2Capacete28.setVisibility(View.VISIBLE);
                anteriorCapacete28.setVisibility(View.VISIBLE);
            }
        });

        proximo2Capacete28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_28.this, Passaro_7.class);
                startActivity(intent);
            }
        });

    }


}
