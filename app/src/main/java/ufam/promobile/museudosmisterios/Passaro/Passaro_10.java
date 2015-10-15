package ufam.promobile.museudosmisterios.Passaro;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Moeda.Moeda_12;
import ufam.promobile.museudosmisterios.R;

public class Passaro_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passaro_10);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_passaro_10);
        final ImageView imagem = (ImageView) findViewById(R.id.imageView_passaro_10);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        texto.setText(R.string.passaro_10_1);

        imagem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final EditText edittext = new EditText(getApplicationContext());
                final String resposta = "9";

                alertDialogBuilder.setTitle("Quantas vezes você precisa soprar o berrante?");
                alertDialogBuilder.setView(edittext);
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton("Soprar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                if (edittext.getText().toString().equals(resposta)) {
                                    Intent i = new Intent(Passaro_10.this, Moeda_12.class);
                                    startActivityForResult(i, 1);
                                } else {
                                    Intent i = new Intent(Passaro_10.this, Passaro_42.class);
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
