package stepDefinition;

public class DatatableExample {
	@Given("uers opens up the browser in chrome")
	public void uers_opens_up_the_browser_in_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user navigated to {string} and searches for {string} site and")
	public void user_navigated_to_and_searches_for_site_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("checks for jsExecuter code in same site for various values")
	public void checks_for_js_executer_code_in_same_site_for_various_values(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user implements some methods related to jsExecuter in the chrome")
	public void user_implements_some_methods_related_to_js_executer_in_the_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
