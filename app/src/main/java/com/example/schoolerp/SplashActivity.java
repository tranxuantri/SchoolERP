package com.example.schoolerp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private final int DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread mSplashThread = new Thread() {

            @Override
            public void run() {
                synchronized (this) {
                    try {
                        wait(DURATION);
                    } catch (InterruptedException ignored) {
                    } finally {
                        finish();
                        Intent intent = new Intent(getBaseContext(),
                                LoginActivity.class);
                        startActivity(intent);
                    }
                }
            }

        };
        mSplashThread.start();
    }
}