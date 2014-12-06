import org.openqa.selenium.firefox.FirefoxDriver;


public class A
{
	static FirefoxDriver dr=new FirefoxDriver();

void m1()
{
	
	dr.get("http://www.facebook.com");
	System.out.println(dr.getTitle());
	if (dr.getTitle().equals("Welcome to Facebook - Log IN, Sign Up or Learn More"))

{
	System.out.println("true");
}
	else
	{
		System.out.println("false");
	}
	if(dr.getTitle().contains("Facebook"))
	{
		System.out.println("right");
	} 
	else
	{
		System.out.println("wrong");
	}
}

	
}
