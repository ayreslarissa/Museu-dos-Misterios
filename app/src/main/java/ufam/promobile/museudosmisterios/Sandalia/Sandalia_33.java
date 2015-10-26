package ufam.promobile.museudosmisterios.Sandalia;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_17;
import ufam.promobile.museudosmisterios.R;

public class Sandalia_33 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_33);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_sandalia_33);
        final Button proximo = (Button) findViewById(R.id.button_sandalia_33_proximo1);
        final Button anterior1 = (Button) findViewById(R.id.button_sandalia_33_anterior1);
        final Button anterior2 = (Button) findViewById(R.id.button_sandalia_33_anterior2);

        texto.setText(R.string.sandalia_33_1);

        anterior1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sandalia_33.this, Esfinge_17.class);
                startActivity(intent);
            }
        });
        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.sandalia_33_2);
                anterior1.setVisibility(View.INVISIBLE);
                anterior2.setVisibility(View.VISIBLE);
                proximo.setVisibility(View.INVISIBLE);
            }
        });

        anterior2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.sandalia_33_1);
                anterior1.setVisibility(View.VISIBLE);
                anterior2.setVisibility(View.INVISIBLE);
                proximo.setVisibility(View.VISIBLE);
            }
        });

    }

}
