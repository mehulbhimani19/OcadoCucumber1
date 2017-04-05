package Software1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Mehul on 14/02/2017.
 */
public class RegistrationStepDeft extends  DriverManager
{

    @FindBy (linkText = "Register")
    private WebElement _registerLink;

    @FindBy (id = "tital")
    private WebElement _titalSelection;

    @Given("^I select register button$")
    public void i_select_register_button()
    {
        openBrowser();
//        Utility.clickOnElement(_registerLink);
         driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.xpath(".//*[@id='loginRegPopup']/div[2]/fieldset/label[1]")).click();
        driver.findElement(By.xpath(".//*[@id='loginRegPopup']/div[2]/fieldset/label[2]")).click();
    }

    @When("^I select tital form drop down namu$")
    public void i_select_tital_form_drop_down_namu()
    {

//    driver.switchTo().frame("shop");
//        Select select = new Select( driver.findElement(By.id("title")));
//        select.selectByVisibleText("Mrs");
//        Utility.selectByVisibleText(driver.findElement(By.id("title")),"Mr");
        Utility.selectByVisibleText(_titalSelection,"Mr");

    }


    @When("^I enter valid first name in first name filed$")
    public void i_enter_valid_first_name_in_first_name_filed()
    {
    driver.findElement(By.xpath(".//*[@id='qr-forename']")).sendKeys("Kabhi");
        //enter first name
    }

    @When("^I enter valid last name in last name filed$")public void i_enter_valid_last_name_in_last_name_filed()
    {
     driver.findElement(By.id("qr-surname")).sendKeys("kabhi");
        // lastname

    }

    @When("^I enter valid email addresh in email filed$")
    public void i_enter_valid_email_addresh_in_email_filed()
    {
      String email = "bhimani1985" + Utility.randomDate() + "1985@gmail.com ";
        driver.findElement(By.id("qr-email")).sendKeys(email);
    }

    @When("^I enter create valid password in create password filed$")
    public void i_enter_create_valid_password_in_create_password_filed()
    {
       driver.findElement(By.id("qr-password")).sendKeys("123456");
    }

    @When("^I enter valid post code in post code field$")
    public void i_enter_valid_post_code_in_post_code_field()
    {
     driver.findElement(By.id("qr-postcode")).sendKeys("ha3 6ej");
    }

    @When("^I click on registration button$")
    public void i_click_on_registration_button()
    {
        driver.findElement(By.id("acceptForm")).click();
    }

    @Then("^I should see my email as registration conformation$")
    public void i_should_see_my_email_as_registration_conformation()
    {

    }
}
