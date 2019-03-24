package com.ita.aubit.alarmclock;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FlashPage extends AppCompatActivity {



    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_page);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

                    i = new Intent(FlashPage.this, MainActivity.class);
                    startActivity(i);


                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
