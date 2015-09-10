package ufam.promobile.museudosmisterios.Tela_Splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import ufam.promobile.museudosmisterios.Main;
import ufam.promobile.museudosmisterios.R;


public class SplashScreen extends Activity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */


            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent intent = new Intent();
                intent.setClass(SplashScreen.this, Main.class);
                startActivity(intent);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
