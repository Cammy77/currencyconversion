package tests;
import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

import model.Currency;
import model.CurrencyLogic;

/**
 * Cameron Mockobee - cmockobee1@dmacc.edu
 * CIS175 - Fall 2023
 * Sep 4, 2023
 */
public class TestCurrencyLogic {
	CurrencyLogic cl = new CurrencyLogic();
	Currency currency = new Currency("Dollar");
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConvertEuro() {
		currency.setAmt(500);
		double converted = cl.convertEuros(currency);
		assertEquals(463.31, converted, .99);
	}
	@Test
	public void testConvertYen() {
		currency.setAmt(700);
		double convert = cl.convertYen(currency);
		assertNotNull(currency);
	}
	
}
