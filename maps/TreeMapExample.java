package maps;
import java.util.TreeMap;
import java.util.Set;
public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer,Double> t = new TreeMap();
		
		t.put(20, 12.5);
		t.put(30, 25.6);
		t.put(10, 4.5);
		
		Set<Integer> s = t.keySet();
		for(int key : s)
		{
			System.out.println(key + " : " + t.get(key));
		}
		
		
		
	}

}
