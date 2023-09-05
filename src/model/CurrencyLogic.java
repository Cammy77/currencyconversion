package model;

/**
 * Cameron Mockobee - cmockobee1@dmacc.edu
 * CIS175 - Fall 2023
 * Sep 4, 2023
 */
public class CurrencyLogic {

	public double convertEuros(Currency currency) {
		double euroCurrency;
		euroCurrency = currency.getAmt() * .926;
		return euroCurrency;
	}
	
	public double convertYen(Currency currency) {
		double yenCurrency = 0;
		yenCurrency = currency.getAmt() * 146.415;
		return yenCurrency;
	}
	
	
}
