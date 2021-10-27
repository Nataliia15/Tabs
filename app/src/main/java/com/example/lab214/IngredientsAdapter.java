package com.example.lab214;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class IngredientsAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Ingridient>listOfIngredients;
    LayoutInflater inflater;

    public IngredientsAdapter(Context context, ArrayList<Ingridient> listOfIngredients) {
        this.context = context;
        this.listOfIngredients = listOfIngredients;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listOfIngredients.size();
    }

    @Override
    public Object getItem(int position) {
        return listOfIngredients.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if(convertView==null){
            convertView= inflater.inflate(R.layout.list_item,parent,false);
            TextView ingredientTV=(TextView)convertView.findViewById(R.id.ingredientTV);
            TextView amountTV=(TextView)convertView.findViewById(R.id.amountTV);
            ingredientTV.setText(listOfIngredients.get(position).getNameOfIngredient());
            amountTV.setText( listOfIngredients.get(position).getAmount());

        }
        return convertView;
    }
}
