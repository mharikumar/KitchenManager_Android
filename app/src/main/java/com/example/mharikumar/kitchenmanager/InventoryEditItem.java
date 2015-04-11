package com.example.mharikumar.kitchenmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class InventoryEditItem extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inventory_edit_item);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inventory_edit_item, menu);
		return true;
	}

}
