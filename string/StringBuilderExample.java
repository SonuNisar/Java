package string;

import java.util.Scanner;

public class StringBuilderExample {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter a String: ");
		
		String userinput = s.next();
		
		while(!userinput.equalsIgnoreCase("exit")) {
			sb.append(userinput).append("\n");
			
			System.out.println("Enter a another String: ");
			
			 userinput = s.next();
		}
			String result = sb.toString();
			System.out.println("concatenated String: ");
			System.out.println(result);


	}

}
