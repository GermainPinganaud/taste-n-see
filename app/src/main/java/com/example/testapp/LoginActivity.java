package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void connect(View v) {
        EditText login = findViewById(R.id.login_login);
        EditText password = findViewById(R.id.password_prompt);

        String loginStr = login.getText().toString();
        String passwordStr = password.getText().toString();

        if (loginStr.equals("admin") && passwordStr.equals("admin")) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else {
            String errorMsg = getResources().getString(R.string.login_error);
            Toast.makeText(this, errorMsg, Toast.LENGTH_LONG).show();
        }
    }

}
