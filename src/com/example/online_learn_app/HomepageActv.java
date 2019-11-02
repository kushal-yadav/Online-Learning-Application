package com.example.online_learn_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableRow;

public class HomepageActv extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homepage_actv);
		TableRow tr1=(TableRow)findViewById(R.id.tr1);
		TableRow tr2=(TableRow)findViewById(R.id.tr2);
		TableRow tr3=(TableRow)findViewById(R.id.tr3);
		TableRow tr4=(TableRow)findViewById(R.id.tr4);
		ImageButton ib1=(ImageButton)findViewById(R.id.ib1);
		ImageButton ib2=(ImageButton)findViewById(R.id.ib2);
		ImageButton ib3=(ImageButton)findViewById(R.id.ib3);
		ImageButton ib4=(ImageButton)findViewById(R.id.ib4);
	    
		tr1.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent("Android");
			startActivity(i);
			}
		});
tr2.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent j=new Intent("Java");
			startActivity(j);
			}
		});
tr3.setOnClickListener(new OnClickListener() {
	
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent k=new Intent("Oracle");
	startActivity(k);
	}
});
tr4.setOnClickListener(new OnClickListener() {
	
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent l=new Intent("Php");
	startActivity(l);
	}
});
ib1.setOnClickListener(new OnClickListener() {
	
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent("Android");
	startActivity(i);
	}
});
ib2.setOnClickListener(new OnClickListener() {
	
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent("Android");
	startActivity(i);
	}
});
ib3.setOnClickListener(new OnClickListener() {
	
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent("Android");
	startActivity(i);
	}
});
ib4.setOnClickListener(new OnClickListener() {
	
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent("Android");
	startActivity(i);
	}
});
	    
if(getIntent().getBooleanExtra("exit",false))
{ finish();
}  	
	
	
	}
	

	
}
