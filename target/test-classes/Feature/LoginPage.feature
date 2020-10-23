Feature: Verifying Adactin details

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
      | JenithJohn | Jeni2847 | Sydney    | Hotel Sunshine | Deluxe       | 1 - One       | 19/10/2020  | 20/10/2020   | 2 - Two       | 1 - One         | Kumar     | K        | Australia      | 
      | JenithJohn | Jeni2847 | Melbourne | Hotel Creek    | Standard     | 2 - Two       | 19/10/2020  | 20/10/2020   | 3 - Three     | 2 - Two         | Kali      | R        | Japan          | 
      | JenithJohn | Jeni2847 | Brisbane  | Hotel Hervey   | Double       | 3 - Three     | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 4 - Four      | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | Sydney    | Hotel Sunshine | Deluxe       | 1 - One       | 19/10/2020  | 20/10/2020   | 2 - Two       | 1 - One         | Kumar     | K        | Australia      | 
      | JenithJohn | Jeni2847 | Melbourne | Hotel Creek    | Standard     | 2 - Two       | 19/10/2020  | 20/10/2020   | 3 - Three     | 2 - Two         | Kali      | R        | Japan          | 
      | JenithJohn | Jeni2847 | Brisbane  | Hotel Hervey   | Double       | 3 - Three     | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 4 - Four      | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          |
      | JenithJohn | Jeni2847 | Sydney    | Hotel Sunshine | Deluxe       | 1 - One       | 19/10/2020  | 20/10/2020   | 2 - Two       | 1 - One         | Kumar     | K        | Australia      | 
      | JenithJohn | Jeni2847 | Melbourne | Hotel Creek    | Standard     | 2 - Two       | 19/10/2020  | 20/10/2020   | 3 - Three     | 2 - Two         | Kali      | R        | Japan          |
      | JenithJohn | Jeni2847 | Brisbane  | Hotel Hervey   | Double       | 3 - Three     | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 4 - Four      | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 5 - Five      | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          |
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 6 - Six       | 19/10/2020  | 20/10/2020   | 3 - Three     | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 7 - Seven     | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 8 - Eight     | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 9 - Nine      | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 10 - Ten      | 19/10/2020  | 20/10/2020   | 1 - One       | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | Sydney    | Hotel Sunshine | Deluxe       | 1 - One       | 19/10/2020  | 20/10/2020   | 1 - One       | 1 - One         | Kumar     | K        | Australia      | 
      | JenithJohn | Jeni2847 | Melbourne | Hotel Creek    | Standard     | 2 - Two       | 19/10/2020  | 20/10/2020   | 2 - Two       | 2 - Two         | Kali      | R        | Japan          | 
      | JenithJohn | Jeni2847 | Brisbane  | Hotel Hervey   | Double       | 3 - Three     | 19/10/2020  | 20/10/2020   | 3 - Three     | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 4 - Four      | 19/10/2020  | 20/10/2020   | 4 - Four      | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | Sydney    | Hotel Sunshine | Deluxe       | 1 - One       | 19/10/2020  | 20/10/2020   | 1 - One       | 0 - None        | Kumar     | K        | Australia      | 
      | JenithJohn | Jeni2847 | Melbourne | Hotel Creek    | Standard     | 2 - Two       | 19/10/2020  | 20/10/2020   | 2 - Two       | 1 - One         | Kali      | R        | Japan          |
      | JenithJohn | Jeni2847 | Brisbane  | Hotel Hervey   | Double       | 3 - Three     | 19/10/2020  | 20/10/2020   | 3 - Three     | 2 - Two         | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 4 - Four      | 19/10/2020  | 20/10/2020   | 4 - Four      | 3 - Three       | Mani      | G        | China          | 
      | JenithJohn | Jeni2847 | London    | Hotel Cornice  | Super Deluxe | 4 - Four      | 19/10/2020  | 20/10/2020   | 4 - Four      | 4 - Four        | Mani      | G        | China          | 
