/*
Developed By Michaell Reis Gasparini
07-04-2014

*/

package com.example.testcalculator;


import com.example.testcalculator.*;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	EditText editText1;
	EditText editText2;
	EditText editText3;
	Button btnplus;
	Button btnsub;
	Button btndiv;
	Button btnmulti;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editText1 = (EditText)findViewById(R.id.editText1);
		 editText2 =(EditText)findViewById(R.id.editText2);
			//Find Button plus
		 btnplus= (Button)findViewById(R.id.button1);
		 //Create the setOnclickListener
		 btnplus.setOnClickListener(new OnClickListener() {
			 //Create the onclick
				public void onClick(View v) {
					//Define string to EditText1
					String snum1= editText1.getText().toString();
					//Try to parse a num1
					int num1 = Integer.parseInt(snum1);
					//Define string to EditText2
					String snum2= editText2.getText().toString();
					//Try to parse a num2
					int num2 = Integer.parseInt(snum2);
					//Calculate the result
					int result = num1+num2;
					//Parse to string the integer
					String sresult = Integer.toString(result);
					//Set Text to EditText3
					editText3.setText(sresult);
				}
			});

		 
		 //Find Button Sub
		 btnsub= (Button)findViewById(R.id.button2);
		 //Create the setOnclickListener
		 btnsub.setOnClickListener(new OnClickListener() {
			 //Create the onclick
				public void onClick(View v) {
					//Define string to EditText1
					String snum1= editText1.getText().toString();
					//Try to parse a num1
					int num1 = Integer.parseInt(snum1);
					//Define string to EditText2
					String snum2= editText2.getText().toString();
					//Try to parse a num2
					int num2 = Integer.parseInt(snum2);
					//Calculate the result
					int result = num1-num2;
					//Parse to string the integer
					String sresult = Integer.toString(result);
					//Set Text to EditText3
					editText3.setText(sresult);
				}
			});


		 
		 //Find Button Div
		 btndiv= (Button)findViewById(R.id.button3);
		 //Create the setOnclickListener
		 btndiv.setOnClickListener(new OnClickListener() {
			 //Create the onclick
				public void onClick(View v) {
					//Define string to EditText1
					String snum1= editText1.getText().toString();
					//Try to parse a num1
					int num1 = Integer.parseInt(snum1);
					//Define string to EditText2
					String snum2= editText2.getText().toString();
					//Try to parse a num2
					int num2 = Integer.parseInt(snum2);
					//if(num2!= 0){
					//Calculate the result
					int result = num1/num2;
					//Parse to string the integer
					String sresult = Integer.toString(result);
					//Set Text to EditText3
					editText3.setText(sresult);
					/*}
				
					else{
						
						
					}*/				}
				
			});
		//Find Button Multi
		 btnmulti= (Button)findViewById(R.id.button4);
		 //Create the setOnclickListener
		 btnmulti.setOnClickListener(new OnClickListener() {
			 //Create the onclick
				public void onClick(View v) {
					//Define string to EditText1
					String snum1= editText1.getText().toString();
					//Try to parse a num1
					int num1 = Integer.parseInt(snum1);
					//Define string to EditText2
					String snum2= editText2.getText().toString();
					//Try to parse a num2
					int num2 = Integer.parseInt(snum2);
					//Calculate the result
					int result = num1*num2;
					//Parse to string the integer
					String sresult = Integer.toString(result);
					//Set Text to EditText3
					editText3.setText(sresult);
				}
			});
		 editText3 =(EditText)findViewById(R.id.editText3);
		 
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}


}
