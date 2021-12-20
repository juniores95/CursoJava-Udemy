package model.services;

public interface OnlinePaymentsFee {
	
	public double rateMonth (double amount, int month);
	public double feePayment (double amount);
}
