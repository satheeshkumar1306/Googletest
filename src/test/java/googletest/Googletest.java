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
	wd.get("https://www.google.com");
	WebElement input= wd.findElement(By.id("html//body//div[1]//div[3]//form//div[2]//div[2]//div[1]//div[1]//div[2]//div//div//div[2]//div//input[3]"));
	input.sendKeys("abc");
	
	File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\seleniumworkspace\\Googletest\\Screenshot\\test.jpg"));
	
}

}
