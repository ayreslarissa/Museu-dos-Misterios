package ufam.promobile.museudosmisterios.Sandalia;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_9;

public class Sandalia_23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_23);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textViewTexto_sandalia_23_1);
        final Button proximoSandalia_23_1 = (Button) findViewById(R.id.button_sandalia_23_proximo1);
        final Button proximoSandalia_23_2 = (Button) findViewById(R.id.button_sandalia_23_proximo2);
        final Button proximoSandalia_23_3 = (Button) findViewById(R.id.button_sandalia_23_proximo3);
        final Button anteriorSandalia_23_1 = (Button) findViewById(R.id.button_sandalia_23_anterior);
        final Button anteriorSandalia_23_2 = (Button) findViewById(R.id.button_sandalia_23_anterior2);
        final ImageView imagem1 = (ImageView) findViewById(R.id.imageView_sandalia_23_1);
        final ImageView imagem2 = (ImageView) findViewById(R.id.imageView_sandalia_23_2);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        texto.setText(R.string.sandalia_23_1);

        //Botão para passar o texto
        proximoSandalia_23_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.sandalia_23_2);
                proximoSandalia_23_1.setVisibility(View.INVISIBLE);
                proximoSandalia_23_2.setVisibility(View.VISIBLE);

                imagem1.setVisibility(View.INVISIBLE);
                imagem2.setVisibility(View.VISIBLE);
            };
        });

        //Botão para passar o texto
        proximoSandalia_23_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(R.string.sandalia_23_3);
                proximoSandalia_23_2.setVisibility(View.INVISIBLE);
                proximoSandalia_23_3.setVisibility(View.VISIBLE);

                imagem2.setVisibility(View.INVISIBLE);

            };
        });

        proximoSandalia_23_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialogBuilder.setTitle("Qual a quantidade de contas?");
                alertDialogBuilder
                        .setMessage("")
                        .setCancelable(true)
                        .setPositiveButton("222", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Sandalia_23.this, Sandalia_37.class);
                                startActivityForResult(i, 1);
                            }
                        })
                        .setNegativeButton("242", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(Sandalia_23.this, Vaso_9.class);
                                startActivityForResult(i, 1);
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });


    }


}
