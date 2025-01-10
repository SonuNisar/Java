package array;

public class CollegeStudents {

	public static void main(String[] args) {
		        
		        int[][][] colleges = {
		            {
		                {10, 15, 20},
		                {12, 18}     
		            },
		            { // College 2
		                {25, 30},      // Classroom 1
		                {20, 24, 28},  // Classroom 2
		                {18, 19, 21}   // Classroom 3
		            }
		        };

		        // Display the number of students in each college and classroom
		        for (int college = 0; college < colleges.length; college++) {
		            System.out.println("College " + (college + 1) + ":");
		            for (int classroom = 0; classroom < colleges[college].length; classroom++) {
		                System.out.print("  Classroom " + (classroom + 1) + ": ");
		                for (int student : colleges[college][classroom]) {
		                    System.out.print(student + " ");
		                }
		                System.out.println();
		            }
		            System.out.println();
		        }
	}

}
