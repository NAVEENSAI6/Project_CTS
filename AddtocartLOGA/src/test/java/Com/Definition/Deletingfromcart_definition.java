package Com.Definition;

import java.io.IOException;

import Com.Pages.Deletingfromcart;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Deletingfromcart_definition extends Deletingfromcart{
	@Given("^Open the URL in the browser$")
	public void open_the_URL_in_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		Launch_URL();
		login();
		mouseactions();
		Select_item();
		}

	@When("^Go to the cart$")
	public void go_to_the_cart()  {
	    // Write code here that turns the phrase above into concrete actions
		cart_select();
	}

	@Then("^Delete an item from the cart$")
	public void delete_an_item_from_the_cart() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		delete_from_cart();
		Screenshot();
	}
}
