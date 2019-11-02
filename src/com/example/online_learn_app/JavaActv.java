package com.example.online_learn_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class JavaActv extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_java_actv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.java_actv, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) { 
		    switch (item.getItemId()) {
	        case R.id.mm:
	            Intent imm=new Intent("Home");
	            startActivity(imm);
	          return true;
	        case R.id.co:
	        	Intent ico=new Intent("Checkout");
	            startActivity(ico);
	            return true;
	        case R.id.ac:
	        	Intent iac=new Intent("Addcart");
	            startActivity(iac);
	            return true;
	        case R.id.e: // Exit menu option 
	        	Intent i2=new Intent("Home"); 
	        	i2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
	        	i2.putExtra("exit", true); 
	        	startActivity(i2); 
	        	return true;
	        default:
	        	return super.onOptionsItemSelected(item);
	    }
	}

}
