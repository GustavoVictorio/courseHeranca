package application;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BussinesAccount bacc = new BussinesAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BussinesAccount(1003, "Bob", 0.0, 20.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING
		
		BussinesAccount acc4 = (BussinesAccount)acc2;
		acc4.loan(100.0);
		
		//BussinesAccount acc5 = (BussinesAccount)acc3;
		if(acc3 instanceof BussinesAccount) {
			BussinesAccount acc5 = (BussinesAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.upadateBalance();
			System.out.println("Update!");
		}
	}

}
