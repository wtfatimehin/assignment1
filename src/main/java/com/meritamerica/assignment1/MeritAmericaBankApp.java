package src.main.java.com.meritamerica.assignment1;

import src.test.java.com.meritamerica.assignment1.AccountHolder;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		AccountHolder accountBearer = new AccountHolder();
		
		System.out.println(accountBearer.toString());
		
		accountBearer.getCheckingAccount().deposit(200);
		
		accountBearer.getSavingsAccount().withdraw(1000);
		
		System.out.println(accountBearer.getCheckingAccount().toString());
		
		System.out.println(accountBearer.getSavingsAccount().toString());
	}

}