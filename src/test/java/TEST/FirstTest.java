package TEST;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class FirstTest {
	
	@Parameters(value= {"browserName","envName"})  
	@Test
	public void m1(String browser, String envName) {
		switch(browser) {
			case "chrome":
					System.out.println("Chrome selected as Browser");
					System.out.println("Env is: "+envName);

					break;
			case "ie":
				System.out.println("IE selected as Browser");
				System.out.println("Env is: "+envName);

				break;
			case "safari":
				System.out.println("Safari selected as Browser");
				System.out.println("Env is: "+envName);

				break;
		}

	}
	
	@Test
	public void m2() {
		System.out.println("First test m2");
	}

}
