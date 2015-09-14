package ufam.promobile.museudosmisterios.Sandalia;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_42;
import ufam.promobile.museudosmisterios.Moeda.Moeda_6;
import ufam.promobile.museudosmisterios.R;

public class Sandalia_28 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_28);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximoSandalia28 = (Button) findViewById(R.id.button_sandalia_28_proximo);
        final Button anteriorSandalia28 = (Button) findViewById(R.id.button_sandalia_28_anterior);

        //Passa para a página 6_Moeda
        proximoSandalia28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Sandalia_28.this, Moeda_6.class);
                startActivity(intent);
            }
        });

        //Volta para a página 42_Esfinge
        anteriorSandalia28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Sandalia_28.this, Esfinge_42.class);
                startActivity(intent);
            }
        });
    }


}
