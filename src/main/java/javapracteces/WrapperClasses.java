package javapracteces;

import com.sun.source.tree.InstanceOfTree;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WrapperClasses().integerDemo();
	}
	public void integerDemo() {
		int a = 10;
		Integer b = Integer.valueOf(a);
		System.out.println(b instanceof Integer);//un-boxing Wrapper to Primitive
	}

}
