package userstory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableAssignment {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumtableassignment.s3-website-us-west-2.amazonaws.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public boolean bearTable() {
		List<WebElement> list = driver
				.findElements(By.xpath("//table[@class='adap-table'][1]//th[2]//following::tbody[1]//td[1]"));
		int rowSize = list.size();
		System.out.println(rowSize);
		for (WebElement element : list) {
			System.out.println(element.getText());
		}
		List<WebElement> list1 = driver
				.findElements(By.xpath("//table[@class='adap-table'][1]//th[2]//following::tbody[1]//td[2]"));
		int columnsize = list.size();
		System.out.println(columnsize);
		for (WebElement element1 : list1) {
			System.out.println(element1.getText());
			if (!element1.getText().equals("Black")) {
				System.out.println("inside not black" + element1.getText());
				return false;
			}
		}
		return true;
	}

	@Test(priority = 1)
	public void testcase2() throws InterruptedException {
		Assert.assertEquals(bearTable(), true);
	}

	@Test(priority = 2)
	public void CatsTable() throws IOException {
		List<WebElement> list2 = driver
				.findElements(By.xpath("//table[@class='adap-table'][2]//th[2]//following::tbody[1]//td[1]"));
		int rowSize1 = list2.size();
		System.out.println(rowSize1);

		for (WebElement element2 : list2) {
			System.out.println(element2.getText());
		}
		try {
			List<WebElement> list3 = driver
					.findElements(By.xpath("//table[@class='adap-table'][2]//th[2]//following::tbody[1]//td[3]"));
			// List<WebElement> list1 =
			// driver.findElements(By.xpath("//table[@class='adap-table'][1]//th[2]"));
			int columnsize1 = list3.size();
			System.out.println(columnsize1);
			for (WebElement element3 : list3) {
				System.out.println(element3.getText());
				String s = element3.getText();
				s = s.replace(" lbs.", "");
				// System.out.println(s.replace("lbs.", ""));
				System.out.println(s);
				int digit1 = Integer.parseInt(s.trim());
				System.out.println(digit1);
				Assert.assertTrue(digit1 < 15);
			}
		} catch (AssertionError e) {
			TakesScreenshot s = (TakesScreenshot) driver;
			File source = s.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/image1.png"));

			// driver.quit();

		}
	}

	@Test(priority = 4)
	public boolean starWarTable() {
		List<WebElement> list4 = driver
				.findElements(By.xpath("//table[@class='adap-table'][3]//th[1]//following::tbody[1]//td[1]"));
		int rowsize4 = list4.size();
		System.out.println(rowsize4);
		for (WebElement element4 : list4) {
			System.out.println(element4.getText());
			List<WebElement> list5 = driver
					.findElements(By.xpath("//table[@class='adap-table'][3]//th[1]//following::tbody[1]//td[2]"));
			int column5 = list5.size();
			System.out.println(column5);
			for (WebElement element5 : list5) {
				System.out.println(element5.getText());
				String s1 = element5.getText();
				int s2 = s1.length();
				System.out.println("number of characters in given string " + s2);
				if (s2 < 350) {
					return true;

				}

			}
		}
		return true;
	}

	@Test(priority = 5)
	public void testcase() {
		Assert.assertEquals(starWarTable(), false);

	}
}
