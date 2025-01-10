package interfaceset;

import java.util.HashSet;

public class ExampleforHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		hs.add(20);
		hs.add(20.5);
		hs.add(null);
		
		System.out.println(hs);
		
		for(Object obj : hs)//using this to come 1 by1
		{
			System.out.println(obj);
			
		}
		
	}

}
