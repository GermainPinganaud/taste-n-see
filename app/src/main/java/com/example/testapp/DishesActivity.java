package com.example.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.testapp.model.Dish;

public class DishesActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes);

        ListView dishesList = findViewById(R.id.dishes_list);

        DishesAdapter dishesAdapter = new DishesAdapter(this, 0);
        Dish dish1 = new Dish("plat1", "Hareng marinés", 12.0, "Cognitis enim pilatorum caesorumque funeribus nemo deinde ad has stationes appulit navem, sed ut Scironis praerupta letalia declinantes litoribus Cypriis contigui navigabant, quae Isauriae scopulis sunt controversa.");
        Dish dish2 = new Dish("plat2", "Salade Niçoise", 6.5, "Cognitis enim pilatorum caesorumque funeribus nemo deinde ad has stationes appulit navem, sed ut Scironis praerupta letalia declinantes litoribus Cypriis contigui navigabant, quae Isauriae scopulis sunt controversa.");
        Dish dish3 = new Dish("plat3", "Café gourmand", 4.5, "Cognitis enim pilatorum caesorumque funeribus nemo deinde ad has stationes appulit navem, sed ut Scironis praerupta letalia declinantes litoribus Cypriis contigui navigabant, quae Isauriae scopulis sunt controversa.");
        Dish dish4 = new Dish("plat4", "Aiguilles de poulet", 9.5, "Cognitis enim pilatorum caesorumque funeribus nemo deinde ad has stationes appulit navem, sed ut Scironis praerupta letalia declinantes litoribus Cypriis contigui navigabant, quae Isauriae scopulis sunt controversa.");
        Dish dish5 = new Dish("plat5", "Crevettes cocktails", 12.0, "Cognitis enim pilatorum caesorumque funeribus nemo deinde ad has stationes appulit navem, sed ut Scironis praerupta letalia declinantes litoribus Cypriis contigui navigabant, quae Isauriae scopulis sunt controversa.");
        Dish dish6 = new Dish("plat6", "Filets de rouget", 11.5, "Cognitis enim pilatorum caesorumque funeribus nemo deinde ad has stationes appulit navem, sed ut Scironis praerupta letalia declinantes litoribus Cypriis contigui navigabant, quae Isauriae scopulis sunt controversa.");

        dishesAdapter.add(dish1);
        dishesAdapter.add(dish2);
        dishesAdapter.add(dish3);
        dishesAdapter.add(dish4);
        dishesAdapter.add(dish5);
        dishesAdapter.add(dish6);

        dishesList.setAdapter(dishesAdapter);
        dishesList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListView dishesList = (ListView) parent;
        Dish selected = (Dish) dishesList.getAdapter().getItem(position);

        Intent intent = new Intent(this, DishesDetailsActivity.class);
        intent.putExtra("dish", selected);
        startActivity(intent);
    }
}
