package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contracts {

	private Integer number;
	private Date date;
	private Double valueTotal;
	
	private List<Installment> list = new ArrayList<>();
	
	public Contracts() {
		
	}

	public Contracts(Integer number, Date date, Double valueTotal) {
		super();
		this.number = number;
		this.date = date;
		this.valueTotal = valueTotal;
		
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValueTotal() {
		return valueTotal;
	}

	public void setValueTotal(Double valueTotal) {
		this.valueTotal = valueTotal;
	}

	public List<Installment> getList() {
		return list;
	}

	public void addInstallment(Installment installment) {
		list.add(installment);
	}
	
	public void removeInstallment(Installment installment) {
		list.remove(installment);
	}
	
	
}
