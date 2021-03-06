package ufam.promobile.museudosmisterios.Vaso;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Esfinge.Esfinge_32;
import ufam.promobile.museudosmisterios.R;

public class Vaso_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaso_6);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final TextView texto = (TextView) findViewById(R.id.textView_vaso_6);
        final TextView voltar = (TextView) findViewById(R.id.textView_vaso_6_voltar);
        //final TextView proximo1 = (TextView) findViewById(R.id.textView_vaso_6);

        texto.setText(R.string.vaso_6_1);

        //Botão para mudar a Activity
        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Vaso_6.this, Esfinge_32.class);
                startActivity(intent);
            };
        });
    }


}
