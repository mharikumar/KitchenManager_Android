package com.example.mharikumar.kitchenmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EventRecipeList extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_recipe_list);
		
/*----------------ListView--------------*/
		
		ListView mylistview;
	    ArrayAdapter<String> listAdapter;
	    mylistview = (ListView) findViewById(com.example.mharikumar.kitchenmanager.R.id.listView1);

        final String[] items = { "Thai Chicken Fried Rice", "Shrimp Fry", "Chicken Curry", "Fish Curry","White Rice","Spinach Tofu Curry"};
        
        listAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        mylistview.setAdapter(listAdapter);

        // For ListItem Click
        mylistview.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                    int position, long arg3) 
            {
                String s = items[position].toString();
                
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_recipe_list, menu);
		return true;
	}

}
