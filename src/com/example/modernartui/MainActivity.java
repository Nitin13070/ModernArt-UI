package com.example.modernartui;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends ActionBarActivity {
	
	private SeekBar colorControl = null;
	private View box1;
	private View box2;
	private View box3;
	private View box4;
	private View box5;
	private int boxColor1;
	private int boxColor2;
	private int boxColor3;
	private int boxColor4;
	private int boxColor5;
	private MomaDialog momaDialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		colorControl = (SeekBar) findViewById(R.id.seekBar);
		box1 = (View)findViewById(R.id.box1);
		box2 = (View)findViewById(R.id.box2);
		box3 = (View)findViewById(R.id.box3);
		box4 = (View)findViewById(R.id.box4);
		box5 = (View)findViewById(R.id.box5);
		
		boxColor1 = 0xFF00b0e6;
		boxColor2 = 0xFFff6666;
		boxColor3 = 0xFFe2252d;
		boxColor4 = 0xFFffffff;
		boxColor5 = 0xFF004444;
		
		box1.setBackgroundColor(boxColor1);
		box2.setBackgroundColor(boxColor2);
		box3.setBackgroundColor(boxColor3);
		box4.setBackgroundColor(boxColor4);
		box5.setBackgroundColor(boxColor5);
		colorControl.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				box1.setBackgroundColor(boxColor1+progress*2);
				box2.setBackgroundColor(boxColor2+ progress*2);
				box3.setBackgroundColor(boxColor3 + progress*2);
				box5.setBackgroundColor(boxColor5 + progress*2);

				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.moreinfo) {
			momaDialog = new MomaDialog();
			momaDialog.show(getFragmentManager(), "moma");
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
