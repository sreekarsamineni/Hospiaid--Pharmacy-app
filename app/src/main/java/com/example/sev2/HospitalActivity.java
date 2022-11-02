package com.example.sev2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class HospitalActivity extends AppCompatActivity {

    private Spinner spinner;
    private static final String[] paths = {"Diagnostic Tests", "Doctor Consultation", "Medical Equipment", "Nursing Care", "Physiotherapy", "Lab Tests", "Sample collection and Vaccination Administration"};

    EditText pno,address,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);


        getSupportActionBar().hide();

        pno = findViewById(R.id.email2);
        address = findViewById(R.id.email3);
        desc = findViewById(R.id.email4);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HospitalActivity.this, android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    public void sub(View view) {

        String phoNum = pno.getText().toString();
        String Address = pno.getText().toString();
        String Description = pno.getText().toString();

        if (TextUtils.isEmpty(phoNum)) {

            Toast.makeText(this, "Enter Phone number!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(Address)) {

            Toast.makeText(this, "Enter Address!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(Description)) {

            Toast.makeText(this, "Enter Description!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (phoNum.length() > 10) {

            Toast.makeText(this, "Enter a valid Phone number!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (phoNum.length() < 10) {

            Toast.makeText(this, "Enter a valid Phone number!", Toast.LENGTH_SHORT).show();
            return;
        }



        Toast.makeText(HospitalActivity.this, "Successfully Submitted", Toast.LENGTH_SHORT).show();

    }
}