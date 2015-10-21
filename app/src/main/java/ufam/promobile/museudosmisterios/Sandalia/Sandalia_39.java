package ufam.promobile.museudosmisterios.Sandalia;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Moeda.Moeda_19;
import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Vaso.Vaso_43;
import ufam.promobile.museudosmisterios.Vaso.Vaso_6;

public class Sandalia_39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_39);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_sandalia_39_1);
        final TextView opcao1 = (TextView) findViewById(R.id.textView_sandalia_39_2);
        final TextView opcao2 = (TextView) findViewById(R.id.textView_sandalia_39_3);

        texto.setText(R.string.sandalia_39_1);
        opcao1.setText(R.string.sandalia_39_2);
        opcao2.setText(R.string.sandalia_39_3);

        //Selecionou 10 dentes
        opcao1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sandalia_39.this, Moeda_19.class);
                startActivity(intent);
            };
        });

        //Selecionou 12 dentes
        opcao2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sandalia_39.this, Vaso_43.class);
                startActivity(intent);
            };
        });

    }
}
