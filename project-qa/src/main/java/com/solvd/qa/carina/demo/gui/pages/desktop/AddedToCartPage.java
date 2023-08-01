package com.solvd.qa.carina.demo.gui.pages.desktop;

import com.solvd.qa.carina.demo.gui.pages.common.AddedToCartPageCommon;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AddedToCartPageCommon.class)
public class AddedToCartPage extends AddedToCartPageCommon {

    @FindBy(xpath = "//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']//span")
    private  ExtendedWebElement addedToCartText;

    public AddedToCartPage(WebDriver driver){
        super(driver);
    }

    public String getAddedToCartText(){
        return addedToCartText.getText();
    }




}
