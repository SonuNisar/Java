package collectionlist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();//we can't use this directly we have to import 1st
//add() is used to add an object into the collections		
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		//size () is used to return the length 
		System.out.println(al.size());
		
		System.out.println(al.get(1));
		
	}

}
