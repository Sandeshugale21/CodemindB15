package javapracteces;

public class StringClassMethods {

	public static void main(String[] args) {
		String s = "Welcome to codemind";

		System.out.println("Character at Specified index : " + s.charAt(5));

		System.out.println(s.concat(" technology"));

		System.out.println(s);

		System.out.println(s.compareTo("technology"));

		System.out.println(s.compareTo("Technology"));

		System.out.println(s.compareTo("Welcome to codemind"));

		System.out.println(s.compareToIgnoreCase("welcome to codeMind"));

		System.out.println(s.contains("code"));
		System.out.println(s.endsWith("mind"));
		System.out.println(s.equals("Pune"));
		System.out.println(s.equals("Welcome to codemind"));
		System.out.println(s.equalsIgnoreCase("Welcome to Codemind"));
		System.out.println(s.indexOf('t'));
		System.out.println(s.indexOf("codemind"));
		System.out.println("".isBlank());
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(s.lastIndexOf('o'));
		System.out.println(s.length());
		System.out.println(s.replace('o', 'O'));
		String ss = "12DGH$hjj";
		System.out.println(ss.replaceAll("[0-9]", ""));

		System.out.println(s.startsWith("Welcome"));
		
		System.out.println(s.substring(11));
		System.out.println(s.substring(0, 7));
		
		char arr[]= s.toCharArray();// convert string into array
		for(char c:arr) {
			System.out.print(c);
		}
		System.out.println();
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String sss ="     Welcome   to    codemind    ";
		System.out.println(sss.trim());
		
		int aa=10;
		String su=String.valueOf(aa);// valueof() method will convert any primitive datatype into string.
		System.out.println(su);
		boolean b = true;
		String t = String.valueOf(b);
		System.out.println(t.length()); 
		
		
		
		
		

	}

}