#Author: Ramon Lopez

@BPD
Feature: Title of your feature
  I want to use this template for my feature file

  @CHROME
  Scenario: Beneficios de VISA ISI - Chrome
  When I open CHROME
  Then I go to BPD
  And I click Tarjetas "Visa ISI"
  Then I print the benefits
  
    @EDGE
  Scenario: Beneficios de VISA ISI - EDGE
  When I open EDGE
  Then I go to BPD
  And I click Tarjetas "VISA ISI"
  Then I print the benefits
  
    @CHROME
  Scenario: Beneficios de Titanium - Chrome
  When I open CHROME
  Then I go to BPD
  And I click Tarjetas "Titanium"
  Then I print the benefits
  
    @EDGE
  Scenario: Beneficios de Titanium - EDGE
  When I open EDGE
  Then I go to BPD
  And I click Tarjetas "Titanium"
  Then I print the benefits
