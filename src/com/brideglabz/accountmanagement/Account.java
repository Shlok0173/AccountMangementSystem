package com.brideglabz.accountmanagement;

public class Account {

	private String accountHolderName;
	private long accountHolderDathOfBirth;
	private long accountHolderMobileNumber;
	private String accountHolderEmail;

	Account() {

	}

	public Account(String accountHolderName, long accountHolderDathOfBirth, long accountHolderMobileNumber,
			String accountHolderEmail) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountHolderDathOfBirth = accountHolderDathOfBirth;
		this.accountHolderMobileNumber = accountHolderMobileNumber;
		this.accountHolderEmail = accountHolderEmail;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getAccountHolderDathOfBirth() {
		return accountHolderDathOfBirth;
	}

	public void setAccountHolderDathOfBirth(long accountHolderDathOfBirth) {
		this.accountHolderDathOfBirth = accountHolderDathOfBirth;
	}

	public long getAccountHolderMobileNumber() {
		return accountHolderMobileNumber;
	}

	public void setAccountHolderMobileNumber(long accountHolderMobileNumber) {
		this.accountHolderMobileNumber = accountHolderMobileNumber;
	}

	public String getAccountHolderEmail() {
		return accountHolderEmail;
	}

	public void setAccountHolderEmail(String accountHolderEmail) {
		this.accountHolderEmail = accountHolderEmail;
	}

}
