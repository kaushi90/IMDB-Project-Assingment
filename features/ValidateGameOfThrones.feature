@ValidateMovie
Feature:validate contact Game of thrones page
  Scenario:Check whether Game of thrones page has loaded successfully
    Given open chrome browser and enter URL
    When click toprateMovies
    And Click Top rate Tvs
    When click Game of Thrones
    Then validate GameOfThrone Image Visibility
    Then validate PageTitle

  @Register
  Feature:validate IMDb new user registration
  Scenario:Check whether new user can successfully register to web site
    Given Sing up page should be load successfully
    When click create new account
    When Enter your name
    And Enter Email
    And Enter Password and re enter password
    And Enter submit button
    Then validate whether login success message display correctly
