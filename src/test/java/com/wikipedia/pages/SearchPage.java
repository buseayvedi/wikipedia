package com.wikipedia.pages;

import com.wikipedia.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchInput")
    public WebElement searchBox ;

    @FindBy(css = "button.pure-button.pure-button-primary-progressive")
    public WebElement searchBtn;





}
