package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDefiniftions {
	@When("^thonos has the infinity stones$")
	public void thonos_has_the_infinity_stones() throws Throwable {
		System.out.println("Thonos finally got the infinity stones");
	}

	@Then("^thonos snaps his fingers$")
	public void thonos_snaps_his_fingers() throws Throwable {
		System.out.println("Thonos snap his finger");
	}

	@Then("^half of the living things died$")
	public void half_of_the_living_things_died() throws Throwable {
		System.out.println("Half of the living things died");
	}
}
