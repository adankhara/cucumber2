@test
Feature: All links on homepage is working

  Scenario Outline:  When user click on links
    Given User is on homepage
    When User click on <link>
    Then User should be navigate to <linkpage>

    Examples:
    | link | linkpage |
    | Computers | Computer Page |
    | Electronics | Electronics Page |
    | Books      | Books page         |
    | Jewelry     | Jewelry Page       |
    | Digital Downloads | Digital Downloads Page |
    | Gift Cards        | Gift Cards Page        |
    | Apparel           | Apparel Page           |






