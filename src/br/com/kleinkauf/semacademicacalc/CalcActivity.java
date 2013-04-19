package br.com.kleinkauf.semacademicacalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author Douglas Leandro Kleinkauf
 * 
 */
public class CalcActivity extends Activity {

	Button btnSoma;
	
	@Override
	public void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );

		final EditText txt1 = (EditText) findViewById( R.id.txt1 );
		final EditText txt2 = (EditText) findViewById( R.id.txt2 );
		

		btnSoma = (Button) findViewById( R.id.btnSoma );

		btnSoma.setOnClickListener( new View.OnClickListener() {

			@Override
			public void onClick( View v ) {
				
				double soma = calculaSoma( txt1, txt2 );
				
				Toast.makeText( getBaseContext(), "A soma dos valores é = " + soma, Toast.LENGTH_SHORT ).show();

			}
		} );

	}

	public double calculaSoma( EditText vl1, EditText vl2 ) {
		
		double c1 = Double.parseDouble( vl1.getText().toString() );
		double c2 = Double.parseDouble( vl2.getText().toString() );

		return c1 + c2;
	}

}