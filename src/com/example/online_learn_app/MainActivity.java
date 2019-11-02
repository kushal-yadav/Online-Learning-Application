package com.example.online_learn_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    Thread background = new Thread() {// Create Thread that will sleep for 5 seconds  
        public void run() {
             
            try {
                // Thread will sleep for 5 seconds
                sleep(3*1000);
                 
                // After 3 seconds redirect to another intent
                Intent i=new Intent("Home");
                startActivity(i);
                 
                //Remove activity
                finish();
                 
            } catch (Exception e) {
             
            }
        }
    };
     
    // start thread
    background.start();


}}
