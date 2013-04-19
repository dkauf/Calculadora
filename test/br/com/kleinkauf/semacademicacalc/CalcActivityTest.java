package br.com.kleinkauf.semacademicacalc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.widget.Button;
import android.widget.EditText;

import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class CalcActivityTest {

	private CalcActivity calc;
	private EditText txt1;
	private EditText txt2;
	private Button btnSoma;

	@Before
	public void setUp() throws Exception {
		calc = new CalcActivity();
		calc.onCreate( null );

		txt1 = (EditText) calc.findViewById( R.id.txt1 );
		txt2 = (EditText) calc.findViewById( R.id.txt2 );
		btnSoma = (Button) calc.findViewById( R.id.btnSoma );
	}

	@Test
	public void testaAplicacao() throws Exception {

		assertNotNull( calc );
		assertNotNull( txt1 );
		assertNotNull( txt2 );
		assertNotNull( btnSoma );

		txt1.setText( "5" );
		txt2.setText( "11" );
		assertEquals( 16D, calc.calculaSoma( txt1, txt2 ), 16D );
	}

	public void testGeral(){
		assertNotNull( txt1 );
	}
	
	/*
	 
	@Test				
					identifica que o método é um método de teste
					
	@Before 			
					Este método é executado antes de cada teste
					
	@After 				
					Este método é executado depois de cada teste. 
					
	@BeforeClass 		
					Este método é executado uma vez, antes do início de todos os teste.
					
	@AfterClass			
					Este método é executado uma vez, depois de todos os testes terem sido terminados.
					
	@Ignore				
					Ignora o método de teste. 
					
	@Test (expected = Exception.class)	 
					Falha se o método não lançar a exceção indicada.
					
	@Test(timeout=100)	 
					Falhar, se o método leva mais tempo do que 100 milissegundos.
	 
	*/
}
