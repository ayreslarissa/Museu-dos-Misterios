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

import ufam.promobile.museudosmisterios.Passaro.Passaro_36;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_33;

public class Esfinge_17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_17);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //SINOS
        final ImageView imagemerrada1 = (ImageView) findViewById(R.id.imageView_esfinge_17_1);
        final ImageView imagemerrada2 = (ImageView) findViewById(R.id.imageView_esfinge_17_2);
        final ImageView imagemerrada4 = (ImageView) findViewById(R.id.imageView_esfinge_17_4);
        final ImageView imagemerrada5 = (ImageView) findViewById(R.id.imageView_esfinge_17_5);
        final ImageView imagemerrada6 = (ImageView) findViewById(R.id.imageView_esfinge_17_6);
        final ImageView imagemcerta3 = (ImageView) findViewById(R.id.imageView_esfinge_17_3);

        //TEXTVIEWS
        final TextView texto = (TextView) findViewById(R.id.textView_esfinge_17);
        final TextView textViewsino1 = (TextView) findViewById(R.id.sino_esfinge_17_1);
        final TextView textViewsino2 = (TextView) findViewById(R.id.sino_esfinge_17_2);
        final TextView textViewsino3 = (TextView) findViewById(R.id.sino_esfinge_17_3);
        final TextView textViewsino4 = (TextView) findViewById(R.id.sino_esfinge_17_4);
        final TextView textViewsino5 = (TextView) findViewById(R.id.sino_esfinge_17_5);
        final TextView textViewsino6 = (TextView) findViewById(R.id.sino_esfinge_17_6);

        //BUTTON
        final Button proximo = (Button) findViewById(R.id.button_esfinge_17_proximo1);

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setVisibility(View.INVISIBLE);
                proximo.setVisibility(View.INVISIBLE);
                imagemerrada1.setVisibility(View.VISIBLE);
                imagemerrada2.setVisibility(View.VISIBLE);
                imagemcerta3.setVisibility(View.VISIBLE);
                imagemerrada4.setVisibility(View.VISIBLE);
                imagemerrada5.setVisibility(View.VISIBLE);
                imagemerrada6.setVisibility(View.VISIBLE);
                textViewsino1.setVisibility(View.VISIBLE);
                textViewsino2.setVisibility(View.VISIBLE);
                textViewsino3.setVisibility(View.VISIBLE);
                textViewsino4.setVisibility(View.VISIBLE);
                textViewsino5.setVisibility(View.VISIBLE);
                textViewsino6.setVisibility(View.VISIBLE);
            }
        });

        imagemerrada1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_17.this, Sandalia_33.class);
                startActivity(intent);
            }
        });

        imagemerrada2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_17.this, Sandalia_33.class);
                startActivity(intent);
            }
        });

        imagemerrada4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_17.this, Sandalia_33.class);
                startActivity(intent);
            }
        });

        imagemerrada5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_17.this, Sandalia_33.class);
                startActivity(intent);
            }
        });

        imagemerrada6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_17.this, Sandalia_33.class);
                startActivity(intent);
            }
        });

        imagemcerta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_17.this, Passaro_36.class);
                startActivity(intent);
            }
        });
    }

}
