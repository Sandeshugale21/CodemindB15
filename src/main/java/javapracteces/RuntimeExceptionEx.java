package javapracteces;

public class RuntimeExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimeExceptionEx runtimeExceptionEx = new RuntimeExceptionEx();
		System.out.println("division = " +runtimeExceptionEx.div(100, 10));
		//System.out.println("division = " +runtimeExceptionEx.div(100, 0));
		runtimeExceptionEx.Stringlenght("Welcome to Pune");
		//runtimeExceptionEx.Stringlenght(null);
		
		int n=runtimeExceptionEx.convertStringToNumber("10");
		System.out.println("Squre of n = "+n*n);
		//runtimeExceptionEx.convertStringToNumber("12we");
		
		System.out.println(runtimeExceptionEx.getCharacter("Sandesh", 4));
		//System.out.println(runtimeExceptionEx.getCharacter("Sandesh", 9));
		
		System.out.println("Sring from index :" + 	runtimeExceptionEx.getStringFromIndex(2));
		//System.out.println("Sring from index :" + 	runtimeExceptionEx.getStringFromIndex(4));
	

	}

	public int div(int a, int b) {
		return a / b;
	}
	
	public void Stringlenght(String s) {
		System.out.println("String length : " +s.length());
	}
	
	public int convertStringToNumber(String numericString) {
		return Integer.parseInt(numericString);
	}
	
	public char getCharacter(String s, int index) {
		return s.charAt(index);
	}
	
	public String getStringFromIndex(int index) {
		String arr[]= {"Sandesh","Shubham","Mayur"};
		return arr[index];
		}
}


