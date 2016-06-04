package com.project.softkeys.freaked;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.junio.freaked.R;

public class LoginActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbar=(Toolbar) findViewById(R.id.toolbar_login);
        toolbar.setTitle("Freaked");

        setSupportActionBar(toolbar);

    }

}
