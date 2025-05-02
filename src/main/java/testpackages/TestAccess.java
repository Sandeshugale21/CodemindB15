package testpackages;
import javapracteces.GenericUtil;

//import javapracteces.MathUtils;
import javapracteces.TestPkg;
//import javapracteces.TestPkg;


//import javapracteces.*;

public class TestAccess {

	public static void main(String[] args) {
		javapracteces.GenericUtil genericUtil = new javapracteces.GenericUtil();
		genericUtil.printmsg();

		javapracteces.MathUtils mathUtils = new javapracteces.MathUtils();
		System.out.println(mathUtils.add(10, 20));
		TestPkg tp = new TestPkg();
		tp.test();
		
	
		 

	}

}
