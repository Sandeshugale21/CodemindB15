package javapracteces;

public class MethodOverriding {

	public static void main(String[] args) {
		TwoWheelerVehical2 twoWheelerVehical = new TwoWheelerVehical2();
		twoWheelerVehical.changeGear();
		
		vehical2 v = new vehical2();
		v.changeGear();
		v.changeGear();
	}
}
	
class vehical2{
	
	public void changeGear() 
	{
		System.out.println("Change four Wheeler vehical gear");
	}
}

class TwoWheelerVehical2 extends vehical2 {
	public void changeGear()
	{
		System.out.println("Change Two Wheeler Gear");
	}
	
}
