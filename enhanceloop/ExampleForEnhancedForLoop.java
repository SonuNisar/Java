package enhanceloop;

public class ExampleForEnhancedForLoop {

	public static void main(String[] args) {
		
		int[] arr = { 10,20,30,40};
		
		System.out.println("using for loop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println ("----------");
		
		System.out.println("using for each loop");
	
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
	}

}
