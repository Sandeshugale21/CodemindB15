package javapracteces;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome to codemind");
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder s = new StringBuilder("Welcome to codemind");
		s.reverse();
		System.out.println(s);

	}

}
