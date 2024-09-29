package codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] arg){

        System.setProperty("webdriver.chrome.driver", "D://Rutesh//University//Computing concepts//Selenium_Jars_Chrome_files//chrome_driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.ca/");
        WebElement name = driver.findElement(By.id("APjFqb"));
        name.sendKeys("Elon Musk");
        name.submit();

    }
}
