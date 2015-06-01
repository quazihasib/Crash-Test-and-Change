package com.example.crashtest;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Thread.setDefaultUncaughtExceptionHandler(new UnCaughtException(MainActivity.this));
        
        int y = 5/0;
	}

}
