package com.example.emzatos.uttu;

/**
 * Created by emzatos on 9/26/15.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SplashActivity extends Activity{

    // Splash screen timer
    ImageButton ib;
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState){



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        addListenerOnButton();



         /*
          * Showing splash screen with a timer. This will be useful when you
          * want to show case your app logo / company
          */



    }



    public void addListenerOnButton() {
        ib = (ImageButton)findViewById(R.id.ib);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                i.setClass(SplashActivity.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

    }
}





