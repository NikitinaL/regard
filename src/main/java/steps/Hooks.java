package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.DriverManager;
import managers.PageManager;
import managers.TestPropManager;

public class Hooks {
  private DriverManager driverManager = DriverManager.getINSTANCE();
  private TestPropManager propManager = TestPropManager.getINSTANCE();
  protected PageManager pageManager = PageManager.getINSTANCE();

  @Before
  public void before() {
    driverManager.getDriver().get(propManager.getProperty("HOSTNAME"));
  }

  @After
  public void after() {
    driverManager.getDriver().quit();
  }
}
