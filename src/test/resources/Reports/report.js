$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/LoginPage.feature");
formatter.feature({
  "name": "Verifying Adactin details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying the adactin login details with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the Adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "I should login using \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should search the hotel using \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomType\u003e\",\"\u003cnumberOfRooms\u003e\",\"\u003ccheckInDate\u003e\",\"\u003ccheckOutDate\u003e\",\"\u003cadultsPerRoom\u003e\",\"\u003cchildrenPerRoom\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I should select the hotel",
  "keyword": "Then "
});
formatter.step({
  "name": "I should book the hotel using  \"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003cbillingAddress\u003e\"",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "ccNo",
        "ccType",
        "expMonth",
        "expYear",
        "cvvNumber"
      ]
    },
    {
      "cells": [
        "98766543211265347",
        "American Express",
        "March",
        "2022",
        "453"
      ]
    },
    {
      "cells": [
        "93456543211256435",
        "VISA",
        "February",
        "2020",
        "123"
      ]
    },
    {
      "cells": [
        "98666543211262578",
        "Master Card",
        "September",
        "2022",
        "167"
      ]
    },
    {
      "cells": [
        "92366543211290876",
        "Other",
        "July",
        "2021",
        "675"
      ]
    }
  ]
});
formatter.step({
  "name": "I should get the order number",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "location",
        "hotels",
        "roomType",
        "numberOfRooms",
        "checkInDate",
        "checkOutDate",
        "adultsPerRoom",
        "childrenPerRoom",
        "firstName",
        "lastName",
        "billingAddress"
      ]
    },
    {
      "cells": [
        "JenithJohn",
        "Jeni2847",
        "Sydney",
        "Hotel Sunshine",
        "Deluxe",
        "1 - One",
        "19/10/2020",
        "20/10/2020",
        "2 - Two",
        "1 - One",
        "Kumar",
        "K",
        "Australia"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying the adactin login details with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the Adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.adactinPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should login using \"JenithJohn\" and \"Jeni2847\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.i_should_login_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should search the hotel using \"Sydney\",\"Hotel Sunshine\",\"Deluxe\",\"1 - One\",\"19/10/2020\",\"20/10/2020\",\"2 - Two\",\"1 - One\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.i_should_search_the_hotel_using(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should select the hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.selectTheHotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should book the hotel using  \"Kumar\",\"K\",\"Australia\"",
  "rows": [
    {
      "cells": [
        "ccNo",
        "ccType",
        "expMonth",
        "expYear",
        "cvvNumber"
      ]
    },
    {
      "cells": [
        "98766543211265347",
        "American Express",
        "March",
        "2022",
        "453"
      ]
    },
    {
      "cells": [
        "93456543211256435",
        "VISA",
        "February",
        "2020",
        "123"
      ]
    },
    {
      "cells": [
        "98666543211262578",
        "Master Card",
        "September",
        "2022",
        "167"
      ]
    },
    {
      "cells": [
        "92366543211290876",
        "Other",
        "July",
        "2021",
        "675"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.i_should_book_the_hotel_using(String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the order number",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.i_should_get_the_order_number()"
});
formatter.result({
  "status": "passed"
});
});