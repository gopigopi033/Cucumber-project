package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	
//1. Normal "before" and "after" -- for scenario before and after run:
//	@Before(order=1)
//	public void BeforeScenario() {
//	System.out.println("Thonos planning to collect the stones");
//		}
//	@After(order=1)
//	public void AfterScenario() {
//	System.out.println("After killed, Finally Take rest in garden");
//		}
//	
//	@Before(order=0)
//	public void BeforetoBeforeScenario() {
//	System.out.println("First thonos born");
//		}
//	@After(order=0)
//	public void AftertoAfterScenario() {
//	System.out.println("Finally thonos died");
//		}
	
//2. TaggedHooks:
//	@Before(order=0)
//	public void commonbefore() {
//		System.out.println("First Born Successfully");
//	}
//	@After
//	public void commonafter() {
//		System.out.println("Finally Die Successfully");
//	}
//	@Before("@first")
//	public void firstbefore() {
//		System.out.println("first before");
//	}
//	@After("@first")
//	public void firstafter() {
//		System.out.println("first after");
//	}
//	@Before("@second,@third")
//	public void secondbefore() {
//		System.out.println("second before and third before");
//	}
//	@After("@second,@third")
//	public void secondafter() {
//		System.out.println("second after and third after");
//	}
//	//@Before("@third")                 // why i kill becasue i use another method see above codes.
//	//public void thirdbefore() {
//		//System.out.println("third before");
//	//}
//	//@After("@third")
//	//public void thirdafter() {
//		//System.out.println("third after");
//	//}

//3. Background:
	@Before
	public void BeforeScenario() {
	System.out.println("Before Background Hooks");
		}
	@After
	public void AfterScenario() {
	System.out.println("After Background Hooks");
		}
	}
