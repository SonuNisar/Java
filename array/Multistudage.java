package array;
import java.util.Scanner;
public class Multistudage {

	public static void main(String[] args) {
		//one-dimensional array
		int age[] = new int[5];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<=4;i++)//i<=age.length-1;i++
		{
			System.out.println("Enter age  :" + i);
			age[i] = s.nextInt();
			
		}
		System.out.println("Enter age  :");
		age[0] = s.nextInt();
		

	}

}
