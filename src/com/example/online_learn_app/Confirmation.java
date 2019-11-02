package com.example.online_learn_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_confirmation);
		String courses = getIntent().getStringExtra("courses");
        double cost = getIntent().getDoubleExtra("cost", 0);

        TextView tv4 = (TextView)findViewById(R.id.tv4);
        TextView tv6 = (TextView)findViewById(R.id.tv6);
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);

        tv4.setText(courses);
        tv6.setText(""+cost);

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent("Thankyou");
                finish();
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent j = new Intent("Addcart");
                startActivity(j);
            }
        });

	}

}
