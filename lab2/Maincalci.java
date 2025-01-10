package lab2;

class Calculator {
   
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

	public class Maincalci {

	public static void main(String[] args) {
		
		        Calculator calculator = new Calculator();

		        int sum1 = calculator.add(30, 10);
		        int sum2 = calculator.add(6, 16, 40);
		        double sum3 = calculator.add(15.5, 6.3);

		        System.out.println("Sum of two integers: " + sum1);
		        System.out.println("Sum of three integers: " + sum2);
		        System.out.println("Sum of two doubles: " + sum3);
		    }
		}
	
