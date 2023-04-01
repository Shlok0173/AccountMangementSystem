package com.brideglabz.accountmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManagement extends Account { // Single level inheritance

	List<Account> account = new ArrayList<Account>();
	Scanner scanner = new Scanner(System.in);
	Account accounts = new Account(); // Create a object to Account class

	public void addAccountDetails() { // Cretae a Method to Display Account details

		System.out.println("Enter Account Holder Name");
		String accountHolderName = scanner.nextLine();
		accounts.setAccountHolderName(accountHolderName);

		System.out.println("Enter Account Holder Date Of Birth");
		long accountHolderDateOfBirth=scanner.nextLong();
		accounts.setAccountHolderDathOfBirth(getAccountHolderDathOfBirth());

		System.out.println("Enter Account Holder Mobile Number");
		long accountHolderMobileNumber = scanner.nextLong();
		accounts.setAccountHolderMobileNumber(accountHolderMobileNumber);

		System.out.println("Enter Account Holder Email");
		String accountHolderEmail = scanner.nextLine();
		accounts.setAccountHolderEmail(accountHolderEmail);

	}
	
	  public void displayAccountDetails() {
		  if(account.isEmpty()) {
			  System.out.println("Account Deatails Are Empty");
		  }
		  System.out.println("Account Deatail Show");
		  
		  for(Account account:account) {
			  System.out.println("Account Holder Name"+account.getAccountHolderName());
			  System.out.println("Account Holder Dath Of Birth"+ " "+account.getAccountHolderDathOfBirth());
			  System.out.println("Account Holder Mobile number"+" "+account.getAccountHolderMobileNumber());
		      System.out.println("Account holder Email"+" "+account.getAccountHolderEmail());
		  }
	  }
	
}
