package lab5;
import java.util.Scanner;
public class ArmstrongNumber {
	
	 public static void printArmstrongNumber(int start, int end) {
		 
	        for (int num = start; num <= end; num++) {
	            int originalNum = num;
	            int sum = 0; 
	          
	            while (num > 0) {
	                int digit = num % 10; 
	                sum += digit * digit * digit; 
	                num /= 10;
	            }
	            
	            if (sum == originalNum) {
	                System.out.println(originalNum + " is an Armstrong number.");
	            }
	            
	            num = originalNum;   }
	    }
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the starting number of the range: ");
	        int start = scanner.nextInt();
	        
	        System.out.print("Enter the ending number of the range: ");
	        int end = scanner.nextInt();
	         printArmstrongNumber(start, end);
	        
	        scanner.close();

	}

}


