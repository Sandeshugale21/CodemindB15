package javapracteces;

public class Inheritance {

	public static void main(String[] args) {
		FourWheelerVehical fourWheelerVehical = new FourWheelerVehical();
		System.out.println((fourWheelerVehical.color));
		fourWheelerVehical.run();
		System.out.println(fourWheelerVehical.TopSpeed);
		fourWheelerVehical.stop();
		
		
	}

}

class Vehical {
	// Properties
	String color = "White";
	String mfg = "Tata";

	// Behaviour
	public void run() {
		System.out.println("Running");
	}
}

class FourWheelerVehical extends Vehical {

	// Properties
	int TopSpeed=280;

	// Behaviour
	public void stop() {
		System.out.println("Stopping");
	}
}
