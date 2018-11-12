package by.bsu.vaskova.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookOnline {

    public BookOnline(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(className = "js-evo-bookingbar--from js-evo-autocomplete")
    private WebElement fromField;

    @FindBy(className = "js-evo-bookingbar--to js-evo-autocomplete")
    private WebElement toField;

    @FindBy(id = "FlightInboundDate")
    private WebElement returnFlight;

    @FindBy(className = "evo-button js-evo-bookingbar--submit")
    private WebElement searchButton;

    @FindBy(className = "notification-message")
    private WebElement textError;

    public void inputFrom(String from_city) {
        fromField.clear();
        fromField.sendKeys(from_city);
    }

    public void inputTo(String to_city) {
        toField.clear();
        toField.sendKeys(to_city);
    }

    public void inputReturnDate(String return_date) {
        returnFlight.clear();
        returnFlight.sendKeys(return_date);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String error() {
        return textError.getText();
    }
}
