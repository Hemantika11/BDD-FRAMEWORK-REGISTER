package StepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterStepDefinitions
{
    WebDriver driver;



    @Given("^User able to open Browser$")
    public void user_able_to_open_Browser()  {
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
        driver.manage().window().maximize();


    }

    @Given("^Enter Url$")
    public void enter_Url() {
        driver.get("https://demo.nopcommerce.com/");


    }

    @When("^User click on Register Link$")
    public void user_click_on_Register_Link()
    {
        driver.findElement(By.className("ico-register")).click();
    }

    @When("^User click on Gender Female$")
    public void user_click_on_Gender_Female()
    {
        driver.findElement(By.id("gender-female")).click();

    }

    @When("^I have entered a First Name$")
    public void i_have_entered_a_First_Name()
    {
        driver.findElement(By.id("FirstName")).sendKeys("Mr K");
    }

    @When("^I have entered a Last Name$")
    public void i_have_entered_a_Last_Name()
    {
        driver.findElement(By.id("LastName")).sendKeys("Shah");
    }

    @When("^I have entered a Date of Birth$")
    public void i_have_entered_a_Date_of_Birth()
    {

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("May");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1978");
    }

    @When("^I have entered a Email$")
    public void i_have_entered_a_Email()
    {
        driver.findElement(By.id("Email")).sendKeys("xyz@gmail.com");
    }

    @When("^I have entered a Company name$")
    public void i_have_entered_a_Company_name()
    {
        driver.findElement(By.id("Company")).sendKeys("Unifytesting");

    }

    @When("^I have entered a Password$")
    public void i_have_entered_a_Password()
    {
        driver.findElement(By.id("Password")).sendKeys("Abc123");

    }

    @When("^I have entered a Confirm password$")
    public void i_have_entered_a_Confirm_password()
    {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Abc123");

    }

    @When("^I click on Register button$")
    public void i_click_on_Register_button()
    {
        driver.findElement(By.id("register-button")).click();

    }




   }