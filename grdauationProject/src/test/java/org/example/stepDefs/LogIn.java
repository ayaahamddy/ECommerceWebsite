package org.example.stepDefs;
import static org.example.stepDefs.Hooks.driver;
import static org.example.stepDefs.SignUp.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.homePage;
import org.example.Pages.loginPage;
import org.openqa.selenium.By;

public class LogIn {
    homePage home = new homePage();
    loginPage l = new loginPage();
    @Given("user go to login Page")
    public void userGoToLoginPage(){
        home.loginTab.click();
        driver.findElement(By.className("ico-login")).click();


    }

    @When("user enter his valid email")
    public void userEnterHisValidEmail() {
        l.email.sendKeys(Email);
    }

    @And("user enter a valid password")
    public void userEnterAValidPassword() {
        l.password.sendKeys(password);
    }
    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        l.loginButton.click();
    }

    @Then("user successfully log in.")
    public void userSuccessfullyLogIn() {


    }


    @And("user clicks on remember me option")
    public void userClicksOnRememberMeOption() {
        l.RememberMe.click();
    }
}
