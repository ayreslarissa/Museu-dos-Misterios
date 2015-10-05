package ufam.promobile.museudosmisterios.Esfinge;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_6;

public class Esfinge_32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_32);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_esfinge_32);
        final ImageView machadoA = (ImageView) findViewById(R.id.imageView_esfinge_32_1);
        final ImageView machadoB = (ImageView) findViewById(R.id.imageView_esfinge_32_2);

        texto.setText(R.string.esfinge_32_1);

        //Selecionou o Machado A
        machadoA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_32.this, Vaso_6.class);
                startActivity(intent);
            };
        });

        //Selecionou o Machado B
        machadoB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_32.this, Esfinge_38.class);
                startActivity(intent);
            };
        });



    }
}

