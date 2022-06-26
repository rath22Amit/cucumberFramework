Feature: Test plan for the Clark Recommendation Funnel

  
    
    
    
    @test
    Scenario Outline: Clark Recommendation Funnel Page Navigation  
    Given User is in the landing page of the application
    When User clicks on Bedarf Section and starts the application
    And  User fill the form and navigate to Insurance recommendation funnel : "<dateofbirth>","<gender>","<stay>","<vehicleOwn>","<emailid>"
    And User should be able to verify the insurance cards
    And User selects "<cardname>" 
    Then User should be able to see details of the "<cardname>" insurance
    
    Examples:
    |dateofbirth	|gender|stay        |vehicleOwn|cardname                         |emailid        |
    |22.03.1995   |Male  |rented_house|          | Pri­vate Alters­vor­sorge       |xym@xyx.com    |
    |21.10.2000		|Female|my_apartment|					 | Pri­vate Alters­vor­sorge       | test05@abc.com|
    
    
    
    # Page Object Model - Encapsulation
    # BaseClass - Inheritance
    # From where we need to get the data - Feature File
    # Common method- 
    
    
  
