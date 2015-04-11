package com.example.mharikumar.kitchenmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class InventoryAddItemForm extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inventory_add_item_form);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inventory_add_item_form, menu);
		return true;
	}

}
