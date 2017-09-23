package googletest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Googletest {
@Test
public void Googletest() throws IOException{
	WebDriver wd= new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.bing.com");
	WebElement input= wd.findElement(By.name("q"));
	input.sendKeys("abc");
	
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\seleniumworkspace\\Googletest\\Screenshot\\test.png"));
	wd.quit();
	
}

}
