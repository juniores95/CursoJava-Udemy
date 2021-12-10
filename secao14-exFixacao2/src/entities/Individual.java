package entities;

public class Individual extends TaxPayer{
	
	private double heathExpenditures;

	public Individual() {
		
	}
	
	public Individual(String name, Double anualIncome, double heathExpenditures) {
		super(name, anualIncome);
		this.heathExpenditures = heathExpenditures;
	}

	public double getHeathExpenditures() {
		return heathExpenditures;
	}

	public void setHeathExpenditures(double heathExpenditures) {
		this.heathExpenditures = heathExpenditures;
	}
	
	@Override	
	public double tax() {
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - heathExpenditures * 0.5;
		}
		else {
			return getAnualIncome() * 0.25 - heathExpenditures * 0.5;
		}
	}
	
}
