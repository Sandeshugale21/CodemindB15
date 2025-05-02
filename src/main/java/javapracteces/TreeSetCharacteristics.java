package javapracteces;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetCharacteristics {

	public static void main(String[] args) {
		TreeSet<Integer> l1= new TreeSet<Integer>();
		l1.add(10);
		l1.add(5);
		l1.add(40);
		l1.add(30);
		//l1.add(null);
		l1.add(100);
		
		Iterator<Integer> t=l1.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}

}
