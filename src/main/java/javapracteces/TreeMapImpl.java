package javapracteces;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		TreeMap<Long, String> map = new TreeMap<Long, String>();
		map.put(377511121193l, "Sandesh");
		map.put(377511121194l, "Mayur");
		map.put(377511121195l, "Patil");
		map.put(377511121196l, "Rushi");
		//ewen single null key is not allow in tree map
		//map.put(null, null);
		map.put(377452272228l, null);
		map.put(377511121194l, "Sahane");
		map.put(377511121197l, "Sandesh");
		Set<Entry<Long, String>> set = map.entrySet();
		
		Iterator<Entry<Long,String>> it=set.iterator();
		
		while(it.hasNext())
		{
			Entry<Long,String> e=it.next();
			System.out.println(e.getKey()+ " : " +e.getValue());
		//	System.out.println(it.next());
		}
		
		//class cast exception
		

	}

}
