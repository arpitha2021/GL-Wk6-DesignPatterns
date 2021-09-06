package com.greatlearning.designpattern2;

import java.util.Arrays;
import java.util.List;

public class BankAccount {
	private int bankAccountNo;
	private String accountType;
	private String branch;
	private double balance;

	// atmTransactions, emiSchedule
	private List<String> atmTrasactions;// optional
	private String emiSchedule;// optional

	public BankAccount(BankAccountBuilder bankAccountBuilder) {
		this.bankAccountNo = bankAccountBuilder.bankAccountNo;
		this.accountType = bankAccountBuilder.accountType;
		this.branch = bankAccountBuilder.branch;
		this.balance = bankAccountBuilder.balance;
		this.atmTrasactions = bankAccountBuilder.atmTrasactions;
		this.emiSchedule = bankAccountBuilder.emiSchedule;
	}

	public int getBankAccountNo() {
		return bankAccountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getBranch() {
		return branch;
	}

	public double getBalance() {
		return balance;
	}

	public static class BankAccountBuilder {
		private int bankAccountNo;
		private String accountType;
		private String branch;
		private double balance;

		// atmTransactions, emiSchedule
		private List<String> atmTrasactions;// optional
		private String emiSchedule;// optional

		public BankAccountBuilder(int bankAccountNo, String accountType, String branch, double balance) {
			super();
			this.bankAccountNo = bankAccountNo;
			this.accountType = accountType;
			this.branch = branch;
			this.balance = balance;
		}

		public BankAccountBuilder setAtmTrasactions(List<String> atmTrasactions) {
			this.atmTrasactions = atmTrasactions;
			return this;
		}

		public BankAccountBuilder setEmiSchedule(String emiSchedule) {
			this.emiSchedule = emiSchedule;
			return this;
		}

		public BankAccount build() {
			BankAccount account = new BankAccount(this);
			// validateBankAccount(account);
			return account;
		}

		private void validateBankAccount(BankAccount acc) {
			if (acc.getAccountType().equals("SAVING") && acc.getBalance() > 100000) {
				// acc.Ban
			}
		}

	}

	@Override
	public String toString() {
		return "BankAccount [bankAccountNo=" + bankAccountNo + ", accountType=" + accountType + ", branch=" + branch
				+ ", balance=" + balance + ", atmTrasactions=" + atmTrasactions + ", emiSchedule=" + emiSchedule + "]";
	}

}
