package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHookDefiniftions {
	@When("^school studies$")
	public void school_studies() throws Throwable {
		System.out.println("School studies");
	}

	@Then("^college studies$")
	public void college_studies() throws Throwable {
		System.out.println("College studies");
	}

	@Then("^working experience$")
	public void working_experience() throws Throwable {
		System.out.println("Working experience");
	}



}
