package stepDefinitions;


	

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefTC1 {
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
	   System.out.println("Given method");
	}
	@When("the user enters username as demosalesmanager")
	public void the_user_enters_username_as_demosalesmanager() {
 System.out.println("username is entered");

	}
	@When("the user enters password as crmsfa")
	public void the_user_enters_password_as_crmsfa() {
		System.out.println("password is entered");
	}
	@When("user clicks login button")
	public void user_clicks_login_button() {
		System.out.println("Login button is clicked");
	}
	@Then("user navigated to welcome page")
	public void user_navigated_to_welcome_page() {
		System.out.println("Homepage is displayed");
	}
	@Then("the user see welcome message")
	public void the_user_see_welcome_message() {
		System.out.println("Welcome message is displayed");
	}
	@Given("the user in on the login page")
	public void the_user_in_on_the_login_page() {
		System.out.println("Given method");
	}
	@When("the user enters password as crms")
	public void the_user_enters_password_as_crms() {
		System.out.println("Password is entered");
	}
	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		System.out.println("Login button is clicked");
	}
	@When("the user should not to redirected to welcome page")
	public void the_user_should_not_to_redirected_to_welcome_page() {
		System.out.println("Welcome page not displayed");
}
}
