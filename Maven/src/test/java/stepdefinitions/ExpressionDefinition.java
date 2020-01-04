package stepdefinitions;

import cucumber.api.java.en.Given;

public class ExpressionDefinition {
	
	@Given("^I have (\\d+) laptop$")
	public void i_have_laptop(int arg1){
		System.out.println(arg1);
	}
	@Given("^I have (\\d+\\.\\d+) CGPA$")
	public void i_have_CGPA(float avg){
		System.out.println(avg);
	}

	@Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_to_and(String name1,String name2,String name3){
		System.out.println(name1 +" is elder to "+ name2 +" and "+ name3);
	}
}
