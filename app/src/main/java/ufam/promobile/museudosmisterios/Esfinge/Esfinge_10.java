package ufam.promobile.museudosmisterios.Esfinge;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Capacete.Capacete_26;
import ufam.promobile.museudosmisterios.Moeda.Moeda_27;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_26;

public class Esfinge_10 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_10);

        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximoEsfinge = (Button) findViewById(R.id.button_esfinge_10_proximo);
        final Button anteriorEsfinge = (Button) findViewById(R.id.button_esfinge_10_anterior);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        proximoEsfinge.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                alertDialogBuilder.setTitle("Qual vaso você escolhe?");
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton(" Vaso 24", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Esfinge_10.this, Vaso_26.class);
                                startActivityForResult(i, 1);
                            }
                        })
                        .setNegativeButton("Vaso 25", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Esfinge_10.this, Moeda_27.class);
                                startActivityForResult(i, 1);
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

            ;
        });

        anteriorEsfinge.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_10.this, Capacete_26.class);
                startActivity(intent);

            }
         });
    }
}
