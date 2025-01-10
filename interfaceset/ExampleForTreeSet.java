package interfaceset;
import java.util.TreeSet;
public class ExampleForTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(10);
		
		
		System.out.println(t);
		for(int i:t)
		{
			System.out.println(i);
		}
		
	}

}
