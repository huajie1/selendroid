package selendroid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;

public class ToastTest {
	public static void main(String[] args) throws Exception {
		// System.out.println( "Hello World!" );
		SelendroidCapabilities capa = new SelendroidCapabilities(
				"io.selendroid.testapp:0.15.0");
		WebDriver driver = new SelendroidDriver(capa);
		// WebElement inputField = driver.findElement(By.id("my_text_field"));
		WebElement displayToast = driver.findElement(By
				.xpath("//Button[@id='showToastButton']"));
		displayToast.click();
		waitForElement(By.partialLinkText("Hello selendroid toast!"), 3, driver);
		driver.quit();
	}

	public static WebElement waitForElement(By by, int timeout, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions
				.presenceOfElementLocated(by));
		return element;
	}

}
