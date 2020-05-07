package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta_Corrente;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta_Corrente account;
		
		System.out.println("Enter a name holder");
		String name = sc.nextLine();
		
		System.out.println("Enter a number Account");
		int numberAccount = sc.nextInt();
		
		System.out.println("Is there an initial deposit (y/n)");
		char x = sc.next().charAt(0);
		
		double valueDeposited;
		
		if(x == 'y') {
			System.out.println("Enter a initial deposit value");
			valueDeposited = sc.nextDouble();
			account = new Conta_Corrente(name, numberAccount, valueDeposited);
		}
		else {
			account = new Conta_Corrente(name, numberAccount);
		}
		
		
		
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: %.2f%n%n", account.getNumberAccount(), account.getName(), account.getBalance());
		
		System.out.print("Enter a deposit value: ");
		valueDeposited = sc.nextDouble();
		account.deposit(valueDeposited);
		
		System.out.println("Update account data:");
		System.out.printf("Account %d, Holder: %s, Balance: %.2f%n%n", account.getNumberAccount(), account.getName(), account.getBalance());
		
		System.out.print("Enter a withdraw value: ");
		double valueWithdraw = sc.nextDouble();
		account.withdraw(valueWithdraw);
		
		System.out.println("Update account data:");
		System.out.printf("Account %d, Holder: %s, Balance: %.2f%n", account.getNumberAccount(), account.getName(), account.getBalance());
		
		sc.close();
	}

}
