package com.davidargote.appreportsena.control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.davidargote.appreportsena.R;
import com.davidargote.appreportsena.model.ManagerHelper;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ManagerHelper managerHelper = new ManagerHelper(this);
        managerHelper.openDbWr();
        managerHelper.closeDb();

        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        };

        timer.schedule(timerTask, 2000);

    }
}
