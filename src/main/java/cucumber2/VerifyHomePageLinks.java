package cucumber2;

import org.testng.Assert;


public class VerifyHomePageLinks extends Utils
{
    private final static String computersUrl = "https://demo.nopcommerce.com/computers";
    private final static String booksUrl = "https://demo.nopcommerce.com/books";
    private final static String jewelryUrl= "https://demo.nopcommerce.com/jewelry";
    private final static String digitalDownloadsUrl = "https://demo.nopcommerce.com/digital-downloads";
    private final static String giftCardsUrl = "https://demo.nopcommerce.com/gift-cards";
    private final static String electronicsUrl = "https://demo.nopcommerce.com/electronics";
    private final static String apparelUrl = "https://demo.nopcommerce.com/apparel";

    public void verifyComputersLink()
    {
        driver.get(computersUrl);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(computersUrl));
    }
    public void verifyBooksLink()
    {
        driver.get(booksUrl);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(booksUrl));
    }
    public void verifyElectronicsLink()
    {
        driver.get(electronicsUrl);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(electronicsUrl));
    }
    public void verifyjewelryLink()
    {
        driver.get(jewelryUrl);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(jewelryUrl));
    }
    public void verifyGiftCardsLink()
    {
        driver.get(giftCardsUrl);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(giftCardsUrl));
    }
    public void verifyAparelLink()
    {
        driver.get(apparelUrl);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(apparelUrl));
    }
    public void verifyDigitalDownloadsLink()
    {
        driver.get(digitalDownloadsUrl);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(digitalDownloadsUrl));
    }

}
