package ufam.promobile.museudosmisterios.Esfinge;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import ufam.promobile.museudosmisterios.R;

public class Esfinge_34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_34);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_esfinge_34);
        final TextView texto2 = (TextView) findViewById(R.id.textView_esfinge_34_2);
        final TextView proximo1 = (TextView) findViewById(R.id.textView_esfinge_34_proximo1);
        final TextView proximo2 = (TextView) findViewById(R.id.textView_esfinge_34_proximo2);
        final TextView proximo3= (TextView) findViewById(R.id.textView_esfinge_34_proximo3);
        final TextView proximo4= (TextView) findViewById(R.id.textView_esfinge_34_proximo4);
        final TextView anterior1 = (TextView) findViewById(R.id.textView_esfinge_34_anterior1);
        final TextView anterior2 = (TextView) findViewById(R.id.textView_esfinge_34_anterior2);
        final TextView anterior3 = (TextView) findViewById(R.id.textView_esfinge_34_anterior3);
        final ImageView imagem= (ImageView) findViewById(R.id.imageView_esfinge_34);

        texto.setText(R.string.esfinge_34_1);

        //Botão para passar o texto
        proximo1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.esfinge_34_2);
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
                anterior1.setVisibility(View.VISIBLE);
            }

            ;
        });

        //Botão para passar o texto
        proximo2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.esfinge_34_3);
                proximo2.setVisibility(View.INVISIBLE);
                proximo3.setVisibility(View.VISIBLE);
                anterior1.setVisibility(View.INVISIBLE);
                anterior2.setVisibility(View.VISIBLE);
            }

            ;
        });

        //Botão para passar o texto
        proximo3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setVisibility(View.INVISIBLE);
                texto2.setVisibility(View.VISIBLE);
                imagem.setVisibility(View.VISIBLE);
                proximo3.setVisibility(View.INVISIBLE);
                proximo4.setVisibility(View.VISIBLE);
                anterior2.setVisibility(View.INVISIBLE);
                anterior3.setVisibility(View.VISIBLE);
            };
        });

        //Botão para voltar o texto
        anterior1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.esfinge_34_1);
                proximo1.setVisibility(View.VISIBLE);
                proximo2.setVisibility(View.INVISIBLE);
                anterior1.setVisibility(View.INVISIBLE);
            };
        });

        //Botão para voltar o texto
        anterior2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.esfinge_34_2);
                proximo2.setVisibility(View.VISIBLE);
                proximo3.setVisibility(View.INVISIBLE);
                anterior1.setVisibility(View.VISIBLE);
                anterior2.setVisibility(View.INVISIBLE);
            };
        });

        //Botão para voltar o texto
        anterior3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.esfinge_34_3);
                texto.setVisibility(View.VISIBLE);
                texto2.setVisibility(View.INVISIBLE);
                imagem.setVisibility(View.INVISIBLE);
                proximo3.setVisibility(View.VISIBLE);
                proximo4.setVisibility(View.INVISIBLE);
                anterior2.setVisibility(View.VISIBLE);
                anterior3.setVisibility(View.INVISIBLE);
            };
        });

        //Botão para mudar a Activity
        proximo4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_34.this, Esfinge_32.class);
                startActivity(intent);
            };
        });

    }
}
