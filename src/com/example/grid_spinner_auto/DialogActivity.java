package com.example.grid_spinner_auto;

import java.util.Calendar;
import java.util.GregorianCalendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TimePicker;
import android.widget.Toast;

public class DialogActivity extends Activity {

	String[] names = { "如花", "凤姐", "刘子晨", "金星" };
	EditText name, pwd;
	// Button login;
	AlertDialog dialog;
	int mY, mM, mD, mH, mm;
	Button btn4, btn5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dialog);
		btn4 = (Button) findViewById(R.id.btn4);
		btn5 = (Button) findViewById(R.id.btn5);
		Calendar calendar = new GregorianCalendar();
		mY = calendar.get(Calendar.YEAR);
		mM = calendar.get(Calendar.MONTH);
		mD = calendar.get(Calendar.DATE);
		btn4.setText(mY + "年" + (mM + 1) + "月" + mD + "日");
		mH = calendar.get(Calendar.HOUR_OF_DAY);
		mm = calendar.get(Calendar.MINUTE);
		btn5.setText(mH + "时" + mm + "分");
	}

	DialogInterface.OnClickListener clickListener = new DialogInterface.OnClickListener() {

		@Override
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
			String str = "";
			switch (which) {
			case -1:
				str = "是";
				break;

			case -2:
				str = "不得";
				break;
			case -3:
				str = "忽略";
				break;
			}
			Toast.makeText(DialogActivity.this, str + which, Toast.LENGTH_LONG)
					.show();
		}
	};

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn1:
			// 弹出文字
			show1();
			break;

		case R.id.btn2:
			// 弹出列表
			show2();
			break;
		case R.id.btn3:
			// 自定义弹出框
			show3();
			break;
		case R.id.btn4:
			// 日期选择器DatepickerDialog
			show4();
			break;
		case R.id.btn5:
			// 日期选择器TimepickerDialog
			show5();
			break;
		case R.id.btn6:
			// Toast方法
			show6();
			break;
		}

	}
public void show6(){
//	Toast toast=Toast.makeText(DialogActivity.this, "tosat", Toast.LENGTH_LONG);
	Toast toast=new Toast(DialogActivity.this);
	View view=getLayoutInflater().inflate(R.layout.toast, null);
	ImageView toast1=(ImageView) view.findViewById(R.id.toast);
	toast1.setImageResource(R.drawable.ic_launcher);
			toast.setView(view);
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.setDuration(Toast.LENGTH_LONG);
			toast.show();
			
}
	public void show5() {
		TimePickerDialog dialog = new TimePickerDialog(DialogActivity.this,
				new TimePickerDialog.OnTimeSetListener() {

					@Override
					public void onTimeSet(TimePicker view, int hourOfDay,
							int minute) {
						// TODO Auto-generated method stub
						mH = hourOfDay;
						mm = minute;
						btn5.setText(mH + "时" + mm + "分");
					}
				}, mH, mm, true);
		dialog.show();

	}

	public void show4() {
		DatePickerDialog dialog = new DatePickerDialog(DialogActivity.this,
				new DatePickerDialog.OnDateSetListener() {

					@Override
					public void onDateSet(DatePicker view, int year,
							int monthOfYear, int dayOfMonth) {
						// TODO Auto-generated method stub
						mY = year;
						mM = monthOfYear;
						mD = dayOfMonth;
						btn4.setText(mY + "年" + (mM + 1) + "月" + mD + "日");
					}
				}, mY, mM, mD);
		dialog.show();
	}

	public void show3() {
		AlertDialog.Builder builder = new AlertDialog.Builder(
				DialogActivity.this);
		builder.setTitle("登陆");
		View view = getLayoutInflater().inflate(R.layout.login, null);
		name = (EditText) view.findViewById(R.id.name);
		pwd = (EditText) view.findViewById(R.id.pwd);
		// login = (Button) view.findViewById(R.id.login);
		// login.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// // TODO Auto-generated method stub
		// if (name.getText().toString().trim().equals("admin")
		// && pwd.getText().toString().trim().equals("123")) {
		// Toast.makeText(DialogActivity.this, "成功", Toast.LENGTH_LONG)
		// .show();
		// dialog.dismiss();
		// }
		// }
		// });
		builder.setPositiveButton("登陆", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				if (name.getText().toString().trim().equals("admin")
						&& pwd.getText().toString().trim().equals("123")) {
					Toast.makeText(DialogActivity.this, "成功", Toast.LENGTH_LONG)
							.show();
				}
			}
		});
		builder.setView(view);
		builder.create();
		builder.show();
		// dialog=builder.create();
		// dialog.show();
	}

	public void show1() {
		AlertDialog.Builder builder = new AlertDialog.Builder(
				DialogActivity.this);
		builder.setTitle("温馨提示");
		builder.setMessage("远离tom");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setPositiveButton("是", clickListener);
		builder.setNegativeButton("不的", clickListener);
		builder.setNeutralButton("忽略", clickListener);
		builder.create();
		builder.show();
	}

	public void show2() {
		AlertDialog.Builder builder = new AlertDialog.Builder(
				DialogActivity.this);
		builder.setTitle("选择一位美女");
		builder.setItems(names, new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(DialogActivity.this, names[which],
						Toast.LENGTH_LONG).show();
			}
		});
		builder.setCancelable(false);
		builder.create();
		builder.show();
	}

}
