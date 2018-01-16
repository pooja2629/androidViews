package com.example.uithread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCounter(View view) {
        threadedCounter();
    }
    private void counter(){
            for (int i= 0; i<100; i++)
            {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ((TextView)findViewById(R.id.textCntr)).setText(String.valueOf(i));
            }
        }
        private void threadedCounter(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                counter();
            }
        }).start();
        }
    }