import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class introduction {
    public static void main(String[] args) {
        //Invoking the browser
        //We need to create the object of the class to access the methods of the class
        //Webdriver methods + class methods
        String key = "webdriver.chrome.driver";
        // ChromeDARIVER.EXE -> Chrome browser
        System.setProperty(key,"/home/ivan/Documents/Browsers/chromedriver_linux64/chromedriver");

        //webDriver.chrome.driver -> value of path
        WebDriver driver = new ChromeDriver();
        //enter to the url
        driver.get("https://arroyoconsulting.net/");
        // get the title of the tab
        System.out.println(driver.getTitle());
        //
        System.out.println(driver.getCurrentUrl());
        //close the current window
        driver.close();
        //close all associate windows
        //driver.quit()
    }
}
