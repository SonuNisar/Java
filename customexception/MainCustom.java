package customexception;

class InsufficientBalanceException extends Exception {
	
	 public InsufficientBalanceException(String message) {
	     super(message);
	 }
	}

class BankAccount {
	 private String accountHolder;
	 private double balance;

	 public BankAccount(String accountHolder, double balance) {
	     this.accountHolder = accountHolder;
	     this.balance = balance;
	 }
public void deposit(double amount) {
	   if (amount > 0) {
	       balance += amount;
	       System.out.println("Deposited: " + amount + "  New balance: " + balance);
	     } else {
	         System.out.println("Deposit amount must be positive.");
	     }
	 }
	 public void withdraw(double amount) throws InsufficientBalanceException {
	     if (amount > balance) {
	       throw new InsufficientBalanceException("Withdrawal of " + amount + " cannot be processed due to insufficient Balance.");
	     } else if (amount > 0) {
	         balance -= amount;
	         System.out.println("Withdrew: " + amount + " New balance: " + balance);
	     } else {
	         System.out.println("Withdrawal amount must be positive.");
	     }
	 }
	 public double getBalance() {
	     return balance;
	 }
	}
public class MainCustom {

public static void main(String[] args) {
		
	try {
			 
	      BankAccount account = new BankAccount("sonu", 1000);
	       account.deposit(1000);

	       account.withdraw(2000);  
	         
	     } catch (InsufficientBalanceException e) {
	         System.out.println(e.getMessage());
	     }

	}

}
