package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.CreateAccountPageAbstract;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CreateAccountPageAbstract.class)
public class CreateAccountPage extends CreateAccountPageAbstract {

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    private ExtendedWebElement yourNameTextBox;

    @FindBy(xpath = "//input[@id='ap_email']")
    private ExtendedWebElement emailTextBox;

    @FindBy(xpath = "//input[@id='ap_password']")
    private ExtendedWebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    private ExtendedWebElement reEnterPasswordTextBox;

    @FindBy(xpath = "//input[@id='continue']")
    private ExtendedWebElement continueButton;


    public CreateAccountPage(WebDriver driver){
        super(driver);
    }

    public void setName(String name){
        yourNameTextBox.type(name);
    }
    public void setEmail(String email){
        emailTextBox.type(email);

    }
    public void setPassword(String password){
      passwordTextBox.type(password);
    }
    public void setRePassword(String rePassword){
      reEnterPasswordTextBox.type(rePassword);
    }

    public void clickOnContinueButton(){
        continueButton.click();
    }

    public boolean isContinueButtonPresented(){
        return continueButton.isElementPresent();
    }

}
