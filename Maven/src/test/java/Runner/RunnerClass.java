package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //it run with junit cucumber class.

//1. Normal "Feature" and "Glue" options:
//1.1 OpenGoogle.feature (It's Basic Concept)
	//@CucumberOptions(features="FeatureFiles/OpenGoogle.feature", glue="stepdefinitions")
//1.2 LoginBRM.feature (It's also basic concept)
    //@CucumberOptions(features="FeatureFiles/LoginBRM.feature", glue="stepdefinitions")
//1.3 Expressions.feature (int,float,string) --- use regular expression
    //@CucumberOptions(features="FeatureFiles/Expressions.feature", glue="stepdefinitions")
//1.4 DataTableWithHeader 
    //@CucumberOptions(features="FeatureFiles/DataTableWithHeader.feature", glue="stepdefinitions")
//1.5 Expressions.feature (int,float,string)
    //@CucumberOptions(features="FeatureFiles/DataTableWithoutHeader.feature", glue="stepdefinitions")

//2. Using "dryRun" and "strict" options:
//2.1 dryRun
	//@CucumberOptions(features="FeatureFiles/OpenGoogle.feature", glue="stepdefinitions", dryRun=true)
//2.2 strict
	//@CucumberOptions(features="FeatureFiles/OpenGoogle.feature", glue="stepdefinitions", strict=true)

//3. Using "Format" option:
//3.1 format
	//@CucumberOptions(features="FeatureFiles/OpenGoogle.feature", glue="stepdefinitions", 
                       //format={"html:report/webreport","json:report/jsonreport.json"}) //here use "format" (or) "plugin"

//4. Using "Tags" option:
//4.1 feature level
	//@CucumberOptions(features="FeatureFiles/OpenGoogle.feature", glue="stepdefinitions", strict=true,
                      //tags="@simplelogin")
//4.2 scenario level
    //@CucumberOptions(features="FeatureFiles/OpenGoogle.feature", glue="stepdefinitions", strict=true,
                       //tags="@possitive")                    
//4.3 club file
   //@CucumberOptions(features="FeatureFiles/OpenGoogle.feature", glue="stepdefinitions", strict=true,
                      //tags={"@simplelogin,@datadriven"}) -- this is for "or" operator - any one correct
                      //tags={"@simplelogin","@datadriven"}) -- this is for "and" operator - must both correct
//4.4 ignore tags
   //@CucumberOptions(features="FeatureFiles/OpenGoogle.feature", glue="stepdefinitions", strict=true,
                     //tags="~@possitive")                    

//5. Hooks:
  //@CucumberOptions(features="FeatureFiles/Hooks.feature", glue={"stepdefinitions","Hooks"})

//6. TaggedHooks:
  //@CucumberOptions(features="FeatureFiles/TaggedHooks.feature", glue={"stepdefinitions","Hooks"})

//6. Background:
    @CucumberOptions(features="FeatureFiles/Background.feature", glue={"stepdefinitions","Hooks"})

public class RunnerClass {
	
	
	}
