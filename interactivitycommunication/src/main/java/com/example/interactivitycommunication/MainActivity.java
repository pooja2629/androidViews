package com.example.interactivitycommunication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gotoSports (View view) {
        MainActivity main = this;
        Context con = main;
        Class<SportsActivity> cls = SportsActivity.class;
        Intent intent = new Intent(
                con,
                cls
        );
        EditText edNm = findViewById(R.id.edtNm);
        Bundle bundle = new Bundle();
        bundle.putString("yoNm", edNm.getText().toString());
        intent.putExtras(bundle);

    startActivityForResult(intent,1234);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1234) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    Bundle bndl = data.getExtras();
                    if (bndl != null) {
                        String opNm = bndl.getString("opNm");
                        ((EditText) findViewById(R.id.edtNm)).setText(opNm);
                    }
                }
            }
        }
    }
}