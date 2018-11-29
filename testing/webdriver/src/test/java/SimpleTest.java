import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void correctFillingOfAllFields() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.swiss.com/pl/en");
        driver.findElement(By.id("FlightOrigin")).clear();
        driver.findElement(By.id("FlightOrigin")).sendKeys("London");
        driver.findElement(By.id("FlightDestination")).sendKeys("Moscow");
        driver.findElement(By.id("FlightOutboundDate")).clear();
        driver.findElement(By.id("FlightOutboundDate")).sendKeys("20/01/2019");
        driver.findElement(By.id("FlightInboundDate")).sendKeys("20/02/2019");
        driver.findElement(By.className("evo-button js-evo-bookingbar--submit")).click();
        //String expectedURL = "https://www.swiss.com/ru/en/Book/Outbound/LON-MOW/from-2019-01-20/to-2019-02-20/adults-1/children-0/infants-0/class-economy/al-LX/sidyjqs";
        assertEquals("https://www.swiss.com/pl/en/Book/Outbound/LON-MOW/from-2019-01-20/to-2019-02-20/adults-1/children-0/infants-0/class-economy/al-LX/sidyjqs", driver.getCurrentUrl());
    }
}

