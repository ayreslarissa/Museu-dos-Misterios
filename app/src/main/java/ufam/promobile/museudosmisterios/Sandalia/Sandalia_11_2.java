package ufam.promobile.museudosmisterios.Sandalia;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Passaro.Passaro_22;
import ufam.promobile.museudosmisterios.Passaro.Passaro_27;
import ufam.promobile.museudosmisterios.R;

public class Sandalia_11_2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_11_2);

        // Orientaçao Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }
        final Button instrucaoDuplicaSandalia11 = (Button) findViewById(R.id.btn_instrucao_duplica);
        final Button instrucaoDivideSandalia11 = (Button) findViewById(R.id.btn_instrucao_divide);
        final Button anteriorSandalia11 = (Button) findViewById(R.id.button_sandalia_11_anterior);

        //Porta B, ladro direito no livro
        instrucaoDuplicaSandalia11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sandalia_11_2.this, Passaro_22.class);
                startActivity(intent);
            }
        });

        //Porta A, ladro esquerdo no livro
        instrucaoDivideSandalia11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sandalia_11_2.this, Passaro_27.class);
                startActivity(intent);
            }
        });

        anteriorSandalia11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sandalia_11_2.this, Sandalia_11.class);
                startActivity(intent);
            }
        });

    }
    }

