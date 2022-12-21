package userstory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotAssignment {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(" https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void testcase1() {
		String title = driver.getTitle();
		System.out.println(title);
		boolean b = driver.findElement(By.xpath("//picture/img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
	}

	@Test(priority = 2)
	public void testcase2() {
		driver.findElement(By.xpath("//a[text()='About']")).click();
		TakesScreenshot s = (TakesScreenshot) driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./Screenshots/image1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@Test(priority = 3)
	public void testcase3() throws InterruptedException {
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Store']")).click();
		TakesScreenshot s = (TakesScreenshot) driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./Screenshots/img2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		String s1 = driver.getTitle();

		System.out.println(s1);
		Assert.assertTrue(s1.equalsIgnoreCase("Google Store for Google Made Devices & Accessories"));
		Thread.sleep(2000);
		driver.navigate().back();

	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}
