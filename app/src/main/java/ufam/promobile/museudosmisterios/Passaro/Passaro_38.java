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
import ufam.promobile.museudosmisterios.Vaso.Vaso_18;

public class Passaro_38 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passaro_38);


        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximo1 = (Button) findViewById(R.id.button_passaro_38_proximo1);
        final Button proximo2 = (Button) findViewById(R.id.button_passaro_38_proximo2);
        final TextView texto = (TextView) findViewById(R.id.textView_passaro_38_1);
        final ImageView imagem = (ImageView) findViewById(R.id.img_passaro_38);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
                texto.setText(R.string.passaro_38_2);
                imagem.setVisibility(View.VISIBLE);
            }
        });

        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialogBuilder.setTitle("Você possui o amuleto viquingue?");
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton("Sim, possuo", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Passaro_38.this, Vaso_18.class);
                                startActivityForResult(i, 1);
                            }
                        })
                        .setNegativeButton("Não possuo", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Passaro_38.this, Capacete_17.class);
                                startActivityForResult(i, 1);
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });
    }

}
