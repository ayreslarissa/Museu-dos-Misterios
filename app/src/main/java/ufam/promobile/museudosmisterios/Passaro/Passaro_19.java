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

import ufam.promobile.museudosmisterios.Capacete.Capacete_17;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_9;

public class Passaro_19 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passaro_19);

        // Orienta��o Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximo1 = (Button) findViewById(R.id.button_passaro_19_proximo1);
        final Button proximo2 = (Button) findViewById(R.id.button_passaro_19_proximo2);
        final Button proximo3= (Button) findViewById(R.id.button_passaro_19_proximo3);
        final TextView textogeral = (TextView) findViewById(R.id.txt_passaro_19_geral);
        final TextView textochao = (TextView) findViewById(R.id.txt_passaro_19_chao);
        final TextView textosec = (TextView) findViewById(R.id.txt_passaro_19_sec);
        final ImageView imagem = (ImageView) findViewById(R.id.img_passaro_19);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textogeral.setText(R.string.passaro_19_2);
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
                imagem.setVisibility(View.INVISIBLE);
            }
        });

        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textogeral.setVisibility(View.INVISIBLE);
                textochao.setVisibility(View.VISIBLE);
                proximo2.setVisibility(View.INVISIBLE);
                proximo3.setVisibility(View.VISIBLE);
                textosec.setVisibility(View.VISIBLE);
            }
        });

        proximo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialogBuilder.setTitle("Você possui as manoplas?");
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton("Possuo as manoplas", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Passaro_19.this, Sandalia_9.class);
                                startActivityForResult(i, 1);
                            }
                        })
                        .setNegativeButton("Não possuo as manoplas", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Passaro_19.this, Capacete_17.class);
                                startActivityForResult(i, 1);
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });
    }

}
