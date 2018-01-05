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
        cstAdp();

    }
    private void arrAdp() {

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
    private void cstAdp() {
        List<ImgItem> dtSt = new ArrayList<>();
        dtSt.add(
                new ImgItem(
                        R.mipmap.ic_launcher,
                        "Windows"
                )
        );
        dtSt.add(
                new ImgItem(
                        R.mipmap.ic_launcher,
                        "Mac"
                )
        );
        dtSt.add(
                new ImgItem(
                        R.mipmap.ic_launcher,
                        "IBM"
                )
        );
        dtSt.add(
                new ImgItem(
                        R.drawable.ic_launcher_foreground,
                        "Quantum"
                )
        );
        dtSt.add(
                new ImgItem(
                        R.drawable.ic_launcher_foreground,
                        "Dell"
                )
        );
        ImgAdapter adapter = new ImgAdapter(this, (ArrayList<ImgItem>) dtSt
        );


        ListView lstView = findViewById(R.id.lstVw);
        lstView.setAdapter(adapter);
    }

}
