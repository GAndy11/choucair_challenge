#Autor: Alexander Echeverry Torres
@Stories
Feature: Sign Up In uTest
  As an anonymous user, I want to SignUp in uTest for a challenge because I want to work in Choucair
  @scenario1
  Scenario: SignUp in uTest
    Given than Alexander wants to create account in uTest.com
    When he fill the data required for the page
    | firsName    | lastName     | emailAddress          | birthMonth | birthDay | birthYear | city     | zipCode | device  | deviceVersion | deviceLanguage | password                |
    | Alexander    | Echeverry    | cliente1@gmail.com    | May          | 15       | 1991      | Medellín | 050001  | Windows | 10            | Spanish        | Thisisapassword123/*-+ |
    Then he finally could subscribe in the platform for testers community
    | welcomeMessage                                                          |
    | Welcome to the world's largest community of freelance software testers! |