package ufam.promobile.museudosmisterios.Esfinge;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_15;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_35;

public class Esfinge_22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_22);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_esfinge_22_1);
        final Button proximoEsfinge22_1 = (Button) findViewById(R.id.button_esfinge_22_proximo1);
        final Button proximoEsfinge22_2 = (Button) findViewById(R.id.button_esfinge_22_proximo2);
        final Button anteriorEsfinge22_1 = (Button) findViewById(R.id.button_esfinge_22_anterior);


        texto.setText(R.string.esfinge_22_1);

        //Botão para passar o texto
        proximoEsfinge22_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.esfinge_22_2);
                proximoEsfinge22_1.setVisibility(View.INVISIBLE);
                proximoEsfinge22_2.setVisibility(View.VISIBLE);
            }
        });

        //Botão para passar o texto
        proximoEsfinge22_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_22.this, Sandalia_35.class);
                startActivity(intent);

            };
        });

        anteriorEsfinge22_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_22.this, Sandalia_15.class);
                startActivity(intent);
            }

            ;
        });

    }

}
