package maps;
import java.util.HashMap;

public class ExampleForHashMap {

	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		//put() is used to add key and value inside map
		h.put(10,"sonu");
		h.put(44.3,"nihi");
		h.put(2.2,2000);
		
		System.out.println(h);
		
		System.out.println("---------");
		//get() is used to get the value based on the key  specified
		System.out.println(h.get(10));
		
		System.out.println("------");
		//containskey is used to check if the key is present or not
		System.out.println(h.containsKey("sonu"));
	
		
		h.remove(h);
		System.out.println(h);
	
	}

}
