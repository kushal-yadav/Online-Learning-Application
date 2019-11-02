package com.example.online_learn_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Thankyou extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thankyou);
	
Button bt1=(Button)findViewById(R.id.bt1);
bt1.setOnClickListener(new View.OnClickListener(){
	
	
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i2=new Intent("Home"); 
    	i2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
    	i2.putExtra("exit", true); 
    	startActivity(i2); 
    	
	}
});
}
}
