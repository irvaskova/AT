import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleTest {

    @Test
    public void correctFillingOfAllFields() {

        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.swiss.com/");
        driver.findElement(By.id("FlightOrigin")).clear();
        driver.findElement(By.id("FlightOrigin")).sendKeys("London");
        driver.findElement(By.id("FlightDestination")).clear();
        driver.findElement(By.id("FlightDestination")).sendKeys("Deli");
        driver.findElement(By.className("evo-input--label js-evo-passenger_select--infolabel")).click();
        driver.findElement(By.xpath("//div[@class='evo-input as-count']//label[@class='evo-input--label' @for='FlightAdults']//button[@class='evo-input-number--button as-increase js-stepinput--increase']")).click();
        driver.findElement(By.className("evo-passenger_select--popup--button js-evo-passenger_select--close")).click();
        driver.findElement(By.className("evo-button js-evo-bookingbar--submit")).click();
    }

}
