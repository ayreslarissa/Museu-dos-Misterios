package ufam.promobile.museudosmisterios.Sandalia;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import ufam.promobile.museudosmisterios.Passaro.Passaro_38;
import ufam.promobile.museudosmisterios.R;

public class Sandalia_9 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandalia_9);

        // Orientação Paisagem (Landscape)
        try {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Button proximo = (Button) findViewById(R.id.button_sandalia_9_proximo1);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        proximo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent i = new Intent(Sandalia_9.this, Passaro_38.class);
               startActivityForResult(i, 1);

           }
       }
        );

    }

}
