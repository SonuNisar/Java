package array;
import java.util.Scanner;

public class ExForTwoDimension {//three

	public static void main(String[] args) {
		
		int age[] [] [] = new int[2][2][5];
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<=age.length-1 ;i++)//clg
		{
			for(int j=0;j<=age[i].length-1 ;j++)//classroom
			{
				for(int k=0;k<=age[i][j].length-1 ;k++)
				{
					System.out.println("Enter age of student" + i+ "belongs to classroom "+j+"in college");
					age[i][j][k] = s.nextInt();
				}
			}
		}

	}

}
