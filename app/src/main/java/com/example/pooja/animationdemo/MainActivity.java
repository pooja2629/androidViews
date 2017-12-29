package com.example.pooja.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCar (View view){
        Toast.makeText(this,"CAR",Toast.LENGTH_SHORT).show();
        ImageView img = findViewById(R.id.imageView);
        img.setImageResource(R.drawable.ic_directions_car_black_24dp);

    }
    public void onPlane (View view){
        Toast.makeText(this,"PLANE",Toast.LENGTH_SHORT).show();
        ImageView img =findViewById(R.id.imageView);
        img.setImageResource(R.drawable.ic_travel);
    }

    public void onBack(View view){
        Toast.makeText(this,"BACK",Toast.LENGTH_SHORT).show();
        ImageView img=findViewById(R.id.imageView);
        img.setImageResource(R.drawable.ic_launcher_background);

    }

}
