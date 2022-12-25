package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestUtil {

	WebDriver driver;

	public static void clickonWebElement(WebElement ele) {
		ele.click();

	}

	public static void selectbyindex(WebElement ele, int value) {
		Select s = new Select(ele);
		// ele.getText();
		s.selectByIndex(value);

	}

	public static void selectbyvalue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);

	}

	public static void selectbyvisibletext(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);

	}

	public static void diselectElement(WebElement ele, String text) {
		Select s = new Select(ele);
		s.deselectByVisibleText(text);

	}

	public static void isenable(WebElement ele) {
		ele.isEnabled();
	}

	public static void isSelect(WebElement ele) {
		ele.isSelected();

	}

}
