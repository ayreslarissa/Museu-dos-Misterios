package ufam.promobile.museudosmisterios.Esfinge;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Capacete.Capacete_8;
import ufam.promobile.museudosmisterios.Passaro.Passaro_29;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_11;
import ufam.promobile.museudosmisterios.Vaso.Vaso_33;

public class Esfinge_36 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_36);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView banco = (TextView) findViewById(R.id.textView_esfinge_36_banco);
        final TextView cama= (TextView) findViewById(R.id.textView_esfinge_36_cama);

        banco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_36.this, Vaso_11.class);
                startActivity(intent);
            }
        });

        cama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_36.this, Passaro_29.class);
                startActivity(intent);
            }
        });
    }

}
