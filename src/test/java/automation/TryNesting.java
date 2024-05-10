package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryNesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//driver
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//link
		driver.get("https://trytestingthis.netlify.app/");
        driver.manage().window().maximize();
        
        //name field
        WebElement firstName = driver.findElement(By.id("fname"));
        WebElement lastName = driver.findElement(By.id("lname"));
        firstName.sendKeys("Nafisa");
        lastName.sendKeys("Tabassum");
        
        //radio-button
        WebElement radiobutton = driver.findElement(By.id("female"));
        radiobutton.click();
        assert radiobutton.isSelected();
        System.out.println(radiobutton.isSelected());
        
        //drop-down
        WebElement test= driver.findElement(By.id("option"));
        Select dropdown= new Select(test);
        //dropdown.selectByIndex(2);
        //dropdown.selectByValue("option 3");
        dropdown.selectByVisibleText("Option 3");
     
        
        //Check-Box
        WebElement checkbox1= driver.findElement(By.name("option1"));
        checkbox1.click();
        WebElement checkbox2= driver.findElement(By.name("option2"));
        checkbox2.click();
        
        assert checkbox1.isSelected();
        assert checkbox2.isSelected();
        System.out.println(checkbox1.isSelected());
        System.out.println(checkbox2.isSelected());
        
        
        //file-upload
        WebElement picture= driver.findElement(By.id("myfile"));
        picture.sendKeys("C:\\Users\\HP\\Pictures\\Screenshots\\rnn.png");
        
        Thread.sleep(3000);
        
        //submit-button
        WebElement button= driver.findElement(By.className("btn-success"));
        button.click();
        
        

	}

}
