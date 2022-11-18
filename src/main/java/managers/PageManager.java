package managers;

//import framework.SearchPage;
import framework.StartPage;

public class PageManager {
  private static PageManager pageManager;
  private static PageManager INSTANCE = null;

  private StartPage startPage;

  //private SearchPage searchPage;

  private PageManager(){

  }

  public static PageManager getINSTANCE() {
    if (INSTANCE == null) {
      INSTANCE = new PageManager();
    }
    return INSTANCE;
  }
  public static PageManager getPageManager() {
    if (pageManager == null) {
      pageManager = new PageManager();
    }
    return pageManager;
  }


  public StartPage getStartPage() {
    if (startPage == null) {
      startPage = new StartPage();
    }
    return startPage;
  }


//  public SearchPage getSearchPage() {
//    if (searchPage == null) {
//      searchPage = new SearchPage();
//    }
//    return searchPage;
//  }
}


