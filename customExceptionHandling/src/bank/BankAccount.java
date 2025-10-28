package bank;

import exceptions.InsufficientBalanceException;

public class BankAccount {
	
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance");
		} else {
			balance -= amount;
			System.out.println("Withdrawal successfull! Remaining balance : Rs "+balance);
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposite successful! New balance : Rs "+balance);
	}
	
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("Darshan Patil",5000);
		
		try {
			bankAccount.deposit(2000);
			bankAccount.withdraw(8000); //This will trigger custom exception
		} catch (InsufficientBalanceException e) {
			System.out.println("Exception caught : "+ e.getMessage());
		}
		System.out.println("Program continues normally...");
	}

}
