package com.example.online_learn_app;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Addtocart extends Activity {

ListView lv;
Button btn;
int n=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addtocart);




    lv = (ListView)findViewById(R.id.lv);
    btn = (Button)findViewById(R.id.btn);

    String[] str = getResources().getStringArray(R.array.items);

    // set adapter
    final ArrayAdapter<String> AA= new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_multiple_choice, str);
    lv.setChoiceMode(2);
    lv.setAdapter(AA);

    String file = "Mydata.txt";


    // Button listener


    btn.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
            // TODO Auto-generated method stub

            SparseBooleanArray check = lv.getCheckedItemPositions();
            ArrayList<String> aa = new ArrayList<String>();
            for (int i = 0; i < check.size(); i++) {
                int pos = check.keyAt(i);
                if (check.valueAt(i)) {
                    n++;
                    aa.add(AA.getItem(pos));
                }
            }
            int n1 =lv.getCheckedItemCount();


            String f = "Mydata.txt";
            FileOutputStream fout = null;
            try {
                fout = openFileOutput(f, Context.MODE_PRIVATE);
                OutputStreamWriter osw = new OutputStreamWriter(fout);
                for (int k = 0; k < aa.size(); k++) {
                    osw.write(aa.get(k) + ",");
                }
                osw.close();
            }
            catch(Exception e){}



            Intent h = new Intent(Addtocart.this,Checkout.class);
            finish();
            startActivity(h);
        }
    });

}}