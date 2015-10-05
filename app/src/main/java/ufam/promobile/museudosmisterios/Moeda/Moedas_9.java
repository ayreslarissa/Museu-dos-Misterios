package ufam.promobile.museudosmisterios.Moeda;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_31;

public class Moedas_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moedas_9);
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button anteriorMoeda9 = (Button) findViewById(R.id.button_moeda_9_anterior);
        final Button proximoMoeda9 = (Button) findViewById(R.id.button_moeda_9_proximo);
        final Button proximoMoeda9_2 = (Button) findViewById(R.id.button_moeda_9_proximo2);
        final TextView texto = (TextView) findViewById(R.id.textView_moeda_9_1);
        final ImageView imagem = (ImageView) findViewById(R.id.imageView_moeda_9);

        proximoMoeda9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_9_2);
                proximoMoeda9.setVisibility(View.INVISIBLE);
                proximoMoeda9_2.setVisibility(View.VISIBLE);
                imagem.setVisibility(View.VISIBLE);
            }
        });

        proximoMoeda9_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moedas_9.this, Vaso_31.class);
                startActivity(intent);
            }
        });

        anteriorMoeda9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_9_1);
                proximoMoeda9.setVisibility(View.VISIBLE);
                imagem.setVisibility(View.INVISIBLE);
            }
        });
    }


}
