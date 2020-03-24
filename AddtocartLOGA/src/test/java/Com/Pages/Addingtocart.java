package Com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Addingtocart {
WebDriver driver;
By item_loc = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
By Addtocart_loc = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span");
By signin = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
By Username = By.xpath("//*[@id=\"email\"]");
By Password = By.xpath("//*[@id=\"passwd\"]");
By Click_signin = By.xpath("//*[@id=\"SubmitLogin\"]/span");
By women = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
By tshirt = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");

public void Launch_URL() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selinium jars\\Crome driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php");
	
}
public void login()
{
	driver.findElement(signin).click();
	driver.findElement(Username).sendKeys("mattasirimounica.selenium@gmail.com");
	driver.findElement(Password).sendKeys("abc@123");
	driver.findElement(Click_signin).click();
}
public void mouseactions()
{
	
	WebElement a1= driver.findElement(women);
	WebElement a2=driver.findElement(tshirt);
	Actions act = new Actions(driver);
	act.moveToElement(a1);
	act.moveToElement(a2).click().build().perform();
	
}
public void Select_item()
{
	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,600)");
	WebElement item = driver.findElement(item_loc);
	WebElement Addcart = driver.findElement(Addtocart_loc);
	Actions act = new Actions(driver);
	act.moveToElement(item);
	act.moveToElement(Addcart).click().build().perform();
}
public void Click_Addtocart() throws IOException
{
	TakesScreenshot t = (TakesScreenshot)driver;
	File f = t.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("D:\\Selenium\\eclipse\\AddtocartLOGA\\Screenshots\\Addtocart.png"));
}


}
