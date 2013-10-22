package com.example.jbfinance;

import java.text.NumberFormat;
import java.util.Currency;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class PaymentsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_payments);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.payments, menu);
		return true;
	}
	
	public void runButtonOnClick(View view){
		try
		{		
			EditText inCashValueTextBox = (EditText) findViewById(R.id.inCashValueTextBox);
			EditText numberOfInstalmentsTextBox = (EditText) findViewById(R.id.numberOfInstalments);
			EditText interestTextbox = (EditText) findViewById(R.id.interestTextbox);
			
			Number presentValue = NumberFormat.getCurrencyInstance().parse(inCashValueTextBox.getText().toString());
			int numberOfInstalments = (Integer) NumberFormat.getIntegerInstance().parse(numberOfInstalmentsTextBox.getText().toString());
			Number interest = NumberFormat.getNumberInstance().parse(interestTextbox.getText().toString());
			
			
			
		}
		catch(Exception exception){
		}		
	}

}
