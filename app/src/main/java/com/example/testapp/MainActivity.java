package com.example.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void choiceDone(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.main_dishes :
                intent = new Intent(this, DishesActivity.class);
                startActivity(intent);
                break;
            case R.id.main_upload :
                intent = new Intent(this, UploadActivity.class);
                startActivity(intent);
                break;
            case R.id.main_rate :
                intent = new Intent(this, RatingActivity.class);
                startActivity(intent);
                break;
            case R.id.main_contact :
                intent = new Intent(this, ContactActivity.class);
                startActivity(intent);
                break;
        }
    }
}
