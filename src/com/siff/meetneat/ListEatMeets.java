package com.siff.meetneat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListEatMeets extends Activity {

	static final String[] EATMEETS = new String[] {"Dinner at Joe's", "Tuesday's Cook Club (Michael)", "Pre-Xmas Cooking", "making Cake for Anna'S Bday", "Tuesday's Cook Club (Jessica)"};
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.home_eatmeets);
        
        ListView emList = (ListView) findViewById(R.id.eatmeetsList);
        emList.setTextFilterEnabled(true);
        emList.setAdapter(new ArrayAdapter<String>(this, R.layout.home_eatmeets_emitem, EATMEETS));
        
        emList.setOnItemClickListener(emListItemListener);
        
        
        
        
    }
    
    
    private OnItemClickListener emListItemListener = new OnItemClickListener() {
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    		// When clicked, show a toast with the TextView text
    		Toast.makeText(getApplicationContext(), ((TextView) view).getText(),Toast.LENGTH_SHORT).show();
    	}
    };
    
    
    
    // the main menu at the bottom
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        case R.id.new_eatmeet:
        	Toast.makeText(getApplicationContext(), "new EatMeet",Toast.LENGTH_SHORT).show();
            return true;
        case R.id.search_recipes:
            //
            return true;
        case R.id.buddies:
            //
            return true;
        case R.id.notifications:
            //
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }

}
