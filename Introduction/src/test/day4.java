package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day4 {

	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
		System.out.println("N1");
		System.out.println("N2");
		System.out.println("N3");
		
		System.out.println("N4");
		System.out.println("N5");
		System.out.println("N6");
	
	}
	
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APIloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan1()
	{
		//Rest API automation
		System.out.println("APIloginHome");
	}
}
