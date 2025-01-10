package lab7;

import java.util.Random;
public class ThreeDArrayOperations {

	public static void main(String[] args) {
		
		int x = 3, y = 3, z = 3; 
		int[][][] array = new int[x][y][z];
		Random random = new Random();
		
		System.out.println("3D Array:");
		for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
		for (int k = 0; k < z; k++) {
		array[i][j][k] = random.nextInt(100); 
		System.out.print(array[i][j][k] + " ");
		}
		System.out.println();
		 }
		System.out.println();
		}
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int count = 0;
		for (int[][] twoDArray : array) {
		for (int[] oneDArray : twoDArray) {
		for (int value : oneDArray) {
		if (value > max) {
		max = value;
		          }
		sum += value;
		 count++;
		 }
		 }
		 }
		 double average = (double) sum / count;
		 System.out.println("Maximum Value: " + max);
		 System.out.println("Average: " + average);
		 }
}
