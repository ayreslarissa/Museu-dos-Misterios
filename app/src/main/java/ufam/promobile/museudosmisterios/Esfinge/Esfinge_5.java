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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Passaro.Passaro_22;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_15;
import ufam.promobile.museudosmisterios.Vaso.Vaso_37;

public class Esfinge_5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_5);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textViewTexto_esfinge_5_1);
        final ImageView imagem1 = (ImageView) findViewById(R.id.imageView_esfinge_5_1);
        final ImageView imagem2 = (ImageView) findViewById(R.id.imageView_esfinge_5_2);
        final Button proximoEsfinge5_1 = (Button) findViewById(R.id.button_esfinge_5_proximo1);
        final Button proximoEsfinge5_2 = (Button) findViewById(R.id.button_esfinge_5_proximo2);
        final Button proximoEsfinge5_3 = (Button) findViewById(R.id.button_esfinge_5_proximo3);
        final Button anteriorEsfinge5 = (Button) findViewById(R.id.button_esfinge_5_anterior);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        texto.setText(R.string.esfinge_5_1);

        //Botão para passar o texto
        proximoEsfinge5_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.esfinge_5_2);
                proximoEsfinge5_1.setVisibility(View.INVISIBLE);
                proximoEsfinge5_2.setVisibility(View.VISIBLE);
            };
        });

        //Botão para passar o texto
        proximoEsfinge5_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.esfinge_5_3);
                imagem1.setVisibility(View.VISIBLE);
                imagem2.setVisibility(View.VISIBLE);
                proximoEsfinge5_2.setVisibility(View.INVISIBLE);
                proximoEsfinge5_3.setVisibility(View.VISIBLE);

            };
        });

        proximoEsfinge5_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final EditText edittext = new EditText(getApplicationContext());

                final String resposta = "15";

                alertDialogBuilder.setTitle("Qual o número do quadrado mágico?");

                alertDialogBuilder.setView(edittext);

                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton("Enviar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                if (edittext.getText().toString().equals(resposta)) {
                                    Intent i = new Intent(Esfinge_5.this, Sandalia_15.class);
                                    startActivityForResult(i, 1);
                                } else {
                                    Intent i = new Intent(Esfinge_5.this, Vaso_37.class);
                                    startActivityForResult(i, 1);
                                }
                            }
                        })
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                alertDialogBuilder.setCancelable(true);
                            }
                        });

                            AlertDialog alertDialog = alertDialogBuilder.create();
                            alertDialog.show();

                        }
                        });

        anteriorEsfinge5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_5.this, Passaro_22.class);
                startActivity(intent);
            }

            ;
        });

    }


}
