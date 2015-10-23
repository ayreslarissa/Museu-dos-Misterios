package ufam.promobile.museudosmisterios.Sandalia;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Passaro.Passaro_12;
import ufam.promobile.museudosmisterios.R;

public class Sandalia_41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_41);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textViewTexto_sandalia_41_1);
        final Button proximoSandalia_41_1 = (Button) findViewById(R.id.button_sandalia_41_proximo1);
        final Button proximoSandalia_41_2 = (Button) findViewById(R.id.button_sandalia_41_proximo2);
        final Button anteriorSandalia_41 = (Button) findViewById(R.id.button_sandalia_41_anterior);
        final Button anteriorSandalia2_41 = (Button) findViewById(R.id.button_sandalia_41_anterior2);

        texto.setText(R.string.sandalia_41_1);

        //Botão para passar o texto
        proximoSandalia_41_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.sandalia_41_2);
                proximoSandalia_41_1.setVisibility(View.INVISIBLE);
                proximoSandalia_41_2.setVisibility(View.VISIBLE);
            };
        });

        //Botão para passar o texto
        proximoSandalia_41_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.sandalia_41_3);
                proximoSandalia_41_2.setVisibility(View.INVISIBLE);

            };
        });

        anteriorSandalia_41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sandalia_41.this, Passaro_12.class);
                startActivity(intent);
            };
        });

        anteriorSandalia2_41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.sandalia_41_2);
                proximoSandalia_41_1.setVisibility(View.INVISIBLE);
                proximoSandalia_41_2.setVisibility(View.VISIBLE);
                anteriorSandalia_41.setVisibility(View.VISIBLE);
                anteriorSandalia2_41.setVisibility(View.INVISIBLE);
            };
        });
    }

}


