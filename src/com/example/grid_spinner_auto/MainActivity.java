package com.example.grid_spinner_auto;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

public void onClick(View v){
	switch (v.getId()) {
	case R.id.gv:
		Intent intent=new Intent(MainActivity.this,GridActivity.class);
		startActivity(intent);
		break;

	case R.id.sp:
		Intent intent1=new Intent(MainActivity.this,SpinnerActivity.class);
		startActivity(intent1);
		break;
	case R.id.auto:
		Intent intent2=new Intent(MainActivity.this,AutoActivity.class);
		startActivity(intent2);
		break;
	case R.id.radio:
		Intent intent3=new Intent(MainActivity.this,RadioButtonActivity.class);
		startActivity(intent3);
		break;
	case R.id.check:
		Intent intent4=new Intent(MainActivity.this,CheckBoxActivity.class);
		startActivity(intent4);
		break;
	case R.id.dialog:
		Intent intent5=new Intent(MainActivity.this,DialogActivity.class);
		startActivity(intent5);
}
}
}
