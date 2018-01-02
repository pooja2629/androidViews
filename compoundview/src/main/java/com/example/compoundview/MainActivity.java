package com.example.compoundview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        LinearLayout frmCont = findViewById(R.id.frameLayout);



        View view = inflater.inflate(R.layout.compound_view,frmCont,true);

        view.findViewById(R.id.txtVw).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView txt = (TextView) view;

                txt.setText(new Date (System.currentTimeMillis()).toString());

            }

        });
    }
}
