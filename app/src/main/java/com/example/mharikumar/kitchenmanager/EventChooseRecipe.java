package com.example.mharikumar.kitchenmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class EventChooseRecipe extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_choose_recipe);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_choose_recipe, menu);
		return true;
	}

}
