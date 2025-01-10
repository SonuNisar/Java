package lab5;

import java.util.Scanner;

public class GrossSalaryCaculator {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 while (true) {
	      System.out.print("Enter the basic salary of the employee: ");
		  double basicSalary = scanner.nextDouble();
		  double HRA, DA, grossSalary;

		   if (basicSalary > 15000) 
		   {
		        HRA = 0.20 * basicSalary; 
		          DA = 0.60 * basicSalary;  
		        } else {
		        		HRA = 3000;              
		                DA = 0.70 * basicSalary;  
		            }

		            grossSalary = basicSalary + HRA + DA;

		            System.out.println("Gross Salary of the employee: " + grossSalary);

		            System.out.print("Enter -1 to calculate another employee's salary or any other number to exit: ");
		            int choice = scanner.nextInt();

		            if (choice != -1) {
		                break;
		            }
		        }

		        System.out.println("Program terminated.");
		        scanner.close();
		    }
		}
