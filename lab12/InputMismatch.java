package lab12;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatch {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        try {
		            int number = scanner.nextInt();
		            System.out.println("You entered: " + number);
		        } catch (InputMismatchException e) {
		            System.out.println("Error: Please enter a valid integer.");
		        } finally {
		            scanner.close();
		        }
	}
}

