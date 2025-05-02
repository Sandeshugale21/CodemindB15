																													package javapracteces;

import java.util.ArrayList;
import java.util.List;

public class ListCharacteristics {

	public static void main(String[] args) {
		
		
//		// Hetrogenous objects are allowed but we never used in realtime.
//		List l1 = new ArrayList();
//		
//		l1.add(10);
//		l1.add(20.0f);
//		l1.add("Sachin");
//		
//		
//		for(Object obj:l1) {
//			System.out.println(((String)obj).length());
//		}
		
		List<Integer> l1 = new ArrayList<Integer>();

		l1.add(10);
		l1.add(5);
		l1.add(100);
		l1.add(29);
		l1.add(null);
		
		for(Integer i :l1)
		{
			System.out.println(i);
		}
	}

}
