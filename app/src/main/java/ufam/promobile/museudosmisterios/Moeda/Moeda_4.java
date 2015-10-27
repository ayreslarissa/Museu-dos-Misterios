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

import ufam.promobile.museudosmisterios.Capacete.Capacete_30;
import ufam.promobile.museudosmisterios.Passaro.Passaro_16;
import ufam.promobile.museudosmisterios.R;

public class Moeda_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda_4);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //BOTÕES MESA
        final Button mesa34 = (Button) findViewById(R.id.btn_mesa_34);
        final Button mesa40 = (Button) findViewById(R.id.btn_mesa_40);
        final Button mesa46 = (Button) findViewById(R.id.btn_mesa_46);
        final Button mesa50 = (Button) findViewById(R.id.btn_mesa_50);
        final Button mesa56 = (Button) findViewById(R.id.btn_mesa_56);
        final Button mesa73 = (Button) findViewById(R.id.btn_mesa_73);

        //BOTÕES PRÓXIMO
        final Button proximo1 = (Button) findViewById(R.id.button_moeda_4_proximo1);
        final Button proximo2 = (Button) findViewById(R.id.button_moeda_4_proximo2);

        //BOTÕES ANTERIOR
        final Button anterior1 = (Button) findViewById(R.id.button_moeda_4_anterior1);
        final Button anterior2 = (Button) findViewById(R.id.button_moeda_4_anterior2);

        //TEXTO
        final TextView texto = (TextView) findViewById(R.id.textView_moeda_4);

        //IMAGENS
        final ImageView imagem_pergaminho = (ImageView) findViewById(R.id.img_moeda_4_pergaminho);
        final ImageView imagem_mesa = (ImageView) findViewById(R.id.img_moeda_4_mesa);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
                imagem_pergaminho.setVisibility(View.VISIBLE);
                texto.setVisibility(View.INVISIBLE);
                anterior1.setVisibility(View.VISIBLE);
            }
        });

        anterior1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximo1.setVisibility(View.VISIBLE);
                proximo2.setVisibility(View.INVISIBLE);
                imagem_pergaminho.setVisibility(View.INVISIBLE);
                texto.setVisibility(View.VISIBLE);
                anterior1.setVisibility(View.INVISIBLE);
            }
        });

        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.INVISIBLE);
                imagem_pergaminho.setVisibility(View.INVISIBLE);
                texto.setVisibility(View.INVISIBLE);
                anterior1.setVisibility(View.INVISIBLE);
                anterior2.setVisibility(View.VISIBLE);
                imagem_mesa.setVisibility(View.VISIBLE);
                mesa34.setVisibility(View.VISIBLE);
                mesa40.setVisibility(View.VISIBLE);
                mesa46.setVisibility(View.VISIBLE);
                mesa50.setVisibility(View.VISIBLE);
                mesa56.setVisibility(View.VISIBLE);
                mesa73.setVisibility(View.VISIBLE);
            }
        });

        anterior2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximo2.setVisibility(View.VISIBLE);
                imagem_pergaminho.setVisibility(View.VISIBLE);
                anterior1.setVisibility(View.VISIBLE);
                anterior2.setVisibility(View.INVISIBLE);
                imagem_mesa.setVisibility(View.INVISIBLE);
                mesa34.setVisibility(View.INVISIBLE);
                mesa40.setVisibility(View.INVISIBLE);
                mesa46.setVisibility(View.INVISIBLE);
                mesa50.setVisibility(View.INVISIBLE);
                mesa56.setVisibility(View.INVISIBLE);
                mesa73.setVisibility(View.INVISIBLE);
            }
        });

        mesa34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_4.this, Capacete_30.class);
                startActivity(intent);
            }
        });

        mesa40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_4.this, Capacete_30.class);
                startActivity(intent);
            }
        });

        mesa46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_4.this, Capacete_30.class);
                startActivity(intent);
            }
        });
        mesa56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_4.this, Capacete_30.class);
                startActivity(intent);
            }
        });

        mesa73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_4.this, Capacete_30.class);
                startActivity(intent);
            }
        });

        mesa50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_4.this, Passaro_16.class);
                startActivity(intent);
            }
        });
    }

}
