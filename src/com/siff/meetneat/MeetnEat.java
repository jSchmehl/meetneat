package com.siff.meetneat;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MeetnEat extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, EATMEETS));
        
        ListView emList = getListView();
        emList.setTextFilterEnabled(true);
        
        
        emList.setOnItemClickListener(emListItemListener);
        
        //setContentView(R.layout.main);
    }
    
    private OnItemClickListener emListItemListener = new OnItemClickListener() {
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// When clicked, show a toast with the TextView text
		Toast.makeText(getApplicationContext(), ((TextView) view).getText(),Toast.LENGTH_SHORT).show();
	}
    };
    
    static final String[] EATMEETS = new String[] {
        "Dinner at Joe's", "Tuesday's Cook Club (Michael)", "Pre-Xmas Cooking", "making Cake for Anna'S Bday", "Tuesday's Cook Club (Jessica)"};
}