package javapracteces;

public class StringPractices {

	public static void main(String[] args) {
		//Create string using new Keywords
		String s = new String("Sachin");
		System.out.println(s);
		
		//Create String using String literals
		String ss = "Sandesh";
		System.out.println(ss);
		String sss = "Sandesh";
		 System.out.println(ss.hashCode());
		 System.out.println(sss.hashCode());
		 
		 String h = "Hardik";
		 //h=h.concat(" Pandya");
		 h=h+" Pandya";
		 String hh = h.concat(" Pandya");
		// h.concat("  Pandya");//Hardik Pandya 
		 System.out.println(h); // It will Prrint only Hardik because String is "imutable"(Not Changable)
			
		// System.out.println(hh);
	}

}
