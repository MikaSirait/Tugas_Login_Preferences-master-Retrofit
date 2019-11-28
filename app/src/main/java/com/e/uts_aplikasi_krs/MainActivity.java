package com.e.uts_aplikasi_krs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnLogout).setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view) {
                Preferences.clearLoggedInUser(getBaseContext());
                startActivity(new
                        Intent(getBaseContext(),Login.class));
                finish();
            }

    });

}}