package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundStepDefinifions {
	
	@Given("^finished high school$")
	public void finished_high_school() {
		System.out.println("Finished high school");
	}

	@Given("^finished higher secondary school$")
	public void finished_higher_secondary_school() {
		System.out.println("Finished higher secondary school");
	}

	@Given("^the student apply for the medical course$")
	public void the_student_apply_for_the_medical_course() {
		System.out.println("Apply medical course");
	}

	@When("^the student clear entrance exam$")
	public void the_student_clear_entrance_exam() {
		System.out.println("Clear entrance exam");
	}

	@Then("^the student is eligible joining any medical institute$")
	public void the_student_is_eligible_joining_any_medical_institute() {
		System.out.println("Eligible for any medical institute");
	}

	@Given("^the student apply for the engineering course$")
	public void the_student_apply_for_the_engineering_course() {
		System.out.println("Apply engineering course");
	}

	@When("^the student have sayable cut off$")
	public void the_student_have_sayable_cut_off() {
		System.out.println("Sayable cut off");
	}

	@Then("^the student is eligible joining any engineering institute$")
	public void the_student_is_eligible_joining_any_engineering_institute() {
		System.out.println("Eligible for any eng institute");
	}
}
