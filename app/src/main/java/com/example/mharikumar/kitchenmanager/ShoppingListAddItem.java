package com.example.mharikumar.kitchenmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class ShoppingListAddItem extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shopping_list_add_item);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shopping_list_add_item, menu);
		return true;
	}

}
