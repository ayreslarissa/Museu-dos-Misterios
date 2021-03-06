package ufam.promobile.museudosmisterios.Sandalia;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_22;
import ufam.promobile.museudosmisterios.Moeda.Moedas_9;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_15;

public class Sandalia_35 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_35);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximoSandalia35 = (Button) findViewById(R.id.button_sandalia_35_proximo1);
        final Button anteriorSandalia35 = (Button) findViewById(R.id.button_sandalia_35_anterior);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        proximoSandalia35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialogBuilder.setTitle("Qual o padrão correto?");
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton("B", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Sandalia_35.this, Moedas_9.class);
                                startActivityForResult(i, 1);
                            }
                        })
                        .setNegativeButton("A", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Sandalia_35.this, Vaso_15.class);
                                startActivityForResult(i, 1);
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        anteriorSandalia35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Sandalia_35.this, Esfinge_22.class);
                startActivity(intent);
            }
        });

    }

}
