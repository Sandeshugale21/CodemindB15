package javapracteces;

public class ThisUse_1 {
	
	int a=10;
	static int c=20;
	
	public ThisUse_1() {
		System.out.println("This id default constructor");
	}
	public ThisUse_1(int a) {
		this();
		System.out.println(a+c);
		System.out.println("One Parameter Default constructor");
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisUse_1 thisUse_1 =new ThisUse_1();
		System.out.println(thisUse_1.hashCode());
		thisUse_1.add();
		
		System.out.println("***********************************************");
		new ThisUse_1(10);

	}
	
	public void add() {
		System.out.println(10+20);
		System.out.println(this.hashCode());
		this.div(); // div(); both are same.
	}
	public void div() {
		System.out.println(10/2);
	}

}
