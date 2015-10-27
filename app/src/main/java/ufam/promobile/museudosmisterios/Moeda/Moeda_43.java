package ufam.promobile.museudosmisterios.Moeda;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_35;
import ufam.promobile.museudosmisterios.R;

public class Moeda_43 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda_43);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //TEXTVIEWS
        final TextView texto = (TextView) findViewById(R.id.textView_moeda_43_1);

        //BUTTON
        final Button proximo1 = (Button) findViewById(R.id.button_moeda_43_proximo1);
        final Button proximo2 = (Button) findViewById(R.id.button_moeda_43_proximo2);
        final Button proximo3 = (Button) findViewById(R.id.button_moeda_43_proximo3);
        final Button proximo4 = (Button) findViewById(R.id.button_moeda_43_proximo4);



        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_43_2);
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);

            }
        });

        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_43_3);
                proximo2.setVisibility(View.INVISIBLE);
                proximo3.setVisibility(View.VISIBLE);

            }
        });

        proximo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_43_4);
                proximo3.setVisibility(View.INVISIBLE);
                proximo4.setVisibility(View.VISIBLE);

            }
        });

        proximo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_43.this, Esfinge_35.class);
                startActivity(intent);

            }
        });
    }

}
