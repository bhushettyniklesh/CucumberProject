package Stepsdefs;



import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefs {
	int num1;
	int num2;
	int result;
	List<Integer> values;

	@Given("I have two numbers {int} and {int}")
	public void i_have_two_numbers_and(int var1 ,int var2) {
	    // Write code here that turns the phrase above into concrete actions
	    this.num1=var1;
	    this.num2=var2;
	    
	}

	@When("I add those two numbers")
	public void i_add_those_two_numbers() {
	    // Write code here that turns the phrase above into concrete actions
	    result =num1+num2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expresults) {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertEquals(expresults, result);
	}

	@When("I sub those two numbers")
	public void i_sub_those_two_numbers() {
	    // Write code here that turns the phrase above into concrete actions
		result =num1-num2;
	}
	@Given("I have below numbers")
	public void i_have_below_numbers(List<Integer> numbers) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	 this.values=numbers;
	}

	@When("I add those numbers")
	public void i_add_those_numbers() {
	    // Write code here that turns the phrase above into concrete actions
	    for(int num:values) {
	    	result=result+num;
	    }
	}
	}
