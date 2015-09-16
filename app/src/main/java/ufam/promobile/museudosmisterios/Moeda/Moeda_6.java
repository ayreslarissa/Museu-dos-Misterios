package ufam.promobile.museudosmisterios.Moeda;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Passaro.Passaro_32;
import ufam.promobile.museudosmisterios.Passaro.Passaro_34;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_28;

public class Moeda_6 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda_6);


        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximoMoeda6 = (Button) findViewById(R.id.button_moeda_6_proximo);
        final Button anteriorMoeda6 = (Button) findViewById(R.id.button_moeda_6_anterior);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        proximoMoeda6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialogBuilder.setTitle("Qual o número da caixa que está a pista?");
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton("Caixa IV", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Moeda_6.this, Passaro_32.class);
                                startActivityForResult(i, 1);
                            }
                        })
                        .setNegativeButton("Caixa VI", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Moeda_6.this, Passaro_34.class);
                                startActivityForResult(i, 1);
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        anteriorMoeda6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Moeda_6.this, Sandalia_28.class);
                startActivity(intent);
            }
        });
    }

}
