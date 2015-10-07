package ufam.promobile.museudosmisterios.Esfinge;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.R;
import ufam.promobile.museudosmisterios.Sandalia.Sandalia_18;
import ufam.promobile.museudosmisterios.Vaso.Vaso_6;

public class Esfinge_38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_38);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_esfinge_38);
        final TextView instrucao = (TextView) findViewById(R.id.textView_esfinge_38_instrucao);
        final TextView proximo = (TextView) findViewById(R.id.textView_esfinge_38_proximo);

        texto.setText(R.string.esfinge_38_1);
        instrucao.setText(R.string.esfinge_38_2);

        //Botão para mudar a Activity
        proximo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_38.this, Sandalia_18.class);
                startActivity(intent);
            };
        });
    }

}
