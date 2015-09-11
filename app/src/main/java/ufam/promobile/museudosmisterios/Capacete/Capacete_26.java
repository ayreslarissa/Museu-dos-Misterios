package ufam.promobile.museudosmisterios.Capacete;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_10;
import ufam.promobile.museudosmisterios.R;

public class Capacete_26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capacete_26);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button capacete_26_proximo = (Button) findViewById(R.id.button_capacete_26_proximo);
        final Button capacete_26_anterior = (Button) findViewById(R.id.button_capacete_26_anterior);

        //Botão para virar a página
        capacete_26_proximo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_26.this, Esfinge_10.class);
                startActivity(intent);
            }
        });

        capacete_26_anterior.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_26.this, Capacete_17.class);
                startActivity(intent);
            }
        });
    }

}
