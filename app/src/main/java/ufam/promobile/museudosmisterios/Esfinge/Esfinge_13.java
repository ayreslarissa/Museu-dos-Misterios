package ufam.promobile.museudosmisterios.Esfinge;

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

public class Esfinge_13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_13);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_esfinge_13);
        final Button proximo1 = (Button) findViewById(R.id.button_esfinge_13_proximo1);
        final Button proximo2 = (Button) findViewById(R.id.button_esfinge_13_proximo2);
        final ImageView imagem = (ImageView) findViewById(R.id.imageView_esfinge_13);

        texto.setText(R.string.esfinge_13_1);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.esfinge_13_2);
                proximo1.setVisibility(View.INVISIBLE);
                imagem.setVisibility(View.VISIBLE);
                proximo2.setVisibility(View.VISIBLE);
            }
        });
        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_13.this, Esfinge_17.class);
                startActivity(intent);
            }
        });


    }

}
