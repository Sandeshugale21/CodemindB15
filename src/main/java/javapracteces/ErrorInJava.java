package javapracteces;

public class ErrorInJava {

	// StackOverFlow Error
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ErrorInJava().test();
	}

	
	public void test() {
		System.out.println(10+20);
		test();
	}
}
