package javapracteces;

public class TestAbstract {

	public static void main(String[] args) {
		//Abs ab = new Abs(); we can not create object of abstract class
		TestAbs tb = new TestAbs();
		tb.testing();
		tb.test();
	//	tb.Abs();
		

	}

}

abstract class Abs {

	public Abs() {
		System.out.println("Constructor From Abstract Class");

	}

	public void testing() {

		System.out.println("No Abstract Method");
	}
	
	public abstract void test();
}


class TestAbs extends Abs{
	
	public TestAbs() {
		super();// 
		System.out.println("Chile class constructor");
	}
	public void test() {
		System.out.println("Implemenyed Metethod");
	}
	
	
}