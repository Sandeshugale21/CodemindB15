package javapracteces;

public class TryKeyword {

	public static void main(String[] args) {
		
		TryKeyword tryKeyword = new TryKeyword();
		tryKeyword.div(100, 0);
		

	}
	
	
	public int div(int a, int b) {
		int result =0;
		try {
		result = a/b;
		} catch (NullPointerException e) {
			System.out.println("Arithmatic Please do not try to devide by zero");
		}catch (RuntimeException e) {
			System.out.println("Runtime Please do not try to devide by zero");	
		}
		System.out.println("Result :" +result);
		return result;
	}
	
	public int add(int a, int b) {
		int result = a+b;
		System.out.println("Result :" + result);
		return result;
	}

}
