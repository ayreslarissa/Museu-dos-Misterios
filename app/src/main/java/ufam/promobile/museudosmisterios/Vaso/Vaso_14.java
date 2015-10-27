package ufam.promobile.museudosmisterios.Vaso;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Capacete.Capacete_17;
import ufam.promobile.museudosmisterios.Esfinge.Esfinge_19;
import ufam.promobile.museudosmisterios.Moeda.Moeda_15;
import ufam.promobile.museudosmisterios.Moeda.Moeda_41;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_35;

public class Vaso_14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaso_14);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_vaso_14);
        final TextView anterior1 = (TextView) findViewById(R.id.textView_vaso_14_anterior_1);
        final TextView anterior2 = (TextView) findViewById(R.id.textView_vaso_14_anterior_2);
        final TextView anterior3 = (TextView) findViewById(R.id.textView_vaso_14_anterior_3);
        final TextView proximo1 = (TextView) findViewById(R.id.textView_vaso_14_proximo_1);
        final TextView proximo2 = (TextView) findViewById(R.id.textView_vaso_14_proximo_2);
        final TextView proximo3 = (TextView) findViewById(R.id.textView_vaso_14_proximo_3);
        final ImageView imagem = (ImageView) findViewById(R.id.imageView_vaso_14);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        texto.setText(R.string.vaso_14_1);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.vaso_14_2);
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
                anterior1.setVisibility(View.VISIBLE);
            }
        });

        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.vaso_14_3);
                proximo2.setVisibility(View.INVISIBLE);
                proximo3.setVisibility(View.VISIBLE);
                anterior1.setVisibility(View.INVISIBLE);
                anterior2.setVisibility(View.VISIBLE);
            }
        });

        proximo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setVisibility(View.INVISIBLE);
                imagem.setVisibility(View.VISIBLE);
                proximo3.setVisibility(View.INVISIBLE);
                anterior2.setVisibility(View.INVISIBLE);
                anterior3.setVisibility(View.VISIBLE);
            }
        });

        anterior1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.vaso_14_1);
                proximo1.setVisibility(View.VISIBLE);
                proximo2.setVisibility(View.INVISIBLE);
                anterior1.setVisibility(View.INVISIBLE);
            }
        });

        anterior2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.vaso_14_2);
                proximo2.setVisibility(View.VISIBLE);
                proximo3.setVisibility(View.INVISIBLE);
                anterior1.setVisibility(View.VISIBLE);
                anterior2.setVisibility(View.INVISIBLE);
            }
        });

        anterior3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setVisibility(View.VISIBLE);
                texto.setText(R.string.vaso_14_3);
                proximo3.setVisibility(View.VISIBLE);
                anterior2.setVisibility(View.VISIBLE);
                anterior3.setVisibility(View.INVISIBLE);
                imagem.setVisibility(View.INVISIBLE);
            }
        });

        imagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialogBuilder.setTitle("Qual trinco você deve girar?");
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton("7.700", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Vaso_14.this, Esfinge_19.class);
                                startActivityForResult(i, 1);
                            }
                        })
                        .setNegativeButton("7.600", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Vaso_14.this, Moeda_41.class);
                                startActivityForResult(i, 1);
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }
}
