package com.wikipedia.pages;

import com.wikipedia.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterSearchPage {

    public AfterSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "firstHeading")
    public WebElement headerFirstPage;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement headerImage;

}
