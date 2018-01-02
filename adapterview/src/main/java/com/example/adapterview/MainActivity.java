package com.example.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<String> pcs = new ArrayList<>();
        pcs.add("Windows");
        pcs.add("Mac");
        pcs.add("Dell");
        pcs.add("IBM");
        pcs.add("Super");
        pcs.add("Quantum");

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                pcs
        );
        ListView lstVw = findViewById(R.id.lstVw);

        lstVw.setAdapter(adapter);
    }
}
