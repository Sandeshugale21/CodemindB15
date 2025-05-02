package javapracteces;

public final class FinalUse {
	// We your class is final We can not create its Child class.
	//If you doesnt want to inheritate your class to anyone that time you can create final class.

	// final Veriable
	public static final String PAN;

	static {
		PAN = "ALNPU1146M";
	}
	// final Veriable
	final long accNo = 12345688l;

	final long addhar = 377511121193l;

	public static void main(String[] args) {

	}

	public final void testFinalMethod() {
		System.out.println("Final Method");
	}

}

/*class TestFinal extends FinalUse {

	// public final void testFinalMethod() We can not Override Final Method but
	
	public final void testFinalMethod(int a) {
		// We can Overload final Method
}
}*/