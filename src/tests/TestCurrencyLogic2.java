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
public class TestCurrencyLogic2 {
	CurrencyLogic cl = new CurrencyLogic();
	Currency currency = new Currency();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConvertEuro() {
		assertNull(currency.getName());
	}

}
