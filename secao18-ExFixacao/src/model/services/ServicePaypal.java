package model.services;

public class ServicePaypal implements OnlinePaymentsFee{
	
	private static final double rateMonth = 0.01;
	private static final double feePayment = 0.02;

	public double rateMonth (double amount, int month) {
		return amount * rateMonth * month;
	};
	public double feePayment (double amount) {
		return amount * feePayment;
	};
}
