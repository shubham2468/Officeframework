import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstclass {

	@Test
	public void jmeterTest(){
		System.out.println("into");
	
	
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\workspace\\Training_PoaDevEnv\\Software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String value=driver.getWindowHandle();
		System.out.println(value);
		driver.get("http://demo.guru99.com/V4/index.php");
	    String title=driver.getTitle();
	    System.out.println(title);
	}

}
