package ufam.promobile.museudosmisterios.Passaro;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_5;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_11;

public class Passaro_22 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passaro_22);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button anteriorpassaro22 = (Button) findViewById(R.id.button_passaro_22_anterior);
        final Button proximopassaro22 = (Button) findViewById(R.id.button_passaro_22_proximo);

        //VOLTA PARA A PÁGINA SANDALIA_11
        anteriorpassaro22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Passaro_22.this, Sandalia_11.class);
                startActivity(intent);
            }
        });

        proximopassaro22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Passaro_22.this, Esfinge_5.class);
                startActivity(intent);
            }
        });
    }


}
