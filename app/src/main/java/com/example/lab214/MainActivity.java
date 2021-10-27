package com.example.lab214;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;
    ListView listView;
    ArrayList<Ingridient>listOFIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost=findViewById(R.id.host);
        listView=findViewById(R.id.ingridientsLV);
        tabHost.setup();
        TabHost.TabSpec spec=tabHost.newTabSpec("About");
        spec.setContent(R.id.tab1);
        spec.setIndicator("About");
        tabHost.addTab(spec);
        spec=tabHost.newTabSpec("Ingredients");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Ingredients");
        tabHost.addTab(spec);
       listOFIngredients =new ArrayList<Ingridient>();
        populateArr();
       // createArrayOfIngr();
        IngredientsAdapter adapter=new IngredientsAdapter(this,listOFIngredients);
        listView.setAdapter(adapter);
    }
    public void populateArr(){

        listOFIngredients.add(new Ingridient("macaroni","8 ounce"));
        listOFIngredients.add(new Ingridient("butter","1/4 cup"));
        listOFIngredients.add((new Ingridient("all-purpose flour","1/4 cup")));
        listOFIngredients.add(new Ingridient("salt","1/2 teaspoon"));
        listOFIngredients.add(new Ingridient("milk","2 cups"));
        listOFIngredients.add(new Ingridient("shredded Cheddar cheese","2 cups"));
        listOFIngredients.add(new Ingridient("ground black pepper","to taste"));

    }
}