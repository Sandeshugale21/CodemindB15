package javapracteces;

public class Interface {

	public static void main(String[] args) {
		 MyImplClass myImplClass = new MyImplClass();
		//Myinterface myinterface = new MyImplClass();
		 
		 myImplClass.addition();
		 myImplClass.mul();
		 
		 
		 
	}

}

interface Myinterface {
	public static final int a = 30;
	int b = 40;

	public abstract void addition();

	void sub();

}

class MyImplClass implements Myinterface {

	@Override
	public void addition() {
		System.out.println(10 + 20);

	}

	@Override
	public void sub() {
		System.out.println(20 - 10);
	}

	public void mul() {
		System.out.println(10 * 3);
	}

}
