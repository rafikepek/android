package com.example.fti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class TI extends MainActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ti);
		Button move = (Button)findViewById(R.id.back1);
		move.setOnClickListener(this);
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.back1) {
		Intent i=new Intent(this,MainActivity.class);
		startActivity(i);
		finish();
		}
		}

}
