package com.example.mharikumar.kitchenmanager;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class TabHostActivity extends TabActivity {

    private static TabHost tabHost;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host);

        Resources res = getResources(); // Resource object to get Drawables
        tabHost = getTabHost(); // The activity TabHost
        TabHost.TabSpec spec; // Reusable TabSpec for each tab
        Intent intent; // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, RecipeMain.class);
        spec = tabHost.newTabSpec("Recipes")
                .setIndicator("", res.getDrawable(R.drawable.ic_tab_recipes))
                .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs

        intent = new Intent().setClass(this, InventoryMain.class);
        spec = tabHost.newTabSpec("Inventory")
                .setIndicator("", res.getDrawable(R.drawable.ic_tab_inventory))
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, EventMain.class);
        spec = tabHost.newTabSpec("Events")
                .setIndicator("", res.getDrawable(R.drawable.ic_tab_events))
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, ShoppingListMain.class);
        spec = tabHost
                .newTabSpec("Shopping")
                .setIndicator("",
                        res.getDrawable(R.drawable.ic_tab_shopping))
                .setContent(intent);
        tabHost.addTab(spec);


        int tabNumber = getIntent().getIntExtra("TabNumber", 0);

        tabHost.setCurrentTab(tabNumber);

    }

}