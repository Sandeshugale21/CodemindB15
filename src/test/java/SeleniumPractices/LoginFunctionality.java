package SeleniumPractices;

import org.testng.annotations.Test;

public class LoginFunctionality {

	@Test(priority =1, groups= {"smoke"})
	public void verifyPageTitle() {
		System.out.println("Test A executed");
		
	}
	
	@Test(priority =1, groups= {"sanity"})
	public void verifyPageUrl() {
		System.out.println("Test B executed");
	
	}
	
	@Test(priority =1, groups= {"regression"})
	public void verifyMoneyTransfer() {
		System.out.println("Test C executed");
		
	}
	
	@Test(priority =1, groups= {"regression","sanity"})
	public void verifyMoneyTransferToOwnAccount() {
		System.out.println("Test C executed");
		
	}
}
