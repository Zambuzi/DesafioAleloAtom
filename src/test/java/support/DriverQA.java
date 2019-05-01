package support;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverQA {
	private static WebDriver driver;
	
	public static void start(String endereco) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(endereco);
		driver.manage().window().maximize();
	}
	
	public static WebElement findElement(String campo, String tipo) {

		WebElement element;

		if (tipo.equals("xpath")) {
			element = driver.findElement(By.xpath(campo));
		} else if (tipo.equals("id")) {
			element = driver.findElement(By.id(campo));
		} else if (tipo.equals("css")) {
			element = driver.findElement(By.cssSelector(campo));
		} else if (tipo.equals("name")) {
			element = driver.findElement(By.name(campo));
		} else {
			element = null;
		}

		return element;

	}
	
	public static void click(String campo, String tipo) {

		findElement(campo, tipo).click();
	}
	
	public static String getText(String campo, String tipo) {
		return findElement(campo, tipo).getText();
	}
	
	public static void sendKeys(String texto, String campo, String tipo) {
		findElement(campo, tipo).clear();
		findElement(campo, tipo).sendKeys(texto);

	}
	
	public static void teclaEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void waitElement(String campo, String tipo) {
		WebDriverWait driverWait = new WebDriverWait(driver, 15);

		if (tipo.equals("xpath")) {
			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(campo)));
		} else if (tipo.equals("id")) {
			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(campo)));
		} else if (tipo.equals("css")) {
			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(campo)));
		} else if (tipo.equals("name")) {
			driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(campo)));
		}

	}
	
	public static void close() {
		driver.close();
	}
}
