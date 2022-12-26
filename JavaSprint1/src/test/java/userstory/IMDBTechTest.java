package userstory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IMDBTechTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void testcase1() {
		WebElement ele = driver.findElement(By.xpath("//input[@id='suggestion-search']"));
		ele.sendKeys("Pushpa" + "\n");
		boolean b = driver.findElement(By.xpath("//a[@id='home_img_holder']")).isDisplayed();
		Assert.assertTrue(b);

		driver.findElement(By.xpath("//div[@class='ipc-metadata-list-summary-item__c']")).click();
	}

	@Test

	public void testcase2() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver
				.findElement(By.xpath("//div[@class='ipc-title__wrapper']//h3/span[text()='Details']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		WebElement ele = driver.findElement(By.xpath("//ul/li/a[text()='December 17, 2021 (United States)']"));
		System.out.println(ele.getText());
		Assert.assertEquals(ele.getText(), "December 17, 2021 (United States)");
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='India']"));
		System.out.println(ele1.getText());
		Assert.assertEquals(ele1.getText(), "India");
	}

	@Test
	public void testcase3() {
		driver.navigate().to("https://en.wikipedia.org/wiki/Wiki");
		String title = driver.getTitle();
		System.out.println(title);
		// Assert.assertEquals(false, null)

		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("pushpa" + "\n");
		driver.findElement(By.xpath("//a[@title='Pushpa: The Rise']")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement ele1 = driver
				.findElement(By.xpath("//*[@id='mw-content-text']/div[1]/table[1]/tbody/tr[12]/td/div/ul/li"));
		System.out.println(ele1.getText());

		// System.out.println(text);
		WebElement ele = driver
				.findElement(By.xpath("//table[@class='infobox vevent']/tbody/tr[14]/td[text()='India']"));
		System.out.println(ele.getText());
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
