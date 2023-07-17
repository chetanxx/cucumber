package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static WebDriver driver;
	public static By loginpage_xpath = By.xpath("//h5[text()='Login']");
	public static By Username_xpath = By.xpath("//input[@name='username']");
	public static By Password_xpath = By.xpath("//input[@name='password']");
	public static By Loginbutton_xpath = By.xpath("//button[text()=' Login ']");
	public static By Homepage = By.xpath("//img[@alt='client brand banner']");
	public static By IuserVpass_xpath = By.xpath("//p[text()='Invalid credentials']");
	public static By NullUserVPass_xpath = By.xpath("//span[text()='Required']");

	public static WebElement loginpage() {
		WebElement loginpage = driver.findElement(loginpage_xpath);
		return loginpage;
	}

	public static WebElement username() {
		WebElement username = driver.findElement(Username_xpath);
		return username;
	}

	public static WebElement Password() {
		WebElement password = driver.findElement(Password_xpath);
		return password;
	}

	public static WebElement loginbutton() {
		WebElement loginbutton = driver.findElement(Loginbutton_xpath);
		return loginbutton;
	}

	public static WebElement IuserVpass() {
		WebElement IuserVpass = driver.findElement(IuserVpass_xpath);
		return IuserVpass;
	}

	public static WebElement Homepage() {
		WebElement homepage = driver.findElement(Homepage);
		return homepage;
	}

	public static WebElement NullUserVPass() {
		WebElement NullUserVPass =driver.findElement(NullUserVPass_xpath);
		return NullUserVPass;
	}

	public static void usernamekeys(String username) {
		username().click();
		username().sendKeys(username);
	}

	public static void passwordkeys(String password) {
		Password().click();
		Password().sendKeys(password);
	}

	public static void loginbuttonkeys() {
		loginbutton().click();
	}

}
