package interfaceset;

import java.util.LinkedHashSet;

public class ExampleForLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("java");
		lhs.add("python");
		lhs.add("javascript");
		lhs.add("java");//duplicates are not allowed
		
		for(String subject : lhs)
		{
			System.out.println(subject);
		}

	}

}
