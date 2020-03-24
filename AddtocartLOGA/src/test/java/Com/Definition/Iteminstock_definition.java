package Com.Definition;

import java.io.IOException;

import Com.Pages.Iteminstock;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Iteminstock_definition extends Iteminstock{
	@Given("^Open URL$")
	public void open_URL() {
	    // Write code here that turns the phrase above into concrete actions
		Launch_URL();
	}

	@When("^Select the item$")
	public void select_the_item() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		mouseactions();
		Select_item();
		Click_Proceedtocheck();
	}


	@Then("^check whether the selected item is in stock or not$")
	public void check_whether_the_selected_item_is_in_stock_or_not()  {
	    // Write code here that turns the phrase above into concrete actions
		//Instock();
	}
}
