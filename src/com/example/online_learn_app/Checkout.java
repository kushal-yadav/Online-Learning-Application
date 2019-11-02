package com.example.online_learn_app;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Checkout extends Activity {


    String temp = "";
    int no=0;
    EditText ed2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_checkout);

	

        ed2 = (EditText) findViewById(R.id.ed2);
       AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.actv);
        String file = "Mydata.txt";

        String[] arraylist = new String[20];

        try{
            FileInputStream fis = openFileInput(file);
            InputStreamReader isr=new InputStreamReader(fis);
            char[] inputBuffer=new char[10];
            int charRead;
            String readString;
            while ((charRead = isr.read(inputBuffer))>0) {
                readString=String.copyValueOf(inputBuffer,0,charRead);
                temp+= readString;
                inputBuffer=new char[10];
            }
            int i = temp.length()-1;
            arraylist = temp.split(",");
            no = arraylist.length;
            



        }catch(Exception e){}

        final RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

       
        TextView tv4 = (TextView)findViewById(R.id.tv4);
        TextView tv6 = (TextView)findViewById(R.id.tv6);
        TextView tv8 = (TextView)findViewById(R.id.tv8);
        Button btn = (Button)findViewById(R.id.btn);

        tv4.setText(temp);
        final double cost = 4000*no;
        tv6.setText(""+cost);
        double discount  = cost*0.1;
        final double net = cost - discount;
        tv8.setText(net+"");





        String[] str = getResources().getStringArray(R.array.banks);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, str);
        actv.setThreshold(0);
        actv.setAdapter(adapter);




        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if ( (ed2.getText().toString().length()==12) ) {
                    Intent c = new Intent(getBaseContext(), Confirmation.class);
                    c.putExtra("cost", net);
                    c.putExtra("courses", temp);
                    finish();
                    startActivity(c);
                }else if(ed2.getText().toString().length()>12||(ed2.getText().toString().length()<12&&ed2.getText().toString().length()!=0))
                {
                    Toast.makeText(getBaseContext(),"Account No should be 12 digits",Toast.LENGTH_SHORT).show();
       	
                }else
              {
                    Toast.makeText(getBaseContext(),"Enter credentials please",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }}


