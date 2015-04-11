package com.example.mharikumar.kitchenmanager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class RecipeAddRcipeForm extends Activity {

    Button   addRecipeButton;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recipe_add_rcipe_form);

        //Add Recipe to DB Button
        addRecipeButton = (Button) findViewById(R.id.addRecipeButton);
        addRecipeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                boolean success;
                success=AddRecipe();
                finish();
            }
        });

        //Cancel Recipe button
        Button cancelrecipe_button = (Button) findViewById(R.id.cancelRecipeButton);
        cancelrecipe_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Perform action on click
                finish();
            }
        });

    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.recipe_add_rcipe_form, menu);
		return true;
	}
    public boolean AddRecipe()
    {
        EditText recipeName;
        DBHelper db;
        String name="", procedure="";
        int serving=0;
        db = new DBHelper(this);
        recipeName=(EditText)findViewById(R.id.recipeName);
        name=recipeName.getText().toString();
        Log.v("RecipeAddRecipeForm", name);

        Recipe recipe1 = new Recipe(name,procedure,serving,1);
        long recipe_id = db.createRecipe(recipe1);
        Log.d("Get Recipe", "Get All Recipe");
        List<Recipe> allRecipe = db.getAllRecipe();
        for (Recipe recipe : allRecipe){
            Log.d("Recipe Content", recipe.toString());
        }


        return true;
    }

}
