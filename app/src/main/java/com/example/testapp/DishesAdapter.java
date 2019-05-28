package com.example.testapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testapp.model.Dish;

public class DishesAdapter extends ArrayAdapter<Dish> {

    public DishesAdapter(Context context, int ressource) {
        super(context, ressource);
    }

    public View getView(int position, View convertView, ViewGroup viewParent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View v = inflater.inflate(R.layout.dish_item, null);

        Dish data = getItem(position);

        ImageView img = v.findViewById(R.id.dish_picture);
        int imgId = getContext().getResources().getIdentifier(data.getImageUrl(), "drawable", getContext().getPackageName());
        img.setImageResource(imgId);
        TextView tv1 = v.findViewById(R.id.dish_name);
        tv1.setText(data.getLabel());
        TextView tv2 = v.findViewById(R.id.dish_price);
        tv2.setText(String.format("%.2f €", data.getPrice()));
        return v;
    }
}
