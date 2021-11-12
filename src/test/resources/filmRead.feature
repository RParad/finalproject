#  Feature: Film is found then the information retrieved from the application
#
#
#    Scenario: All identifiers required are present so film can be located
#      Given I have the correct identifiers
#      When I search for a film title
#      Then the film along with information about the film shall be retrieved
#
#
#    Scenario: All identifiers required are present so film can be located
#       Given I have invalid identifiers
#       When I search for a film title
#       Then the film shall not be retrieved and users will be told "The film cannot be found"