package com.wikipedia.step_definitions;

import com.wikipedia.pages.AfterSearchPage;
import com.wikipedia.pages.SearchPage;
import com.wikipedia.utilities.BrowserUtils;
import com.wikipedia.utilities.ConfigurationReader;
import com.wikipedia.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchFunctionality {

    SearchPage searchPage = new SearchPage();
    AfterSearchPage afterSearchPage = new AfterSearchPage();

    @Given("user us on Wikipedia home page")
    public void user_us_on_Wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikipedia_homepage"));
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        searchPage.searchBox.sendKeys(string);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        searchPage.searchBtn.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        BrowserUtils.sleep(4);
        BrowserUtils.titleVerificationContains(string);
    }


    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String string) {
        String actualHeader = afterSearchPage.headerFirstPage.getText();
        Assert.assertEquals("Main header verification FAILED", string, actualHeader);
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String string) {
       String actualHeader = afterSearchPage.headerImage.getText();
       Assert.assertEquals("Image Header verification FAILED", string, actualHeader);

    }



}
