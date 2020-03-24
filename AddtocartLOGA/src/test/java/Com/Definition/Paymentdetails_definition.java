package Com.Definition;


import java.io.IOException;

import Com.Pages.Paymentdetails;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Paymentdetails_definition extends Paymentdetails {
	@Given("^Open the URL$")
	public void open_the_URL()  {
	    // Write code here that turns the phrase above into concrete actions
		Launch_URL();
		mouseactions();
	}

	@When("^Add an item to the cart and proceed to check$")
	public void add_an_item_to_the_cart_and_proceed_to_check()  {
	    // Write code here that turns the phrase above into concrete actions
		Select_item();
		Click_Proceedtocheck();
	}

	@Then("^Navigating to the login page$")
	public void navigating_to_the_login_page() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		login();
		Scrrenshot();
	}

}
