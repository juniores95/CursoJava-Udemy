package Util;

public class CurrencyConverter {
	
	
	
	public static final double IOF = 0.06;
	
	public static double calc(double price_dollar, double amount_dollars) {
		double calc = price_dollar * amount_dollars;
		return calc += calc * IOF;
	}



}
