package cucumber2;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils
{
    BrowserSelector browserSelector = new BrowserSelector();


    @Before
    public void setUp()
    {
        browserSelector.browser();
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

}
