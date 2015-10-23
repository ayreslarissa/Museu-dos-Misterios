package ufam.promobile.museudosmisterios.Sandalia;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;

public class Sandalia_37 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_37);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_sandalia_37);
        final Button proximo1 = (Button) findViewById(R.id.button_sandalia_37_proximo1);
        final Button proximo2 = (Button) findViewById(R.id.button_sandalia_37_proximo2);
        final Button anterior1 = (Button) findViewById(R.id.button_sandalia_37_anterior1);
        final Button anterior2 = (Button) findViewById(R.id.button_sandalia_37_anterior2);
        final Button anterior3 = (Button) findViewById(R.id.button_sandalia_37_anterior3);

        texto.setText(R.string.sandalia_37_1);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.sandalia_37_2);
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
                anterior1.setVisibility(View.INVISIBLE);
                anterior2.setVisibility(View.VISIBLE);
            }
        });

        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.sandalia_37_3);
                proximo2.setVisibility(View.INVISIBLE);
                anterior2.setVisibility(View.INVISIBLE);
                anterior3.setVisibility(View.VISIBLE);
            }
        });

        anterior1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sandalia_37.this, Sandalia_23.class);
                startActivity(intent);
            }
        });

        anterior2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.sandalia_37_1);
                proximo1.setVisibility(View.VISIBLE);
                proximo2.setVisibility(View.INVISIBLE);
                anterior1.setVisibility(View.VISIBLE);
                anterior2.setVisibility(View.INVISIBLE);
                anterior3.setVisibility(View.INVISIBLE);
            }
        });

        anterior3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.sandalia_37_2);
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
                anterior1.setVisibility(View.INVISIBLE);
                anterior2.setVisibility(View.VISIBLE);
                anterior3.setVisibility(View.INVISIBLE);
            }
        });
    }

}
