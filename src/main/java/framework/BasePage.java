package framework;

import managers.DriverManager;
import managers.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
  protected final DriverManager driverManager = DriverManager.getINSTANCE();
  protected PageManager pageManager = PageManager.getINSTANCE();
  protected WebDriverWait wait = new WebDriverWait(driverManager.getDriver(), 10, 1000);
  protected Actions action = new Actions(driverManager.getDriver());
  public BasePage() {
    PageFactory.initElements(driverManager.getDriver(), this);
  }

  protected WebElement waitUtilElementToBeClickable(WebElement element) {
    return wait.until(ExpectedConditions.elementToBeClickable(element));
  }

}