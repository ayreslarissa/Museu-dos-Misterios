package ufam.promobile.museudosmisterios;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Main extends AppCompatActivity {
//isso eh um teste
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Orientação Paisagem (Landscape)
        //Inserindo um Comentario
        //kkkkk
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView jogar = (TextView) findViewById(R.id.button_jogar);
        final TextView regras = (TextView) findViewById(R.id.button_instrucoes);

        //Botão para Jogar
        jogar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main.this, Play.class);
                startActivityForResult(i, 1);
            };
        });

        //Botão para ver as Instrucoes
        regras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main.this, Instrucoes.class);
                startActivityForResult(i, 1);
            };
        });




    }
}
