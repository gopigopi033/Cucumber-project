$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Hooks.feature");
formatter.feature({
  "line": 2,
  "name": "Thonos story",
  "description": "",
  "id": "thonos-story",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Hooks"
    }
  ]
});
formatter.before({
  "duration": 626840,
  "status": "passed"
});
formatter.before({
  "duration": 289311,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "To divide thonos stories",
  "description": "",
  "id": "thonos-story;to-divide-thonos-stories",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "thonos has the infinity stones",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "thonos snaps his fingers",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "half of the living things died",
  "keyword": "And "
});
formatter.match({
  "location": "HooksDefiniftions.thonos_has_the_infinity_stones()"
});
formatter.result({
  "duration": 672958665,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefiniftions.thonos_snaps_his_fingers()"
});
formatter.result({
  "duration": 669929,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefiniftions.half_of_the_living_things_died()"
});
formatter.result({
  "duration": 600166,
  "status": "passed"
});
formatter.after({
  "duration": 646846,
  "status": "passed"
});
formatter.after({
  "duration": 825357,
  "status": "passed"
});
});