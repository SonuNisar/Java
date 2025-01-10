package lab5;

import java.util.Scanner;

public class OddEvenCounter {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int evenCount = 0; 
	        int oddCount = 0;  
	     
	        while (true) {
	            
	            System.out.print("Enter a number Even Or Odd number (-1 to stop): ");
	           
	            int number = scanner.nextInt();
	          
	            if (number == -1) {
	                break;
	            }

	            if (number % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }
	        System.out.println("Total Even Numbers: " + evenCount);
	        System.out.println("Total Odd Numbers: " + oddCount);

	        System.out.println("Program terminated.");
	        scanner.close();

	}

}
