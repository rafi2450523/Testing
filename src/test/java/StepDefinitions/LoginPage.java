package StepDefinitions;

import io.cucumber.java.en.And; 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	@Given("user navigated to loginpage {string}")
	public void user_navigated_to_loginpage(String string) {
	    System.out.println("1");
	}

	@When("provided {string} and {string}")
	public void provided_and(String string, String string2) {
		System.out.println("2");
	}

	@And("submit the login")
	public void submit_the_login() {
		System.out.println("3");
	}

	@Then("navigates to home page")
	public void navigates_to_home_page() {
		System.out.println("4");
	}

}
