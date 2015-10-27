package ufam.promobile.museudosmisterios.Moeda;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;

public class Moeda_24 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda_24);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //TEXTVIEWS
        final TextView texto = (TextView) findViewById(R.id.txt_moeda_24);

        //BUTTON
        final Button proximo1 = (Button) findViewById(R.id.button_moeda_24_proximo1);


        final ImageView image1 = (ImageView) findViewById(R.id.img_moeda_24_1);
        final ImageView image2 = (ImageView) findViewById(R.id.img_moeda_24_bichanes);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.moeda_24_2);
                proximo1.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.VISIBLE);
            }
        });
    }

}
