package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;
    @Given("user is on login page")
    public void user_is_on_login_page() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("user enter username and password")
    public void user_enter_username_and_password() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");


    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        Thread.sleep(4000);
        driver.getTitle();
    }
    @When("user clicks on admin module")
    public void user_clicks_on_admin_module() {
        driver.findElement(By.xpath("(//a)[2]")).click();
    }
    @And("user enters username field value")
    public void user_enters_username_field_value() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("Admin");
    }
    @Then("user clicks on search button")
    public void user_clicks_on_search_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
}
