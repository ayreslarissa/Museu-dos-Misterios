package ufam.promobile.museudosmisterios;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Capacete.Capacete_17;
import ufam.promobile.museudosmisterios.Moeda.Moeda_15;

public class Play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Componentes Padrões
        final TextView textView = (TextView) findViewById(R.id.textView);
        final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        final TextView proximoIntroducao2 = (TextView) findViewById(R.id.proximoIntroducao2);
        final TextView proximoIntroducao3 = (TextView) findViewById(R.id.proximoIntroducao3);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        //Botão para passar o texto
        proximoIntroducao2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(R.string.text_instrucoes_2);
                imageView2.setVisibility(View.INVISIBLE);
                proximoIntroducao2.setVisibility(View.INVISIBLE);
                proximoIntroducao3.setVisibility(View.VISIBLE);
            };
        });

        proximoIntroducao3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                alertDialogBuilder.setTitle("Você está pronto para o desafio?");
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(false)
                        .setPositiveButton("Sim, vamos lá!", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Play.this, Capacete_17.class);
                                startActivityForResult(i, 1);
                            }
                        })
                        .setNegativeButton("Não, talvez depois!      ", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Play.this, Moeda_15.class);
                                startActivityForResult(i, 1);
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

            ;
        });

    }

}
