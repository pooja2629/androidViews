package com.example.simplevalueresources;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String info = getResources().getString(R.string.txtInfo);

        int col = getResources().getColor(R.color.pureColor);
        col = ContextCompat.getColor(this, R.color.pureColor);
        String []mobs = getResources().getStringArray(R.array.mob);
    }

}
BB