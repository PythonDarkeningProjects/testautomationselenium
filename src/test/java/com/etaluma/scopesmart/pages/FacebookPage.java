package com.etaluma.scopesmart.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPage extends BasePage {

    public FacebookPage(WebDriver driver) {
        super(driver);
        driver.get(getURL("/"));
    }

    @FindBy(how = How.XPATH, using = "//input[@type=\"text\"][@name=\"email\"]")
    private WebElement emailInput;

    @FindBy(how = How.XPATH, using = "//input[@type=\"password\"][@name=\"password\"]")
    private WebElement passInput;

    @FindBy(how = How.XPATH, using = "//div[@id='globalContainer']/descendant::div[@role='alert']")
    private WebElement invalidCredentialsAlert;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content\"]/div/div/div[1]/form/div[3]/div/button")
    private WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//input[@type='text'][@placeholder='Search'][@name='q']")
    private WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"product_details_size_container\"]/div[2]/div/div[3]/div")
    private WebElement sizeM;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content\"]/div/div/div/div/div[2]/div[2]/div[10]/button/span/span")
    private WebElement buyNowButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[20]/div/div/div/div[1]/i")
    private WebElement modalPageXButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content\"]/div/div[1]/div[1]/div[1]/div/div[2]/div/div[2]/button/span")
    private WebElement proceedtoCheckoutButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"address-form\"]/div[1]/div/div/div/div/div/div/input")
    private WebElement fullNameInputForm;

    @FindBy(how = How.XPATH, using ="//*[@id=\"address-form\"]/div[3]/div/div/div/div/div/input")
    private WebElement cityInputForm;

    @FindBy(how = How.XPATH, using = "//*[@id=\"address-form\"]/div[4]/div[2]/div/div/div/div/div/input")
    private WebElement zipCodeInputForm;

    @FindBy(how = How.XPATH, using = "//*[@id=\"credit-card-number\"]")
    private WebElement creditCardInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"expiration\"]")
    private WebElement MMYY;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cvv\"]")
    private WebElement ccv;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content\"]/div/div[2]/div/div[1]/div/div[6]/button[2]")
    private WebElement placeYourOrderBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content\"]/div/div[2]/div/div[1]/div/div[6]/div/div[2]/span/span[1]")
    private WebElement invalidCardMessage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content\"]/div/div/div[1]/div[2]/div/a")
    private WebElement createCampaingButton;


    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div/div")
    private WebElement createCampaingModal;

    @FindBy(how = How.XPATH, using = "//*[@id=\"apparel\"]/div[2]/div[1]/div")
    private WebElement classicTShirt;


    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div/div/div/div/div[1]/div[3]/div/span")
    private WebElement modalContinueButton;




    public  WebElement getModalContinueButton(){  return modalContinueButton; }

    public  WebElement getClassicTShirt(){  return classicTShirt; }

    public  WebElement getCreateCampaingModal(){  return createCampaingModal; }

    public  WebElement getCreateCampaingButton(){  return createCampaingButton; }

    public  WebElement getInvalidCardMessage(){  return invalidCardMessage; }

    public  WebElement getPlaceYourOrderBtn(){  return placeYourOrderBtn; }

    public WebElement getCcv() { return ccv; }

    public WebElement getMMYY() { return MMYY; }

    public WebElement getCreditCardInput() { return creditCardInput; }

    public WebElement getZipCodeInputForm() { return zipCodeInputForm; }

    public WebElement getCityInputForm() { return cityInputForm; }

    public WebElement getFullNameInputForm() { return fullNameInputForm; }

    public WebElement getModalPageXBtn() { return modalPageXButton; }


    public WebElement getEmailInput() { return emailInput; }

    public WebElement getPassInput() { return passInput; }

    public WebElement getInvalidCredentialsAlert() { return invalidCredentialsAlert; }

    public WebElement getLoginButton(){ return loginButton; }

    public  WebElement getSearchInput(){ return searchInput; }

    public WebElement getSizeM(){ return sizeM; }

    public WebElement getBuyNowButton(){ return buyNowButton; }

    public WebElement getModalPageXButton(){ return modalPageXButton; }

    public WebElement getProceedtoCheckoutButton(){ return proceedtoCheckoutButton; }
}
