package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Example {

	public static void main(String[] args) throws FindFailed, InterruptedException {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		
		Screen sc=new Screen();
		Pattern ud=new Pattern("C:\\Users\\qaplanet\\Desktop\\ude.PNG");
		Pattern pd=new Pattern("C:\\Users\\qaplanet\\Desktop\\pde.PNG");
		Pattern log=new Pattern("C:\\Users\\qaplanet\\Desktop\\lge.PNG");
		sc.type(ud,"qaplanet1");
		
		sc.type(pd,"lab1");

	    sc.click(log);
	
		
	}

}
