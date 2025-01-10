package maps;
import java.util.LinkedHashMap;
import java.util.Set;
public class TestExampleForLinkedMap {

	public static void main(String[] args) {
		
	LinkedHashMap lhm = new LinkedHashMap();
	
	lhm.put(10, "java");
	lhm.put(20, "sql");
	lhm.put(30, "web");
	
	Set<Integer> s = lhm.keySet();
	
	for(int key:s)
	{
		System.out.println(key);
	}
		

	}

}
