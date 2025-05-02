package javapracteces;

public class StringPrograms {

	public static void main(String[] args) {
		String s = "Welcome to codemind";

		// Reverse the given String.

		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.print(s.charAt(i));
		}
		System.out.println();

		// Split String
		String arr[] = s.split(" ");
		for (String ss : arr)

		/*
		 * { System.out.println(ss); }
		 */

		// Reverse Words From given String

		{
			for (int i = ss.length() - 1; i >= 0; i--) {

				System.out.print(ss.charAt(i));
			}
			System.out.print(" ");

		}
		System.out.println();

		String z = "1445GHjj^&*234";

		System.out.println(z.replaceAll("[0-9]", ""));// remove digits from string 0-9
		System.out.println(z.replaceAll("[A-Z]", ""));
		System.out.println(z.replaceAll("[a-z]", ""));
		System.out.println(z.replaceAll("[^0-9]", ""));// this symboll ^ is userd to Print only that thing
		System.out.println(z.replaceAll("[0-9a-zA-Z]", ""));
		// print only Digits
		// z.split("[^0-9]")

		// Character count
		String h = "Welcome to Pune";
		int count = 0;
		for (int i = 0; i < h.length(); i++) {
			if (h.charAt(i) == 'e') {
				count++;
			}

		}
		System.out.println("Count of e :" + count);

		int count1 = 0;
		String cnt = "";

		for (int i = 0; i < h.length(); i++) {
			if (! (cnt.contains(String.valueOf(h.charAt(i))))) {
				for (int j = i + 1; j < h.length(); j++) {
					if (h.charAt(i) == h.charAt(j)) {
						count1++;
					}
					// count1= h.charAt(i)+count1;
				}

				System.out.println(h.charAt(i) + "=" + count1);
				cnt = h.charAt(i) + cnt;

			}
		}
	}
}
