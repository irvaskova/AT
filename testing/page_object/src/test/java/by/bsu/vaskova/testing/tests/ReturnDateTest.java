package by.bsu.vaskova.testing.tests;

import by.bsu.vaskova.testing.pages.BookOnline;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ReturnDateTest {
    public static WebDriver driver;
    public static BookOnline bookOnline;

    @BeforeClass
    public static void setur() {
        System.setProperty("webdriver.home.driver", "D://web_drivers//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        bookOnline = new BookOnline(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.swiss.com/");
    }
    @Test
    public void findTicketWhenReturnDateIsEarlierThanDepartureDate() {
        bookOnline.inputFrom("Moscow");
        bookOnline.inputTo("Delhi");
        bookOnline.inputReturnDate("10/11/2018");
        bookOnline.clickSearchButton();
        String expectedError = "The date of the outbound flight must be before the date of the return flight. Please correct your travel dates. (50400)";
        Assert.assertEquals(bookOnline.error(), expectedError);
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
