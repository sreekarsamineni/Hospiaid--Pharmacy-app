package com.example.sev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sev2.activities.LoginActivity;
import com.example.sev2.activities.OnBoardingActivity;

public class FrontPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        getSupportActionBar().hide();

    }

    public void registerpage(View view) {
        startActivity(new Intent(FrontPage.this, OnBoardingActivity.class));
    }
}