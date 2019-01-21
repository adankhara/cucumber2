package cucumber2;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    public void cliclOnCumputer()
    {
        clickElement(By.linkText("Computers"));
    }

    public void cliclOnBooks()
    {
        clickElement(By.linkText("Books"));
    }

    public void cliclOnJewelry()
    {
        clickElement(By.linkText("Jewelry"));
    }

    public void cliclOnApparel()
    {
        clickElement(By.linkText("Apparel"));
    }

    public void cliclOnDigitalDownloads()
    {
        clickElement(By.linkText("Digital downloads"));
    }

    public void cliclOnGiftCards()
    {
        clickElement(By.linkText("Gift Cards"));
    }

    public void cliclOnElectronics()
    {
        clickElement(By.linkText("Electronics"));
    }
}
