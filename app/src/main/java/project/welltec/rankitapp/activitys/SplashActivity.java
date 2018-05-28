package project.welltec.rankitapp.activitys;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import project.welltec.rankitapp.R;
import project.welltec.rankitapp.utils.FinalValues;

public class SplashActivity extends AppCompatActivity {

    private CountDownTimer countDownTimer;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = (ProgressBar) findViewById(R.id.progressBarInit) ;

        countDownTimer = new CountDownTimer((long)FinalValues.progressBarTime,(long)FinalValues.progressBarTime/100){
            @Override
            public void onTick(long millisUntilFinished) {
                progressBar.setProgress((int)((FinalValues.progressBarTime-millisUntilFinished)/FinalValues.progressBarTime*100.0));
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
}
