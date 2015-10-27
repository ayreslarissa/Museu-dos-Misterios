package ufam.promobile.museudosmisterios.Moeda;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;

public class Moeda_29 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda_29);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //TEXTVIEWS
        final TextView texto = (TextView) findViewById(R.id.txt_moeda_29);

        //BUTTON
        final Button proximo1 = (Button) findViewById(R.id.button_moeda_29_proximo1);
        final Button proximo2 = (Button) findViewById(R.id.button_moeda_29_proximo2);
        final Button proximo3 = (Button) findViewById(R.id.button_moeda_29_proximo3);
        final ImageView image = (ImageView) findViewById(R.id.img_moeda_29);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_29_2);
                proximo1.setVisibility(View.INVISIBLE);
                image.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
            }
        });

        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Moeda_29.this, Moeda_24.class);
                startActivity(intent);
            }
        });
    }

}
