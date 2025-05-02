package javapracteces;

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		SuperKeyword sup = new SuperKeyword();
		new Bchild().bChild();
		

	}

}

class Aparent{
	int a=10;
	public Aparent() {
		System.out.println("Parent class constructor");
	}
	public Aparent(	int a) {
		System.out.println("Parent class parameterized constructor");
	}
	public void aParent() {
		
	}
	
}

class Bchild extends Aparent{
	
	int a=30;
	
	public Bchild() {
		super(10);
	}
	public void bChild() {
		System.out.println(super.a+a);
		
	}
	
}