package util;

public class Conta {
	public int number;
	public String name;
	public double balance;
	
	

	public Conta() {
		
	}
	
	public Conta(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Conta(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		incrementbalance(balance);
	}
	
	
	public void incrementbalance(double value) {
		balance += value;
	}
	
	public void withdrawbalance(double value) {
		balance -= value + 5;
	}
	
	
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance : $ " + String.format("%.2f", balance);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
}
