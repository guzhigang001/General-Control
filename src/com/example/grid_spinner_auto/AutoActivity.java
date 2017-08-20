package com.example.grid_spinner_auto;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoActivity extends Activity {
	private String[] strs={"tom1","tom2","tom3","tom4","tom5",
			"tom1","tom1","tom1","tom1","tom1","tom1","tom1",};
AutoCompleteTextView auto;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto);
		auto=(AutoCompleteTextView) findViewById(R.id.auto);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(AutoActivity.this, android.R.layout.simple_list_item_1, strs);
	    auto.setAdapter(adapter);
	}



}
