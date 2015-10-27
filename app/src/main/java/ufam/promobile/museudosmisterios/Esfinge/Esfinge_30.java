package ufam.promobile.museudosmisterios.Esfinge;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Capacete.Capacete_10;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_33;

public class Esfinge_30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_30);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto1 = (TextView) findViewById(R.id.textView_esfinge_30_1);
        final TextView texto2 = (TextView) findViewById(R.id.textView_esfinge_30_2);
        final TextView texto3 = (TextView) findViewById(R.id.textView_esfinge_30_3);
        final TextView proximo = (TextView) findViewById(R.id.textView_esfinge_30_proximo);
        final ImageView imagemA = (ImageView) findViewById(R.id.imageView_esfinge_30_a);
        final ImageView imagemB = (ImageView) findViewById(R.id.imageView_esfinge_30_b);
        final ImageView imagemC = (ImageView) findViewById(R.id.imageView_esfinge_30_c);
        final ImageView imagemD = (ImageView) findViewById(R.id.imageView_esfinge_30_d);

        texto1.setText(R.string.esfinge_30_1);
        texto2.setText(R.string.esfinge_30_2);
        texto3.setText(R.string.esfinge_30_3);

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximo.setVisibility(View.INVISIBLE);
                texto1.setVisibility(View.INVISIBLE);
                texto2.setVisibility(View.VISIBLE);
                texto3.setVisibility(View.VISIBLE);
                imagemA.setVisibility(View.VISIBLE);
                imagemB.setVisibility(View.VISIBLE);
                imagemC.setVisibility(View.VISIBLE);
                imagemD.setVisibility(View.VISIBLE);
            }
        });

        imagemA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_30.this, Capacete_10.class);
                startActivity(intent);
            }
        });

        imagemB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_30.this, Capacete_10.class);
                startActivity(intent);
            }
        });

        imagemC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_30.this, Vaso_33.class);
                startActivity(intent);
            }
        });

        imagemD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_30.this, Capacete_10.class);
                startActivity(intent);
            }
        });

    }
}
