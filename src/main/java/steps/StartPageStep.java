package steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class StartPageStep {
  PageManager pageManager = PageManager.getPageManager();

  @И("Выполнен переход в каталог")
  public void selectCatalog(){
    pageManager.getStartPage().selectCatalog();
  }

  @И("Выполнен переход в главное меню {string}")
  public void selectMainCategory (String string){
    pageManager.getStartPage().selectMainCategory(string);
  }
}
