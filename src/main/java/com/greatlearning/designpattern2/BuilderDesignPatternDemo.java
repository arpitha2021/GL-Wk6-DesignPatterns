package com.greatlearning.designpattern2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuilderDesignPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BankAccount> bankAccountList = new ArrayList<BankAccount>();
		BankAccount bankAccount1 = new BankAccount.BankAccountBuilder(1000, "SAVINGS", "Hyderabad", 10909023).build();
		bankAccountList.add(bankAccount1);	
		BankAccount bankAccount2 = new BankAccount.BankAccountBuilder(1010, "SAVINGS", "BANGALORE", 10088787).setEmiSchedule("Applied").build();
		bankAccountList.add(bankAccount2);
		BankAccount bankAccount3 = new BankAccount.BankAccountBuilder(1234, "Current", "BANGALORE", 10088787).setEmiSchedule("Applied").setAtmTrasactions(Arrays.asList("withdraw","deposit")).build();
		bankAccountList.add(bankAccount2);
		bankAccountList.add(bankAccount3);
		bankAccountList.forEach(account->System.out.println(account.toString()));
	}

}
