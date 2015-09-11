package ufam.promobile.museudosmisterios;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Instrucoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucoes);
        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textViewTexto);
        final TextView proximo1 = (TextView) findViewById(R.id.textViewProximo1);
        final TextView proximo2 = (TextView) findViewById(R.id.textViewProximo2);
        final TextView proximo3 = (TextView) findViewById(R.id.textViewProximo3);
        final TextView proximo4 = (TextView) findViewById(R.id.textViewProximo4);
        final TextView anterior = (TextView) findViewById(R.id.textView3);
        //Botão para passar o texto
        proximo1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               texto.setText(R.string.text_instrucoes_2);
               proximo1.setVisibility(View.INVISIBLE);
               proximo2.setVisibility(View.VISIBLE);
            };
        });

        //Botão para passar o texto
        proximo2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.text_instrucoes_3);
                proximo2.setVisibility(View.INVISIBLE);
                proximo3.setVisibility(View.VISIBLE);
            };
        });

        //Botão para passar o texto
        proximo3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.text_instrucoes_4);
                        proximo3.setVisibility(View.INVISIBLE);
                proximo4.setVisibility(View.VISIBLE);
            };
        });
        anterior.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Instrucoes.this, Play.class);
                startActivity(intent);
            };
        });
    }


}
