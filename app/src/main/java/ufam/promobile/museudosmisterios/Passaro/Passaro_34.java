package ufam.promobile.museudosmisterios.Passaro;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Moeda.Moeda_16;
import ufam.promobile.museudosmisterios.Moeda.Moeda_6;
import ufam.promobile.museudosmisterios.R;

public class Passaro_34 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passaro_34);

        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximopassaro34 = (Button) findViewById(R.id.button_passaro_34_proximo);
        final Button anteriorpassaro34 = (Button) findViewById(R.id.button_passaro_34_anterior);

        //PASSA PARA A PÁGINA MOEDA_16
        proximopassaro34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Passaro_34.this, Moeda_16.class);
                startActivity(intent);
            }
        });

        //VOLTA PARA A PÁGINA MOEDA_6
        anteriorpassaro34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Passaro_34.this, Moeda_6.class);
                startActivity(intent);
            }
        });
    }


}
