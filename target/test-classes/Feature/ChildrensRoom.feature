@Feature5
Feature: Verifying Adactin details
  @ChildrenRoom
  Scenario Outline: Verifying the adactin login details with invalid credentials
    Given I am on the Adactin page
    When I should login using "<userName>" and "<password>"
    And I should search the hotel using "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>"
    Then I should select the hotel
    When I should book the hotel using  "<firstName>","<lastName>","<billingAddress>"
      | ccNo              | ccType           | expMonth  | expYear | cvvNumber |
      | 98766543211265347 | American Express | March     |    2022 |       453 |
      | 93456543211256435 | VISA             | February  |    2020 |       123 |
      | 98666543211262578 | Master Card      | September |    2022 |       167 |
      | 92366543211290876 | Other            | July      |    2021 |       675 |
    And I should get the order number

    Examples: 
      | userName   | password | location  | hotels         | roomType     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress |
      | GokulNathan | gokulfaraday@16 | Sydney    | Hotel Sunshine | Deluxe       | 1 - One       | 19/10/2020  | 20/10/2020   | 1 - One       | 0 - None        | Kumar     | K        | Australia      |
      | GokulNathan | gokulfaraday@16 | Melbourne | Hotel Creek    | Standard     | 2 - Two       | 19/10/2020  | 20/10/2020   | 2 - Two       | 1 - One         | Kali      | R        | Japan          |
      | GokulNathan | gokulfaraday@16 | Brisbane  | Hotel Hervey   | Double       | 3 - Three     | 19/10/2020  | 20/10/2020   | 3 - Three     | 2 - Two         | Mani      | G        | China          |
      | GokulNathan | gokulfaraday@16 | London    | Hotel Cornice  | Super Deluxe | 4 - Four      | 19/10/2020  | 20/10/2020   | 4 - Four      | 3 - Three       | Mani      | G        | China          |
      | GokulNathan | gokulfaraday@16 | London    | Hotel Cornice  | Super Deluxe | 4 - Four      | 19/10/2020  | 20/10/2020   | 4 - Four      | 4 - Four        | Mani      | G        | China          |
