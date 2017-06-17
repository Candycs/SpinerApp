package com.example.candy.spinerapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {

    String yourName;
    String yourSername;
    String idStu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final Spinner spinnergrade = (Spinner) findViewById(R.id.spinnergrade);
        final String[] grade = getResources().getStringArray(R.array.country_arrays);
        ArrayAdapter<String> adaptergrade = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, grade);
        spinnergrade.setAdapter(adaptergrade);
    }
    public void sendData(View view) {
        EditText editTextyourName = (EditText) findViewById(R.id.yourName);
        EditText editTextyourSername = (EditText) findViewById(R.id.yourSername);
        EditText editTextidStu = (EditText) findViewById(R.id.idStu);
        Spinner editTextgrade = (Spinner) findViewById(R.id.spinnergrade);

        String yourName = editTextyourName.getText().toString();
        String yourSername = editTextyourSername.getText().toString();
        String idStu = editTextidStu.getText().toString();
        String grade = editTextgrade.getSelectedItem().toString();


        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("yourName", yourName);
        intent.putExtra("yourSername", yourSername);
        intent.putExtra("idStu", idStu);
        intent.putExtra("grade", grade);
        startActivity(intent);
    }
}