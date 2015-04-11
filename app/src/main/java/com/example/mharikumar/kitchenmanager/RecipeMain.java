package com.example.mharikumar.kitchenmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RecipeMain extends Activity
{


    // List view
    private ListView lv;

    // Listview Adapter
     ArrayAdapter<String> adapter;
   // Search EditText
    EditText inputSearch;
    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;

    //List for Recipes
     DBHelper db;
    List<Recipe> allRecipes;
    List<String> stringRecipeList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recipe_main);

        // Listview Data
        String products[] = {"Chicken Curry", "Pineapple Fried Rice", "Prawn Fry", "Spinach Tofu"};

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        db= new DBHelper(this);
        allRecipes=db.getAllRecipe();
        stringRecipeList=new ArrayList<String>();
        for (Recipe recipe : allRecipes)
        {
            stringRecipeList.add(recipe.getName());
        }
        adapter = new ArrayAdapter<String>(this, R.layout.recipe_list_item, R.id.recipe_name,stringRecipeList );

        lv.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        //Search functionality
        inputSearch.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                RecipeMain.this.adapter.getFilter().filter(cs);
            }
            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });




        //Add Recipe button
		Button recipe_button = (Button) findViewById(R.id.button1);
        recipe_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Perform action on click
            	Intent myIntent = new Intent(RecipeMain.this, RecipeAddRcipeForm.class);
            	RecipeMain.this.startActivity(myIntent);
            	//Toast.makeText(getApplicationContext(), "Recipe", Toast.LENGTH_SHORT).show();
            }
        });


        //Edit/View Recipe
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                Intent myIntent2 = new Intent(RecipeMain.this, RecipeViewRecipe.class);
                RecipeMain.this.startActivity(myIntent2);
                //Toast.makeText(getApplicationContext(),"You clicked on Item"+position, Toast.LENGTH_LONG).show();
            }
        });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.recipe_main, menu);
		return true;
	}

}
