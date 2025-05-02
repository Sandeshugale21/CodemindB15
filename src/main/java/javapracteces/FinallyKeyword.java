package javapracteces;

public class FinallyKeyword {

	public static void main(String[] args) {
		FinallyKeyword finallyKeyword = new FinallyKeyword();
		char c = finallyKeyword.getCharFromIndex("Welcome", 9);
		System.out.println("character :" + c);
	}

	public char getCharFromIndex(String s, int index) {
		char c=0;
		try {
		 c = s.charAt(index);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Please provide valid input");
		}catch (Exception e) {
			
		}finally {
			System.out.println("Finally block always executed");
		}
		return c;
	}

}
