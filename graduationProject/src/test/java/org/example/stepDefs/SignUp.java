package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.homePage;
import org.example.Pages.registerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;
public class SignUp {
    homePage home = new homePage();
    registerPage register = new registerPage();
    static Faker faker = new Faker();
    public static String Email=faker.internet().emailAddress();
    public static String password=faker.internet().password();
    @Given("user go to Register Page")
    public void userGoToRegister(){
        home.registerTab.click();
    }

    @When("User Select Gender type")
    public void userSelectGender(){
        home.gender.click();
    }

    @When("user enter first and last name and select date of birth")
    public void userEnterFirstAndLastNameAndSelectDateOfBirth() {
        register.firstName.sendKeys("automation");
        register.lastName.sendKeys("tester");
        WebElement days=register.dayList;
        Select day=new Select(days);
        day.selectByValue("1");WebElement months=register.monthList;
        Select month=new Select(months);
        month.selectByValue("10");// month.deselectByVisibleText("October");
        WebElement years=register.yearList;
        Select year=new Select(years);
        year.selectByValue("1996");
    }

    @And("user enter a valid email")
    public void userEnterAValidEmail() {
        register.email.sendKeys(Email);
    }

    @And("user enters company name")
    public void userEntersCompanyName() {
        register.company.sendKeys("AMIT");
    }

    @And("newsLetter is unselected")
    public void newsletterIsUnselected() {
        register.newsLetter.click();
    }

    @And("User enters passwords and confirms it")
    public void userEntersPasswordsAndConfirmsIt() {
        register.password.sendKeys(password);
        register.confirmPassword.sendKeys(password);
    }

    @And("user click the register button")
    public void userClickTheRegisterButton() {
        register.registerButton.click();
    }

    @Then("New account is created.")
    public void newAccountIsCreated() {
//        SoftAssert soft = new SoftAssert();
        String expectedMessage = "Your registration completed";
        String actualMessage = register.resultMessage.getText();
        String actualColor = register.resultMessage.getCssValue("color");
        if (actualMessage.equals(expectedMessage)){
            System.out.println("registration completed successfully");
        }
        else
        {
            System.out.println("registration did not complete successfully");
        }
        if (actualColor.equals("rgba(76,177,124,1)")){
            System.out.println("registration completed successfully");
        }
        else
        {
            System.out.println("registration did not complete successfully");
        }

//        soft.assertEquals(actualMessage,expectedMessage);
//        soft.assertEquals(actualColor,"rgba(76,177,124,1)");
//        soft.assertAll();



    }




    @And("user enter a invalid email")
    public void userEnterAInvalidEmail() {
        register.email.sendKeys("ayahamdyexample.com");


    }

    @Then("New account is not created.")
    public void newAccountIsNotCreated() {
        System.out.println( "registration failed");
    }
}
