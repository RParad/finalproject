Feature: Film can be Read
  I want to retrieve the film information from the application

  Scenario: The search criteria has been met
    Given a film is present in the database
    When they search for a film title
    Then the film along with information about the film shall be retrieved


  Scenario: The search criteria has not been met
    Given a film is not present in the database
    When they search for a film title
    Then the film shall not be retrieved and users will be told "The film cannot be found"
