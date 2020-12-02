package com.rpete.bankaccountjava;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount Rachel = new BankAccount("Rachel");
		Rachel.checkingDeposit(5000);
		Rachel.savingsDeposit(10000);
		Rachel.printAccountStatement();
		Rachel.checkingWithdrawal(100);
		Rachel.savingsWithdrawal(200);
		Rachel.printAccountStatement();
		BankAccount Kilo = new BankAccount("Kilo");
		Kilo.printAccountStatement();
		Kilo.savingsWithdrawal(1000);
		System.out.println(BankAccount.accountCounter());
		BankAccount Person = new BankAccount("Person", 100.0, 200.0);
		Person.printAccountStatement();
		System.out.println(BankAccount.accountCounter());
		BankAccount.printTotalSum();
	}
}
