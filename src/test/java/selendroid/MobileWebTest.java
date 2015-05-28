package selendroid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;

public class MobileWebTest {

	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities capa = SelendroidCapabilities.android();
		WebDriver driver = null;
		try {
			driver = new SelendroidDriver(capa);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.get("http://www.testerhome.com");
		driver.findElement(By.xpath("//a[text()='��¼']")).click();
		driver.findElement(By.xpath("//input[@id='user_login']")).clear();
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(
				"luguo_");
		driver.findElement(By.xpath("//input[@id='user_password']")).clear();
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(
				"limaohua071110");
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.className("dropdown")).click();// ��ʾ������
		WebElement exit = driver.findElement(By.xpath("//a[text()='�˳�']"));
		exit.click();
		driver.quit();
	}

}

