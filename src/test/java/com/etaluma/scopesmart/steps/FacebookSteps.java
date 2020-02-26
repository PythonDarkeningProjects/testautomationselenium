package com.etaluma.scopesmart.steps;

import com.etaluma.scopesmart.cucumber.ScenarioContext;
import com.etaluma.scopesmart.pages.FacebookPage;
import cucumber.api.Scenario;

import static junit.framework.TestCase.assertTrue;

public class FacebookSteps extends BaseStep {

    private FacebookPage facebookPage;

    public FacebookSteps(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;

        After(new String[]{"@FacebookSteps"},(Scenario scenario) ->
                super.teardown(scenario)
        );

        Given("^The Facebook Page Is Active$", () -> {
            super.setup();
            facebookPage = new FacebookPage(scenarioContext.getDriver());
            Thread.sleep(3000);
            facebookPage.getEmailInput().sendKeys("test@scalablepress.com");
            facebookPage.getPassInput().sendKeys("Testpass123");
        });

        Given("^The Custom Page Is Active$", () -> {
            super.setup();
            facebookPage = new FacebookPage(scenarioContext.getDriver());
        });


        And("The user fill the credentials", () -> {
            facebookPage.getEmailInput().sendKeys("test@scalablepress.com");
            facebookPage.getPassInput().sendKeys("Testpass123");
            facebookPage.getLoginButton().click();
            Thread.sleep(3000);

        });

        When("^A \"([^\"]*)\" is entered$", (String username) -> {
            facebookPage.getEmailInput().sendKeys(username);
        });

        When("The user clicks on the create campaign button", () -> {
            facebookPage.getCreateCampaingButton().click();
        });

        And("The campaign modal is shown", () -> {
            assertTrue(facebookPage.getCreateCampaingModal().isDisplayed());
        });


        And("The user select the first product", () -> {
            facebookPage.getClassicTShirt().click();
        });

        And("The user clicks on the Modal continue button", () -> {
            facebookPage.getModalContinueButton().click();
        });




        When("The user clicks on the M size$", () -> {
            facebookPage.getSizeM().click();
        });

        When("The user clicks on the buy now button$", () -> {
            facebookPage.getBuyNowButton().click();
        });


        When("The user hides the modal page$", () -> {
            Thread.sleep(3000);
            facebookPage.getModalPageXButton().click();
            Thread.sleep(2000);
            facebookPage.getProceedtoCheckoutButton().click();
        });

        When("The user fill out the form$", () -> {
            Thread.sleep(3000);
            facebookPage.getEmailInput().sendKeys("test@gmail.com");
            facebookPage.getFullNameInputForm().sendKeys("test name");
            facebookPage.getCityInputForm().sendKeys("1323");
            facebookPage.getZipCodeInputForm().sendKeys("123");

            facebookPage.getCreditCardInput().sendKeys("12345678");
            facebookPage.getMMYY().sendKeys("1123");
            facebookPage.getCcv().sendKeys("876");
            facebookPage.getPlaceYourOrderBtn().click();

        });

        And("^An alert appears$", () ->
                assertTrue(facebookPage.getInvalidCardMessage().isDisplayed())

        );


        And("^A \"([^\"]*)\" and \"([^\"]*)\" is entered$", (String username, String password) -> {
            facebookPage.getEmailInput().sendKeys(username);
            facebookPage.getPassInput().sendKeys(password);
        });

        And("^The user clicks on the Log In button$", () ->
            facebookPage.getLoginButton().click()
        );

        Then("^The credentials are \"([^\"]*)\"$", (String status) -> {
            if(status.equals("invalid")){
                assertTrue(facebookPage.getInvalidCredentialsAlert().isDisplayed());
            }
            else {
                assertTrue(facebookPage.getSearchInput().isDisplayed());
            }
        });

    }
}
