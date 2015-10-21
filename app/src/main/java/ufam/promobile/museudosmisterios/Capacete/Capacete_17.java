package ufam.promobile.museudosmisterios.Capacete;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_34;
import ufam.promobile.museudosmisterios.Play;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_39;

public class Capacete_17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capacete_17);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final ImageView porta1 = (ImageView) findViewById(R.id.imageView);
        final ImageView porta2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView porta3 = (ImageView) findViewById(R.id.imageView3);
        final ImageView porta4 = (ImageView) findViewById(R.id.imageView4);

        //Porta 1
        porta1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Capacete_17.this, Capacete_26.class);
                startActivityForResult(i, 1);
            };
        });
        //Porta 2
        porta2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Capacete_17.this, Sandalia_39.class);
                startActivityForResult(i, 1);
            };
        });
        //Porta 3
        porta3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Capacete_17.this, Capacete_28.class);
                startActivityForResult(i, 1);
            };
        });
        //Porta 4
        porta4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Capacete_17.this, Capacete_20.class);
                startActivityForResult(i, 1);
            };
        });
    }
}
