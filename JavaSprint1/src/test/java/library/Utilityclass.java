package library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilityclass {
	WebDriver driver;
	// TestUtil testutil = new TestUtil();

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void testcase1() {
		WebElement ele = driver.findElement(By.xpath("//div[@class='thumbnail']/div/select[2]"));

		TestUtil.clickonWebElement(ele);
		TestUtil.selectbyindex(ele, 2);
	}

	@Test

	public void testcase2() {
		WebElement ele = driver.findElement(By.xpath("//div[@class='thumbnail']/div/select[1]"));
		TestUtil.clickonWebElement(ele);
		TestUtil.selectbyvalue(ele, "sql");

	}

	@Test

	public void testcase3() {
		WebElement ele = driver.findElement(By.xpath("//div[@class='thumbnail']/div/select[3]"));
		TestUtil.clickonWebElement(ele);
		TestUtil.selectbyvisibletext(ele, "JavaScript");

	}

	@Test

	public void testcase4() {
		WebElement ele = driver.findElement(By.xpath("//input[@value='option-3']"));
		TestUtil.isenable(ele);
		// TestUtil.clickonWebElement(ele);

	}

	@Test
	public void testcase5() {
		WebElement ele = driver.findElement(By.xpath("//input[@value='yellow']"));
		// TestUtil.isEnable(ele);
		TestUtil.clickonWebElement(ele);

	}

	@Test
	public void testcase6() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//input[@value='lettuce']"));

		TestUtil.clickonWebElement(ele);

	}

	@Test
	public void testcase7() {
		WebElement ele = driver.findElement(By.xpath("//select[@id='fruit-selects']"));
		TestUtil.selectbyvisibletext(ele, "Pear");

	}

	@AfterTest
	public void Teardown() {
		driver.close();
	}

}
