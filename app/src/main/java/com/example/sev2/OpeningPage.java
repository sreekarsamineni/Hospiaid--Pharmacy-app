package com.example.sev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sev2.activities.LoginActivity;
import com.example.sev2.activities.MainActivity;
import com.example.sev2.activities.RegistrationActivity;

public class OpeningPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_page);

        getSupportActionBar().hide();

    }

    public void pharmacy(View view) {

        startActivity(new Intent(OpeningPage.this, MainActivity.class));
    }

    //BOT
    public void bot(View view) {
    }

    //Elder Serv
    public void elderly(View view) {

        startActivity(new Intent(OpeningPage.this, ElderlyActivity.class));
    }

    public void hom(View view) {

        startActivity(new Intent(OpeningPage.this, HospitalActivity.class));


    }
}