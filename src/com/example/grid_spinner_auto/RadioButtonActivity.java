package com.example.grid_spinner_auto;

import com.example.grid_spinner_auto.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class RadioButtonActivity extends Activity {
RadioButton man,women;
RadioGroup rg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio_button);
		man=(RadioButton) findViewById(R.id.man);
		women=(RadioButton) findViewById(R.id.women);
		rg=(RadioGroup) findViewById(R.id.rg);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.man:
				Toast.makeText(RadioButtonActivity.this, man.getText().toString(), Toast.LENGTH_LONG).show();
		
				break;
		
			case R.id.women:
				Toast.makeText(RadioButtonActivity.this, man.getText().toString(), Toast.LENGTH_LONG).show();
		
				break;
				}
			}
		});
	}

//public void onClick(View v){
////	if (man.isChecked()) {
////		Toast.makeText(RadioButtonActivity.this, man.getText().toString(), Toast.LENGTH_LONG).show();
////		
////	}else{
////		Toast.makeText(RadioButtonActivity.this, women.getText().toString(), Toast.LENGTH_LONG).show();
////
////	}
//	switch (rg.getCheckedRadioButtonId()) {
//	case R.id.man:
//		Toast.makeText(RadioButtonActivity.this, man.getText().toString(), Toast.LENGTH_LONG).show();
//
//		break;
//
//	case R.id.women:
//		Toast.makeText(RadioButtonActivity.this, man.getText().toString(), Toast.LENGTH_LONG).show();
//
//		break;
//	}
//
//}

}
