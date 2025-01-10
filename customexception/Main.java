package customexception;

import java.util.Scanner;

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
    }
}
public class Main {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        int balance = 5000;  
        
        System.out.println("Enter the money to withdraw:");
        int amount = s.nextInt();
        
        if (amount >= 1 && amount <= 2500 && amount <= balance) {  
            balance -= amount;  
            System.out.println("You successfully withdrew " + amount + " rupees.");
            System.out.println("Remaining balance: " + balance + " rupees.");
        } else {
            try {
                throw new InvalidAmountException("Insufficient Balance or Invalid Amount");
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        } 
	}
}
