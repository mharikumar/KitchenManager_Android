package com.example.mharikumar.kitchenmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);

		//Recipe button
		Button recipe_button = (Button) findViewById(R.id.button1);
        recipe_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Perform action on click
            	Intent myIntent = new Intent(HomeScreen.this, TabHostActivity.class);
                myIntent.putExtra("TabNumber", 0);
                HomeScreen.this.startActivity(myIntent);
            	//Toast.makeText(getApplicationContext(), "Recipe", Toast.LENGTH_SHORT).show();
            }
        });
      //ShoppingList button
      		Button shopping_button = (Button) findViewById(R.id.button2);
              shopping_button.setOnClickListener(new View.OnClickListener()
              {
                  public void onClick(View v)
                  {
                      // Perform action on click
                	  Intent myIntent = new Intent(HomeScreen.this, TabHostActivity.class);
                      myIntent.putExtra("TabNumber", 3);

                      HomeScreen.this.startActivity(myIntent);
                  	//Toast.makeText(getApplicationContext(), "ShoppingList", Toast.LENGTH_SHORT).show();
                  }
              });
        //Inventory button
        Button inventory_button = (Button) findViewById(R.id.button3);
        inventory_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                // Perform action on click
            	Intent myIntent = new Intent(HomeScreen.this, TabHostActivity.class);
                myIntent.putExtra("TabNumber", 1);

                HomeScreen.this.startActivity(myIntent);
            	//Toast.makeText(getApplicationContext(), "Inventory", Toast.LENGTH_SHORT).show();
            }
        });
        
        //Event Button
        Button event_button = (Button) findViewById(R.id.button4);
        event_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
            	Intent myIntent = new Intent(HomeScreen.this, TabHostActivity.class);
                myIntent.putExtra("TabNumber", 2);

                HomeScreen.this.startActivity(myIntent);
                
            	//Toast.makeText(getApplicationContext(), "Event", Toast.LENGTH_SHORT).show();
            }
        });
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_screen, menu);
		return true;
	}

	
}
