package sikuli_proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_2
{

	public static void main(String[] args) throws FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\JAVA-eclipse\\Selenium work\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://newtours.demoaut.com/");
		d.manage().window().maximize();
		Screen screen=new Screen();
		Pattern un=new Pattern("D:\\JAVA-eclipse\\sikuliimage\\newtours1.png");
				Pattern pw=new Pattern("D:\\JAVA-eclipse\\sikuliimage\\newtours2.png");
				Pattern SignIN=new Pattern("D:\\JAVA-eclipse\\sikuliimage\\newtours3.png");
				screen.wait(10);
				screen.type(un,"nitinpawar503");
				screen.wait(un,10);
				screen.type(pw,"nitin9950");
				screen.wait(pw,10);
				screen.click(SignIN);
				d.close();
		
		
		
		
		
		
	}
	
}
