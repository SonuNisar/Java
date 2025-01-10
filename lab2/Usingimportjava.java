package lab2;
import java.util.Scanner;

class Calculator1 {
	
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
public class Usingimportjava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Calculator1 calc = new Calculator1();

        System.out.println("Enter two integers to add:");
        System.out.print("First integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Second integer: ");
        int int2 = scanner.nextInt();
        int sum1 = calc.add(int1, int2);
        System.out.println("Sum of two integers: " + sum1);

        System.out.println("\nEnter three integers to add:");
        System.out.print("First integer: ");
        int int3 = scanner.nextInt();
        System.out.print("Second integer: ");
        int int4 = scanner.nextInt();
        System.out.print("Third integer: ");
        int int5 = scanner.nextInt();
        int sum2 = calc.add(int3, int4, int5);
        System.out.println("Sum of three integers: " + sum2);

        System.out.println("\nEnter two decimal numbers to add:");
        System.out.print("First decimal: ");
        double double1 = scanner.nextDouble();
        System.out.print("Second decimal: ");
        double double2 = scanner.nextDouble();
        double sum3 = calc.add(double1, double2);
        System.out.println("Sum of two decimals: " + sum3);

        scanner.close();

	}

}
