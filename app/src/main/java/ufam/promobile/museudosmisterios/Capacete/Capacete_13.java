package ufam.promobile.museudosmisterios.Capacete;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;

public class Capacete_13 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capacete_13);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //SINOS
        final ImageView imagemerrada1 = (ImageView) findViewById(R.id.img_capacete_13_flecha_1);
        final ImageView imagemerrada2 = (ImageView) findViewById(R.id.img_capacete_13_flecha_2);
        final ImageView imagemerrada3 = (ImageView) findViewById(R.id.img_capacete_13_flecha_3);
        final ImageView imagemerrada4 = (ImageView) findViewById(R.id.img_capacete_13_flecha_4);
        final ImageView imagemcerta5 = (ImageView) findViewById(R.id.img_capacete_13_flecha_5);
        final ImageView alvo = (ImageView) findViewById(R.id.imageView_capacete_13_alvo);

        //TEXTVIEWS
        final TextView texto = (TextView) findViewById(R.id.textView_capacete_13_1);
        final TextView txt_flecha_1 = (TextView) findViewById(R.id.txt_flecha_1);
        final TextView txt_flecha_2 = (TextView) findViewById(R.id.txt_flecha_2);
        final TextView txt_flecha_3 = (TextView) findViewById(R.id.txt_flecha_3);
        final TextView txt_flecha_4 = (TextView) findViewById(R.id.txt_flecha_4);
        final TextView txt_flecha_5 = (TextView) findViewById(R.id.txt_flecha_5);


        //BUTTON
        final Button proximo1 = (Button) findViewById(R.id.button_capacete_13_proximo1);
        final Button proximo2 = (Button) findViewById(R.id.button_capacete_13_proximo2);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
                texto.setVisibility(View.INVISIBLE);
                alvo.setVisibility(View.VISIBLE);
            }
        });
        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                proximo2.setVisibility(View.INVISIBLE);
                texto.setVisibility(View.INVISIBLE);
                alvo.setVisibility(View.INVISIBLE);
                imagemerrada1.setVisibility(View.VISIBLE);
                imagemerrada2.setVisibility(View.VISIBLE);
                imagemerrada3.setVisibility(View.VISIBLE);
                imagemerrada4.setVisibility(View.VISIBLE);
                imagemcerta5.setVisibility(View.VISIBLE);
                txt_flecha_1.setVisibility(View.VISIBLE);
                txt_flecha_2.setVisibility(View.VISIBLE);
                txt_flecha_3.setVisibility(View.VISIBLE);
                txt_flecha_4.setVisibility(View.VISIBLE);
                txt_flecha_5.setVisibility(View.VISIBLE);

            }
        });

        imagemerrada1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_13.this, Capacete_5.class);
                startActivity(intent);
            }
        });

        imagemerrada2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_13.this, Capacete_5.class);
                startActivity(intent);
            }
        });

        imagemerrada3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_13.this, Capacete_5.class);
                startActivity(intent);
            }
        });

        imagemerrada4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_13.this, Capacete_5.class);
                startActivity(intent);
            }
        });

        imagemcerta5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capacete_13.this, Capacete_42.class);
                startActivity(intent);
            }
        });

    }

}
