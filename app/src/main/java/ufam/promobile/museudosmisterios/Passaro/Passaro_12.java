package ufam.promobile.museudosmisterios.Passaro;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_23;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_41;

public class Passaro_12 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passaro_12);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button anteriorPassaro12 = (Button) findViewById(R.id.button_passaro_12_anterior);
        final TextView texto = (TextView) findViewById(R.id.textView_passaro_12_1);
        final Button proximo1Passaro12 = (Button) findViewById(R.id.button_passaro_12_proximo1);
        final Button proximo2Passaro12 = (Button) findViewById(R.id.button_passaro_12_proximo2);
        final ImageView imagem_mapa = (ImageView) findViewById(R.id.imageView_passaro_12_1);
        final ImageView imagem_bilhete = (ImageView) findViewById(R.id.imageView_passaro_12_2);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        anteriorPassaro12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.passaro_12_1);
                proximo1Passaro12.setVisibility(View.VISIBLE);
                proximo2Passaro12.setVisibility(View.INVISIBLE);
                anteriorPassaro12.setVisibility(View.INVISIBLE);
                imagem_mapa.setVisibility(View.VISIBLE);
                imagem_bilhete.setVisibility(View.INVISIBLE);
            }
        });


        proximo1Passaro12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.passaro_12_2);
                proximo1Passaro12.setVisibility(View.INVISIBLE);
                proximo2Passaro12.setVisibility(View.VISIBLE);
                anteriorPassaro12.setVisibility(View.VISIBLE);
                imagem_mapa.setVisibility(View.INVISIBLE);
                imagem_bilhete.setVisibility(View.VISIBLE);
            }
        });

        proximo2Passaro12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialogBuilder.setTitle("Qual Exposição você quer visitar?");
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton("Exposição 7", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Passaro_12.this, Sandalia_23.class);
                                startActivityForResult(i, 1);
                            }
                        })
                        .setNegativeButton("Exposição 9", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Passaro_12.this, Sandalia_41.class);
                                startActivityForResult(i, 1);
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }


}
