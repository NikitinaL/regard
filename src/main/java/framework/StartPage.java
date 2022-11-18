package framework;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StartPage extends BasePage {
  @FindBy(xpath = "//button//span[contains (text(), 'Каталог')]")
  private WebElement catalogButton;

  @FindBy(xpath = "//a[@class='Catalog_mainCategory__2ngff']/div")
  private List<WebElement> mainCategory;

  public void selectCatalog () {
    waitUtilElementToBeClickable(catalogButton);
    catalogButton.click();
  }
  public void selectMainCategory (String mainCategoryName) {
    for (WebElement itemMenu : mainCategory) {
      if (itemMenu.getText().contains(mainCategoryName)) {
        action.moveToElement(itemMenu).build().perform();
        return;
      }
    }
    Assert.fail("Категория с текстом" + mainCategoryName + " не найдена на странице");
  }
}
