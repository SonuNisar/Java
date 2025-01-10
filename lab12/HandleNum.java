package lab12;

import java.util.Scanner;

public class HandleNum {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number as a string: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid format. Please enter a valid integer string.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null input is not allowed.");
        } finally {
            scanner.close();
        }
        
	}

}
