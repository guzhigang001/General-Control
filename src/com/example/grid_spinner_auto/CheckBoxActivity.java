package com.example.grid_spinner_auto;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends Activity {
CheckBox sl,et,pl;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_box);
		et=(CheckBox) findViewById(R.id.et);
		pl=(CheckBox) findViewById(R.id.pl);
		sl=(CheckBox) findViewById(R.id.sl);
		
	}
public void onClick(View v){
	StringBuffer buffer=new StringBuffer("°®ºÃ£º");
	if (sl.isChecked()) {
		buffer.append(sl.getText().toString());
	}
	if (et.isChecked()) {
		buffer.append(et.getText().toString());
	}
	if (pl.isChecked()) {
		buffer.append(pl.getText().toString());
	}
	Toast.makeText(CheckBoxActivity.this, buffer.toString(), Toast.LENGTH_LONG).show();
	
}


}
