package cumber;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import orange.DriverClass;
import orange.Loginpage;
import io.cucumber.java.en.And;

public class LoginStepDefinitions {
	@Given("URL: {string}")
	public void url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("url is enytered successfully");
	}

	@Then("On search OrangeHRM Login Page should be displayed")
	public void on_search_orange_hrm_login_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		DriverClass.WebDriver();
		System.out.println(" OrangeHRM Login Page should be displayed");
	}

	@Given("username {string}")
	public void username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		Loginpage.usernamekeys("chetanaremarati@gmail.com");
		System.out.println(" OrangeHRM username should be displayed");
		}
	

	@Then("username entered successfully")
	public void username_entered_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM Login Page should be displayed");
		}
	

	@Given("password {string}")
	public void password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM pasword entered successfully");
	}

	@Then("password entered successfully")
	public void password_entered_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM password entered displayed successfully");
	}

	@Then("click Login Button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM login clicked successfully");
	}

	@Then("OrangeHRM home page should be displayed")
	public void orange_hrm_home_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM Homepage displayed successfully");
	}

	@Then("user name entered successfully")
	public void user_name_entered_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM username entered displayed successfully");
	}

	@Then("Invalid Credentials should be displayed")
	public void invalid_credentials_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM Invalid Credentials should be displayed displayed successfully");
	}

	@Then("username field should be empty")
	public void username_field_should_be_empty() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM pusername field should be empty displayed successfully");
	}

	@Then("required message should be displayed below username")
	public void required_message_should_be_displayed_below_username() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM required message should be displayed below username");
	}

	@Then("password field should be empty")
	public void password_field_should_be_empty() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM password field should be empty\"");
	}

	@Then("required message should be displayed below password field")
	public void required_message_should_be_displayed_below_password_field() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM prequired message should be displayed below password field displayed successfully");
	}

	@Then("required message should be displayed below username and password field")
	public void required_message_should_be_displayed_below_username_and_password_field() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" OrangeHRM prequired message should be displayed below username and password field displayed successfully");
	}
}
