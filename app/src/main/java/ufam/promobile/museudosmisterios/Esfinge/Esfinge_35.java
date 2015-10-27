package ufam.promobile.museudosmisterios.Esfinge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ufam.promobile.museudosmisterios.Moeda.Moeda_29;
import ufam.promobile.museudosmisterios.R;

public class Esfinge_35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfinge_35);

        //TEXTVIEWS
        final TextView texto = (TextView) findViewById(R.id.txt_esfinge_35);

        //BUTTON
        final Button proximo1 = (Button) findViewById(R.id.button_esfinge_35_proximo1);
        final Button proximo2 = (Button) findViewById(R.id.button_esfinge_35_proximo2);
        final Button proximo3 = (Button) findViewById(R.id.button_esfinge_35_proximo3);
        final ImageView image = (ImageView) findViewById(R.id.img_esfinge_35);

        proximo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.esfinge_35_2);
                proximo1.setVisibility(View.INVISIBLE);
                proximo2.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);

            }
        });

        proximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(R.string.esfinge_35_3);
                proximo2.setVisibility(View.INVISIBLE);
                proximo3.setVisibility(View.VISIBLE);
                image.setVisibility(View.INVISIBLE);
            }
        });

        proximo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Esfinge_35.this, Moeda_29.class);
                startActivity(intent);
            }
        });
    }

}
