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
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Vaso.Vaso_14;
import ufam.promobile.museudosmisterios.Passaro.Passaro_5;
import ufam.promobile.museudosmisterios.R;

public class Sandalia_26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_26);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto1 = (TextView) findViewById(R.id.textView_sandalia_26_1);
        final TextView texto2 = (TextView) findViewById(R.id.textView_sandalia_26_2);
        final ImageView imagem = (ImageView) findViewById(R.id.imageView_sandalia_26);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        texto1.setText(R.string.sandalia_26_1);
        texto2.setText(R.string.sandalia_26_2);

        imagem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final EditText edittext = new EditText(getApplicationContext());
                final String resposta = "7651";

                alertDialogBuilder.setTitle(R.string.sandalia_26_3);
                alertDialogBuilder.setView(edittext);
                alertDialogBuilder
                        .setMessage("5   6   1   7")
                        .setCancelable(true)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                if (edittext.getText().toString().equals(resposta)) {
                                    Intent i = new Intent(Sandalia_26.this, Vaso_14.class);
                                    startActivityForResult(i, 1);
                                } else {
                                    Intent i = new Intent(Sandalia_26.this, Passaro_5.class);
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
