package javapracteces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet<Integer> l1 = new TreeSet<Integer>();

		// Appends the specified element to the end of this list

		l1.add(10);
		l1.add(20);
		l1.add(5);
		l1.add(100);
		l1.add(200);
		System.out.println(l1);

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(40);
		l2.add(50);

		

		l1.addAll(l2);
		System.out.println(l1);

		System.out.println("---------------------------------");
		// Reeturn the no of elememnts in this list

		System.out.println("Size of list :" + l1.size());
		System.out.println("---------------------------------");

	//	System.out.println("L1 contains l2: " + l1.contains(l2));
		System.out.println("L1 contains 50: " + l1.contains(50));
		System.out.println("L1 containsAll Element of l2: " + l1.containsAll(l2));
		System.out.println("---------------------------------");

		Set<String> l5 = new HashSet<>();
		l5.add("Sachin");
		l5.add("Saurav");
		l5.add("Hardik");
		l5.remove("Hardik");
		System.out.println("l5 Elements :" +l5);
		System.out.println("---------------------------------");

		System.out.println("L1 is empty : " + l1.isEmpty());
		System.out.println("---------------------------------");

		// remove element using index
		l1.remove(0);

		System.out.println(l1);

		System.out.println("---------------------------------");

		System.out.println(l1);

		ArrayList<Integer> l3 = new ArrayList<Integer>();

		l3.add(200);
		l3.add(100);
		l3.add(150);
		System.out.println();

		l1.removeAll(l3);
		System.out.println(l1);

		System.out.println("---------------------------------");

		

		System.out.println("---------------------------------");

		System.out.println(l1);

		System.out.println("Iterator---------------------------------");
		Iterator<Integer> it = l1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("---------------------------------");

		// Remove all of the element from list
		l1.clear();
		System.out.println(l1);


	}

}
