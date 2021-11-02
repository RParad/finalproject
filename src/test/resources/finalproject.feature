Feature: Read function
  I want to retrieve the film information from the application

      Scenario: The search criteria has been met
        Given a film is present in the database
        When they search for a film title
        Then the film along with information about the film shall be retrieved


      Scenario: The search criteria has not been met
        Given a film is not present in the database
        When they search for a film title
        Then the film shall not be retrieved and users will be told "The film cannot be found"

Feature: Creation of new films
  The admin user wants to add a new film

      Scenario: The film to be added is not a duplicate film
        Given The title is not a duplicate
        When I add the title to the database
        Then the film title and its relevant information shall be added

      Scenario: The film to be created is a duplicate
        Given that the title is a duplicate
        When I add the title to the database
        Then the film title will not be crated and an error message returns stating, "The new title cannot be created as it already exists."


Feature: Deletion of a film
  The admin user needs to delete non applicable films

        Scenario: There is confirmed inappropriate film information
          Given the information is present to be removed
          When you try to delete the film
          Then the film is Deleted

        Scenario: No Film data to be deleted
          Given the film information is not present to delete
          When you try to delete the film
          Then the film will not be deleted and an error will appear stating, "There is no information to be deleted"


Feature: Checking of the credentials
  The admin staff will check credentials of other users

        Scenario: Credentials of system users do not match authorised levels
          Given the credentials of the members are verified
          When the system users information is checked
          Then the system user will be given a "Verified to edit" message

        Scenario: The wrong credentials are put in
          Given the credentials of the members are not verified
          When the system user information is not checked
          Then the user shall receive a message stating, "Authorisation does not alow acess for this member"

 Feature: The admin member needs to update the film
   The admin member updates the information on the page in response to a report of th  wrong information

        Scenario: The information requires editing due to system users reporting the information is wrong
          Given The film is not accurate based on reports
          When the film data is checked
          Then the film information will be altered to reflect the new accurate information
