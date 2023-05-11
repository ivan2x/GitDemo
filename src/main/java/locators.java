import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class locators {
    public static void main(String[] args) {
        try {
            String key = "webdriver.chrome.driver";
            String name = "rahul";
            // ChromeDARIVER.EXE -> Chrome browser
            System.setProperty(key, "/home/ivan/Documents/Browsers/chromedriver_linux64/chromedriver");
            WebDriver driver = new ChromeDriver();
            //implicit wait - 2 secods timeout
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waiting to objects to show on the page globally
            //enter to the url
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.id("inputUsername")).sendKeys("ivan");
            driver.findElement(By.name("inputPassword")).sendKeys("hello123");
            driver.findElement(By.className("signInBtn")).click();
            //Time issue
            System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
            driver.findElement(By.linkText("Forgot your password?")).click();
            Thread.sleep(1000); //pause script for 1 second
            // //Tagname[@atribute='value']
            driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("adrian");
            driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("adrian@arroyo.com");
            driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
            driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("adr@rha.com");
            // parentTagname/childTagname
            driver.findElement(By.xpath("//form/input[3]")).sendKeys("9948494");
            // in the case there is one classname
            driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
            System.out.println(driver.findElement(By.cssSelector("form p")).getText());
            driver.findElement(By.className("forgot-pwd-btn-conainer")).click();
            driver.findElement(By.className("go-to-login-btn")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
            driver.findElement(By.cssSelector("input[type*='pass")).sendKeys("rahulshettyacademy");
            driver.findElement(By.id("chkboxOne")).click();
            driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
            Thread.sleep(2000);
            System.out.println(driver.findElement(By.tagName("p")).getText());
            Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
            Assert.assertEquals( driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
            driver.findElement(By.xpath("//button[text()='Log Out']")).click();
            driver.close();
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
    }
}


