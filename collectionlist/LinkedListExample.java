package collectionlist;
import java.util.List;
import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ll = new LinkedList();
		ll.add(10);
		ll.add("java");
		ll.add(45.5);
		
		System.out.println(ll);
		
		for(int i = 0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println(ll.size());
		ll.add(1,50);
		System.out.println(ll);
		ll.set(2, 70);
		System.out.println(ll);

	}

}
