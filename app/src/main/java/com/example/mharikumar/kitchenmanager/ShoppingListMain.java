package com.example.mharikumar.kitchenmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ShoppingListMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shopping_list_main);
		
		//Add Item button
				Button shopping_add_item = (Button) findViewById(R.id.button1);
				shopping_add_item.setOnClickListener(new View.OnClickListener()
		        {
		            public void onClick(View v)
		            {
		                // Perform action on click
		            	Intent myIntent = new Intent(ShoppingListMain.this, ShoppingListAddItem.class);
		            	ShoppingListMain.this.startActivity(myIntent);
		            	//Toast.makeText(getApplicationContext(), "Recipe", Toast.LENGTH_SHORT).show();
		            }
		        });
				//Edit Item button
				Button shopping_edit_item = (Button) findViewById(R.id.button2);
				shopping_edit_item.setOnClickListener(new View.OnClickListener()
		        {
		            public void onClick(View v)
		            {
		                // Perform action on click
		            	Intent myIntent2 = new Intent(ShoppingListMain.this, ShoppingListEditItem.class);
		            	ShoppingListMain.this.startActivity(myIntent2);
		            	//Toast.makeText(getApplicationContext(), "Recipe", Toast.LENGTH_SHORT).show();
		            }
		        });		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shopping_list_main, menu);
		return true;
	}

}
