package project.welltec.rankitapp.activitys;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

import project.welltec.rankitapp.R;
import project.welltec.rankitapp.utils.FinalValues;

import static android.content.ContentValues.TAG;

public class SplashActivity extends Activity {

    private CountDownTimer countDownTimer;
    private ProgressBar progressBar;
    private Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //progressBar = (ProgressBar) findViewById(R.id.progressBarInit) ;
        //drawable = getResources().getDrawable(R.drawable.customprogressbar,null);
        //progressBar.setProgressDrawable(drawable);

        /**
        countDownTimer = new CountDownTimer((long)FinalValues.progressBarTime,(long)FinalValues.progressBarTime/100){
            @Override
            public void onTick(long millisUntilFinished) {
                progressBar.setProgress((int)((FinalValues.progressBarTime-millisUntilFinished)/FinalValues.progressBarTime*100));
                Log.d(TAG, "onTick() returned: " + (FinalValues.progressBarTime-millisUntilFinished)/FinalValues.progressBarTime*100.0);
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();*/
    }
}
