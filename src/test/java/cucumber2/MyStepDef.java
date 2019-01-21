package cucumber2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef
{
    HomePage homePage = new HomePage();
    VerifyHomePageLinks verifyHomePageLinks = new VerifyHomePageLinks();

    @Given("^User is on homepage$")
    public void user_is_on_homepage()
    {
    }

    @When("^User click on Computers$")
    public void user_click_on_Computers()
    {
        homePage.cliclOnCumputer();
    }

    @Then("^User should be navigate to Computer Page$")
    public void user_should_be_navigate_to_Computer_Page()
    {
        verifyHomePageLinks.verifyComputersLink();
    }

    @When("^User click on Electronics$")
    public void user_click_on_Electronics()
    {
        homePage.cliclOnElectronics();
    }

    @Then("^User should be navigate to Electronics Page$")
    public void user_should_be_navigate_to_Electronics_Page()
    {
        verifyHomePageLinks.verifyElectronicsLink();
    }

    @When("^User click on Books$")
    public void user_click_on_Books()
    {
        homePage.cliclOnBooks();
    }

    @Then("^User should be navigate to Books page$")
    public void user_should_be_navigate_to_Books_page()
    {
        verifyHomePageLinks.verifyBooksLink();
    }

    @When("^User click on Jewelry$")
    public void user_click_on_Jewelry()
    {
        homePage.cliclOnJewelry();
    }

    @Then("^User should be navigate to Jewelry Page$")
    public void user_should_be_navigate_to_Jewelry_Page()
    {
        verifyHomePageLinks.verifyjewelryLink();
    }

    @When("^User click on Digital Downloads$")
    public void user_click_on_Digital_Downloads()
    {
        homePage.cliclOnDigitalDownloads();
    }

    @Then("^User should be navigate to Digital Downloads Page$")
    public void user_should_be_navigate_to_Digital_Downloads_Page()
    {
        verifyHomePageLinks.verifyDigitalDownloadsLink();
    }

    @When("^User click on Gift Cards$")
    public void user_click_on_Gift_Cards()
    {
        homePage.cliclOnGiftCards();
    }

    @Then("^User should be navigate to Gift Cards Page$")
    public void user_should_be_navigate_to_Gift_Cards_Page()
    {
        verifyHomePageLinks.verifyGiftCardsLink();
    }

    @When("^User click on Apparel$")
    public void user_click_on_Apparel()
    {
        homePage.cliclOnApparel();
    }

    @Then("^User should be navigate to Apparel Page$")
    public void user_should_be_navigate_to_Apparel_Page()
    {
        verifyHomePageLinks.verifyAparelLink();
    }
}
