package ufam.promobile.museudosmisterios.Vaso;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_13;
import ufam.promobile.museudosmisterios.R;

public class Vaso_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaso_9);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_vaso_9_1);
        final TextView data1 = (TextView) findViewById(R.id.textView_vaso_9_data1);
        final TextView data2 = (TextView) findViewById(R.id.textView_vaso_9_data2);
        final TextView data3 = (TextView) findViewById(R.id.textView_vaso_9_data3);
        final ImageView imagem1 = (ImageView) findViewById(R.id.imageView_vaso_9_1);
        final ImageView imagem2 = (ImageView) findViewById(R.id.imageView_vaso_9_2);
        final ImageView imagem3 = (ImageView) findViewById(R.id.imageView_vaso_9_3);
        final Button proximo1 = (Button) findViewById(R.id.button_vaso_9_proximo1);

        texto.setText(R.string.vaso_9_1);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.vaso_9_2);
                proximo1.setVisibility(View.INVISIBLE);
                data1.setVisibility(View.VISIBLE);
                data2.setVisibility(View.VISIBLE);
                data3.setVisibility(View.VISIBLE);
                imagem1.setVisibility(View.VISIBLE);
                imagem2.setVisibility(View.VISIBLE);
                imagem3.setVisibility(View.VISIBLE);

            }
        });

        imagem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vaso_9.this, Vaso_23.class);
                startActivity(intent);
            }
        });

        imagem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vaso_9.this, Esfinge_13.class);
                startActivity(intent);
            }
        });

        imagem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vaso_9.this, Vaso_23.class);
                startActivity(intent);
            }
        });
    }

}
