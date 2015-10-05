package ufam.promobile.museudosmisterios.Vaso;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_35;

public class Vaso_15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaso_15);

        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximoVaso15 = (Button) findViewById(R.id.button_vaso_15_proximo1);
        final Button voltarVaso15 = (Button) findViewById(R.id.button_vaso_15_voltar);
        final TextView texto = (TextView) findViewById(R.id.textView_vaso_15_1);

        voltarVaso15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vaso_15.this, Sandalia_35.class);
                startActivity(intent);
            }
        });


        proximoVaso15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.vaso_15_2);
                proximoVaso15.setVisibility(View.INVISIBLE);
            }
        });

    }


}
