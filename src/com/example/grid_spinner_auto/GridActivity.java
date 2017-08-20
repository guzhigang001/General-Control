package com.example.grid_spinner_auto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class GridActivity extends Activity {
	//
	//	private String[] strs={"tom1","tom2","tom3","tom4","tom5",
	//			"tom1","tom1","tom1","tom1","tom1","tom1","tom1",};
	private GridView grid;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);
		grid=(GridView) findViewById(R.id.grid);

		//		ArrayAdapter<String> adapter=new ArrayAdapter<String>(GridActivity.this, android.R.layout.simple_list_item_1, strs);
		//	    grid.setAdapter(adapter);
		Myadapter myadapter=new Myadapter();
		grid.setAdapter(myadapter);
		//	    grid.setOnItemClickListener(new OnItemClickListener(){
		//
		//			@Override
		//			public void onItemClick(AdapterView<?> parent, View view,
		//					int position, long id) {
		//				// TODO Auto-generated method stub
		//				Toast.makeText(GridActivity.this, strs[position], Toast.LENGTH_SHORT).show();
		//			}
		//	    	
		//	    });

	}
	class Myadapter extends BaseAdapter{

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 50;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
//			View view=getLayoutInflater().inflate(R.layout.item, null);
//			TextView text=(TextView) view.findViewById(R.id.num);
//			text.setText(position+"");
			TextView text = null;
			if (convertView==null) {
				convertView=getLayoutInflater().inflate(R.layout.item, null);
				text=(TextView) convertView.findViewById(R.id.num);
				convertView.setTag(text);
			}else{
				text=(TextView) convertView.getTag();

			}
			text.setText(position+"");
			return convertView;
		}

	}

}
