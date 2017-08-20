package com.example.grid_spinner_auto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class SpinnerActivity extends Activity {
	//	private String[] strs={"tom1","tom2","tom3","tom4","tom5",
	//				"tom1","tom1","tom1","tom1","tom1","tom1","tom1",};
	Spinner spinner,spinner1;
	String[] str1={"ÁÉÄþ","ºÚÁú½­","¼ªÁÖ"};
	String[] str2={"ÉòÑô","´óÁ¬","ÌúÁë"};
	String[] str3={"ÆßÌ¨ºÓ","Äµµ¤½­","¼ÑÄ¾Ë¹"};
	String[] str4={"ÓÜÊ÷","µÂ»Ý","³¤´º"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
		spinner=(Spinner) findViewById(R.id.spinner);
		spinner1=(Spinner) findViewById(R.id.spinner1);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(SpinnerActivity.this, android.R.layout.simple_list_item_1, str1);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				switch (position) {
				case 0:
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(SpinnerActivity.this, android.R.layout.simple_list_item_1, str2);
					spinner1.setAdapter(adapter);	
					break;

				case 1:
					ArrayAdapter<String> adapter1=new ArrayAdapter<String>(SpinnerActivity.this, android.R.layout.simple_list_item_1, str3);
					spinner1.setAdapter(adapter1);
					break;
				case 2:
					ArrayAdapter<String> adapter2=new ArrayAdapter<String>(SpinnerActivity.this, android.R.layout.simple_list_item_1, str4);
					spinner1.setAdapter(adapter2);
					break;
				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});

	}



}
