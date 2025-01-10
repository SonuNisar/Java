package exception;

public class ExampleforExceptionHandling {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter a String: ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("invalid Denominator");
		}
		catch(Exception e)
		{
			System.out.println("Superclass exception handler ");
		}
	}
}
