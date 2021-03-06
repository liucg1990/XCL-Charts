package com.demo.xclcharts;

import java.util.Random;

import com.demo.xclcharts.view.DialChart01View;
import com.demo.xclcharts.view.DialChart02View;
import com.demo.xclcharts.view.DialChart03View;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DialChart2Activity extends Activity {
	
	DialChart02View chart = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dial_chart2);
		
		chart = (DialChart02View)findViewById(R.id.circle_view); 
		
		final Button button = (Button)findViewById(R.id.button1); 
		
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				int max = 100;
			    int min = 1;
				Random random = new Random();
				int p = random.nextInt(max)%(max-min+1) + min;					
				float pf = p / 100f;
				chart.setCurrentStatus(pf);
				chart.invalidate();
			}
			
		  }
		);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dial_chart2, menu);
		return true;
	}

}
