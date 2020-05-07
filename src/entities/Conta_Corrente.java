package entities;


public class Conta_Corrente {
	
	private String name;
	private int numberAccount;
	private double balance;
	
	public Conta_Corrente(String name, int numberAccount, double initialDeposit){
		this.name = name;
		this.numberAccount = numberAccount;
		deposit(initialDeposit);
	}
	
	public Conta_Corrente(String name, int numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(Double valueDeposited) {
		balance += valueDeposited;
	}
	
	public void withdraw(Double valueWithdraw) {
		balance -= valueWithdraw + 5.00;
	}
	
}
