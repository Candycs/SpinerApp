package com.example.candy.spinerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String yourName = intent.getStringExtra("yourName");
        TextView textyourName = (TextView) findViewById(R.id.textView2);
        textyourName.setText(yourName);

        String yourSername = intent.getStringExtra("yourSername");
        TextView textyourSername = (TextView) findViewById(R.id.textView3);
        textyourSername.setText(yourSername);

        String idStu = intent.getStringExtra("idStu");
        TextView textidStu = (TextView) findViewById(R.id.textView4);
        textidStu.setText(idStu);

        String grade = intent.getStringExtra("grade");
        TextView textgrade = (TextView) findViewById(R.id.textView5);
        textgrade.setText(grade);
    }
}
