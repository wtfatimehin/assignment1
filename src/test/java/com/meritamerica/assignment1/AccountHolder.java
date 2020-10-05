package src.test.java.com.meritamerica.assignment1;

import java.text.DecimalFormat;

import src.main.java.com.meritamerica.assignment1.CheckingAccount;
import src.main.java.com.meritamerica.assignment1.SavingsAccount;

public class AccountHolder {
	private String fName = "";
	private String mName = "";
	private String lName = "";
	private String ssn = "";
	
	private static final double checkingAccountStartBal = 0;
	CheckingAccount checkingaccount = null;
	SavingsAccount savingaccount = null;
	private CheckingAccount savingsaccount;
	
	public AccountHolder() {
		System.out.println("This console logs the AccountHolder constructor");
	}
	
	//The parameters for the account holder
	public AccountHolder(String fName, String mName, String lName, String ssn, double checkingAccountStartBal, double savingAccountStartBal) {
		
		this.fName = fName;
		this.mName = mName;
		this.ssn = ssn;
		this.checkingaccount = new CheckingAccount(checkingAccountStartBal);
		this.savingaccount = new SavingsAccount(savingAccountStartBal);
		
	}
	
	
	//getters and setters
	public String getFirstName() {
		return fName;
	}
	public void setFirstName(String fName) {
		this.fName = fName;
	}
	
	
	public String getMiddleName() {
		return mName;
	}
	public void setMiddleName(String mName) {
		this.mName = mName;
	}
	
	
	public String getLastname() {
		return lName;
	}
	public void setLastName(String lName) {
		this.lName = lName;
	}
	
	
	public String getSSN() {
		return ssn;
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	
	public CheckingAccount getCheckingAccount() {
		return checkingaccount;
	}
	
	
	public SavingsAccount getSavingsAccount() {
		return savingaccount;
	}
	
	public String toString() {
		DecimalFormat decf = new DecimalFormat("0.##");
		
		return "Acount holders name: " + fName + " " + mName + " " + lName + "\n"
				+ "Social Security number: " + ssn + "\n"
				+ "The checking account balance: " + decf.format(checkingaccount.getTheBalance()) + "\n"
				+ "Checking Account balance in 3 years: " + decf.format(checkingaccount.interestVal(3)) + "\n"
				+ "Savings Account balance in 3 n years: " + decf.format(savingaccount.interestVal(3)) + "\n"
				+ "The Checking Account with an interest rate of: " + checkingaccount.getIntRate() + "\n"
				+ "The Savings Account with an interest rate of: " + savingaccount.getIntRate();
		
	}
}
