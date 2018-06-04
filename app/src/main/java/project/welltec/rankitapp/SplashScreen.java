package project.welltec.rankitapp;

import android.content.pm.ActivityInfo;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import project.welltec.rankitapp.utils.Constants;

public class SplashScreen extends AppCompatActivity {

    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        // Transition to HomeActivity
        countDownTimer = new CountDownTimer(Constants.DEFAULTTMETRANSITION, Constants.INTERVALTIMER ) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
