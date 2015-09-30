package ufam.promobile.museudosmisterios.Sandalia;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_22;
import ufam.promobile.museudosmisterios.Esfinge.Esfinge_5;
import ufam.promobile.museudosmisterios.R;

public class Sandalia_15 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_15);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_sandalia_15_1);
        final ImageView imagem1 = (ImageView) findViewById(R.id.imageView_sandalia_15_1);
        final ImageView imagem2 = (ImageView) findViewById(R.id.imageView_sandalia_15_2);
        final Button proximoSandalia15_1 = (Button) findViewById(R.id.button_sandalia_15_proximo1);
        final Button proximoSandalia15_2 = (Button) findViewById(R.id.button_sandalia_15_proximo2);
        final Button anteriorSandalia15 = (Button) findViewById(R.id.button_sandalia_15_anterior);


        texto.setText(R.string.sandalia_15_1);

        //Botão para passar o texto
        proximoSandalia15_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.sandalia_15_2);
                proximoSandalia15_1.setVisibility(View.INVISIBLE);
                proximoSandalia15_2.setVisibility(View.VISIBLE);
                imagem1.setVisibility(View.VISIBLE);
                imagem2.setVisibility(View.VISIBLE);

            };
        });

        //Botão para passar o texto
        proximoSandalia15_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sandalia_15.this, Esfinge_22.class);
                startActivity(intent);

            };
        });

        anteriorSandalia15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sandalia_15.this, Esfinge_5.class);
                startActivity(intent);
            }

            ;
        });

    }

}
