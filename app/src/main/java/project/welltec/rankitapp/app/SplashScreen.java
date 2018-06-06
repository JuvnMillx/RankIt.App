package project.welltec.rankitapp.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import project.welltec.rankitapp.R;
import project.welltec.rankitapp.R.*;
import project.welltec.rankitapp.utils.Constants;

public class SplashScreen extends AppCompatActivity {

    private int myProgress;
    private ProgressBar progressBar;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // ProgressBar of Launcher
        progressBar = (ProgressBar)findViewById(id.progress_bar_splashscreen);
        myProgress = 0;

        // Transition to HomeActivity
        countDownTimer = new CountDownTimer(Constants.DEFAULTTMETRANSITION, Constants.INTERVALTIMER ) {
            @Override
            public void onTick(long millisUntilToFinish) {
                // (int)((Constants.DEFAULTTMETRANSITION-millisUntilToFinish)/Constants.DEFAULTTMETRANSITION*100.00)
                progressBar.setProgress(myProgress);
                myProgress = myProgress + 1;
            }

            @Override
            public void onFinish() {
                progressBar.setProgress(myProgress);
                Intent intent = new Intent(SplashScreen.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}
