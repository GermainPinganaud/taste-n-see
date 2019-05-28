package com.example.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testapp.model.Dish;

public class DishesDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes_details);

        Dish dish = (Dish) getIntent().getSerializableExtra("dish");

        ImageView img = findViewById(R.id.dish_details_picture);
        TextView name = findViewById(R.id.dish_details_name);
        TextView description = findViewById(R.id.dish_details_description);

        img.setImageResource(
                getResources().getIdentifier(dish.getImageUrl(), "drawable", getPackageName())
        );
        name.setText(dish.getLabel());
        description.setText(dish.getDescription());
    }
}
