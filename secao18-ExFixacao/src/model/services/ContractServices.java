package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contracts;
import model.entities.Installment;

public class ContractServices {
	
	private OnlinePaymentsFee onlinePaymentsFee;

	public ContractServices(OnlinePaymentsFee onlinePaymentsFee) {
		this.onlinePaymentsFee = onlinePaymentsFee;
	}
	
	public Date addMonth(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
	public void processContract(Contracts contract, int month) {
		double basicValue = contract.getValueTotal() / month;
		for(int i=1; i <= month; i++) {
			Date date = addMonth(contract.getDate(), i);
			double updateBasicValue = basicValue + onlinePaymentsFee.rateMonth(basicValue, i);
			double fullQuota = updateBasicValue + onlinePaymentsFee.feePayment(updateBasicValue);
			contract.addInstallment(new Installment(date,fullQuota));
		}
	}
	
	
}
