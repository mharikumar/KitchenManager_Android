package com.example.mharikumar.kitchenmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class EventMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_main);

		/*----------------ListView--------------*/
		
		ListView mylistview;
	    ArrayAdapter<String> listAdapter;
	    mylistview = (ListView) findViewById(com.example.mharikumar.kitchenmanager.R.id.listView1);

        final String[] items = { "White", "Black", "Red", "Green", "Yellow",
                "Blue", "Pink" ,"Orange","Purple","Violet","Black"};
        
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
		
        /*---------------------Add Event Button ----------------------*/
        
        Button event_button = (Button) findViewById(R.id.button1);
        event_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
            	Intent myIntent = new Intent(EventMain.this, EventChooseRecipe.class);
            	EventMain.this.startActivity(myIntent);
                
            }
        });
       /*---------------------Recipe List Button ----------------------*/
        
        Button event_recipe_button = (Button) findViewById(R.id.button2);
        event_recipe_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
            	Intent myIntent = new Intent(EventMain.this, EventRecipeList.class);
            	EventMain.this.startActivity(myIntent);
                
            }
        });
        
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_main, menu);
		return true;
	}

}
