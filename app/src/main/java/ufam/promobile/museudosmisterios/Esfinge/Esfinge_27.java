package ufam.promobile.museudosmisterios.Esfinge;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Passaro.Passaro_19;
import ufam.promobile.museudosmisterios.R;

public class Esfinge_27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_27);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximo = (Button) findViewById(R.id.button_esfinge_27_proximo1);

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_27.this, Passaro_19.class);
                startActivity(intent);
            }
        });

    }

}
