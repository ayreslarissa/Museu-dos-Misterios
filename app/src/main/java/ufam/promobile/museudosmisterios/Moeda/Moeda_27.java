package ufam.promobile.museudosmisterios.Moeda;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_10;
import ufam.promobile.museudosmisterios.Esfinge.Esfinge_42;
import ufam.promobile.museudosmisterios.R;

public class Moeda_27 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda_27);

        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximoMoeda27 = (Button) findViewById(R.id.button_moeda_27_proximo);
        final Button anteriorMoeda27 = (Button) findViewById(R.id.button_moeda_27_anterior);

        proximoMoeda27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Moeda_27.this, Esfinge_42.class);
                startActivity(intent);
            }
        });

        anteriorMoeda27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Moeda_27.this, Esfinge_10.class);
                startActivity(intent);
            }
        });



    }


}
