package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.homePage;
import io.cucumber.java.en.Given;
import org.example.Pages.loginPage;
import org.example.Pages.registerPage;
import org.example.Pages.searchPage;

public class SearchPage {
    searchPage search = new searchPage();
    homePage home = new homePage();
    registerPage r = new registerPage();
    loginPage l = new loginPage();
    @Given("user clicks on search box")
    public void userClicksOnSearchBok(){
        home.loginTab.click();
        l.email.sendKeys(SignUp.Email);
        l.password.sendKeys(SignUp.password);
        l.RememberMe.click();
        l.loginButton.click();
      home.searchBox.click();

    }

    @When("user enter valid product name")
    public void userEnterValidProductName() {

        home.searchBox.sendKeys("Running Shoes");
    }

    @And("clicks on search button")
    public void clicksOnSearchButton() {
        home.searchButton.click();
    }

    @Then("the searched product appear")
    public void theSearchedProductAppear() {
        String expectedPrice = "$40.00";
        if (search.actualPrice.getText().equals(expectedPrice)){
            System.out.println("The searched Product matched expected ");
        }

    }

    @And("user uses advanced search to filter the products appear.")
    public void userUsesAdvancedSearchToFilterTheProductsAppear() {
        search.advancedcheck.click();
        search.manfacturer.sendKeys("Nike");
        search.serachButton.click();

    }
}
