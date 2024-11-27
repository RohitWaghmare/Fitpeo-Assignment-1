package javapackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fitpeo {
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Software\\eclipse\\Updated chrome driver\\chromedriver-win64\\chromedriver.exe");
	    
		//Initializing chrome driver
		WebDriver driver = new ChromeDriver();
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     
	     //Opening web url
	     driver.get("https://www.fitpeo.com/");
	     
	     //Maximize web browser.
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);	     
	     
	     //navigating to the url
	     driver.navigate().to(("https://fitpeo.com/revenue-calculator"));
	     Thread.sleep(2000);
	     
	     //Scroll down
	     js.executeScript("window.scrollBy(0,400)");
	     Thread.sleep(2000);
	     
	     //select sliders xpath
	     WebElement slider = driver.findElement(By.xpath("//div[@class = \"MuiBox-root css-j7qwjs\"]/span[1]/span[3]"));
	     Thread.sleep(2000);
	     Actions actions = new Actions(driver);
	     
	     //moving slider at respective position value 820
	     actions.clickAndHold(slider).moveByOffset(94, 35).release().perform();
	    // slider.click();
	     Thread.sleep(2000);
	     
	     //identify web element textfield 
	     WebElement txt = driver.findElement(By.id(":R57alklff9da:"));
	     txt.sendKeys(Keys.CONTROL + "a");
	     txt.sendKeys(Keys.DELETE);
	     
	   //Entering value 560 in textfield
	     txt.sendKeys("560");
	     Thread.sleep(2000);
	     js.executeScript("window.scrollBy(0,400)");
	     Thread.sleep(2000);
	     
	     //select checkbox for CPT-99091
	     driver.findElement(By.xpath("//div[@class = \"MuiBox-root css-1p19z09\"]/div[1]/label")).click();
	     Thread.sleep(2000);
	     
	     //select checkbox for CPT-99453
	     driver.findElement(By.xpath("//div[@class = \"MuiBox-root css-1eynrej\"][2]/label")).click();
	     Thread.sleep(2000);
	     
	     //select checkbox for CPT-99454
	     driver.findElement(By.xpath("//div[@class = \"MuiBox-root css-1eynrej\"][3]/label")).click();
	     Thread.sleep(2000);
	     
	     //select checkbox for CPT-99474
	     driver.findElement(By.xpath("//div[@class = \"MuiBox-root css-1eynrej\"][8]/label")).click();
	     Thread.sleep(5000);
	     
	     //After selecting above checkboxes it showing Total Recurring Reimbursement for all Patients Per Month: $75600
	     driver.close();

    }
}	
