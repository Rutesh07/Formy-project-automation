package codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownMenu {
    public static void main(String[] arg) {

        System.setProperty("webdriver chrome.driver", "D://Rutesh//University//Computing concepts//Selenium_Jars_Chrome_files//chrome_driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();

        WebElement autocompleteItem =driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();
    }
}