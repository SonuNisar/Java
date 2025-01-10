package interface1;
 interface Calculator0
 {
	 void add();
	 void sub();
	 
 }
 class MyCalculator5 implements Calculator0
 {
	 public void add()
	 {
		 int num1 = 20;
		 int num2 = 30;
		 int result = num1+ num2;
		 System.out.println(result);
	 }
	 public void sub()
	 {
		 int num1 = 20;
		 int num2 = 30;
		 int result = num1-num2;
		 System.out.println(result);
	 }
	 public void mul() //specialized method
	 {
		 int num1 = 20;
		 int num2 = 30;
		 int result = num1 * num2;
		 System.out.println(result);
	 }
 }
public class Exampleofint {

	public static void main(String[] args) {
		
		MyCalculator5 mc = new MyCalculator5();
		Calculator0 ref;
		
		ref = mc;
		ref.add();
		ref.sub();
//ref.mul();// specialized method cannot be access using interface refrence
((MyCalculator5)(ref)).mul();
	
	}
}
