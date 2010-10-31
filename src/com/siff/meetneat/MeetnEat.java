package com.siff.meetneat;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MeetnEat extends Activity {
	
	static final int DIALOG_LOGGING_IN = 0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);

    }
    
    public void doLogin(View view) {
    	showDialog(DIALOG_LOGGING_IN);        
        // go to [Home.Eatmeets]
    	this.startActivity(new Intent(getApplicationContext(),ListEatMeets.class));
    }
    protected ProgressDialog onCreateDialog(int id) {
    	ProgressDialog dialog = null;
        switch(id) {
        case DIALOG_LOGGING_IN:
            // do the work to define the pause Dialog
        	dialog = ProgressDialog.show(MeetnEat.this, "", "Logging in. Please wait...", true);
            break;
        }
        return dialog;
    }
    
    
    
}