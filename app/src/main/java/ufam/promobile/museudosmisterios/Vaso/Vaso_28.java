package ufam.promobile.museudosmisterios.Vaso;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_11;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_20;

public class Vaso_28 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaso_28);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }
        final Button anterior28vaso = (Button) findViewById(R.id.button_vaso_28_anterior);
        final Button proximoVaso28 = (Button) findViewById(R.id.button_vaso_28_proximo);

        anterior28vaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vaso_28.this, Sandalia_20.class);
                startActivity(intent);
            }
        });

        proximoVaso28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vaso_28.this, Sandalia_11.class);
                startActivity(intent);
            }
        });
    }


}
