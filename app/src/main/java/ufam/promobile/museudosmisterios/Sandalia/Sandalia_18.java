package ufam.promobile.museudosmisterios.Sandalia;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Capacete.Capacete_41;
import ufam.promobile.museudosmisterios.Moeda.Moeda_31;
import ufam.promobile.museudosmisterios.Passaro.Passaro_22;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_37;

public class Sandalia_18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_18);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_sandalia_18_1);
        final TextView dica = (TextView) findViewById(R.id.textView_sandalia_18_2);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        texto.setText(R.string.sandalia_18_1);
        dica.setText(R.string.sandalia_18_2);

        dica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final EditText edittext = new EditText(getApplicationContext());
                final String resposta = "12";

                alertDialogBuilder.setTitle(R.string.sandalia_18_3);
                alertDialogBuilder.setView(edittext);
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton("Cortar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                if (edittext.getText().toString().equals(resposta)) {
                                    Intent i = new Intent(Sandalia_18.this, Moeda_31.class);
                                    startActivityForResult(i, 1);
                                } else {
                                    Intent i = new Intent(Sandalia_18.this, Capacete_41.class);
                                    startActivityForResult(i, 1);
                                }
                            }
                        })
                        .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                alertDialogBuilder.setCancelable(true);
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });
    }

}
