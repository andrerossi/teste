package com.example.helloaliens;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.ImageView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void displayData(RssItem item){
		TextView title = (TextView)findViewById(R.id.titulo);
		TextView date = (TextView)findViewById(R.id.data);
		ImageView image = (ImageView)findViewById(R.id.imagem);
		TextView desctiption = (TextView)findViewById(R.id.texto);
	
		if (item != null){
			title.setText(item.getTitle());
			date.setText(item.getDate());
			image.setImageBitmap(item.getImage());
			desctiption.setText(item.getDescription());
		}
	
	
	}

}
