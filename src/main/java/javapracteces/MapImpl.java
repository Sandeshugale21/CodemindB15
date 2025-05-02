package javapracteces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(377511121193l, "Sandesh");
		map.put(377511121194l, "Mayur");
		map.put(377511121195l, "Patil");
		map.put(377511121196l, "Rushi");
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
		
		
	}

}
