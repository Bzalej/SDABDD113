@feature:
Feature: Logowanie do aplikacji

  Jako użytkownik chcę mieć możliwość zalogowania
  do aplikacji móc korzystać z zaawansowanych
  funkcji systemu
@pc
  Scenario: Poprawne logowanie do aplikacji
    Given Użytkownik podaje adres https://the-internet.herokuapp.com/login
    When Użytkownik wpisuje poprawny username
      And Użytkownik wpisuje poprawne haslo
      And Użytkownik klika przycisk login
    Then Użytkownik został poprawnie zalogowany
    #komentarze robimy poprzez hasz i tekst :)
    #given=preconditions(warunki poczatkowe)
    #When=kroki
    #then=sprawdzenie
    #And=kolejne warunki, kroki rezultaty
@mobile @pc
  Scenario: Niepoprawne logowanie do aplikacji
    Given Użytkownik podaje adres https://the-internet.herokuapp.com/login
    When Użytkownik wpisuje poprawny username
    And Użytkownik wpisuje niepoprawne haslo
    And Użytkownik klika przycisk login
    Then Użytkownik niezostał poprawnie zalogowany
  Scenario: Poprawne logowanie do aplikacji (2 wersja)
    Given Użytkownik podaje adres "https://the-internet.herokuapp.com/login"
    When Użytkownik wpisuje "tomsmith" w pole username
    And Użytkownik wpisuje "SuperSecretPassword!" w pole password
    And Użytkownik klika przycisk login
    Then Użytkownik został poprawnie zalogowany

  @now
  Scenario: Niepoprawne logowanie do aplikacji (2wersja)
    Given Użytkownik podaje adres https://the-internet.herokuapp.com/login
    When Użytkownik wpisuje "tomsmith" w pole username
    And Użytkownik wpisuje "blablabla" w pole password
    And Użytkownik klika przycisk login
    Then Użytkownik nie został poprawnie zalogowany

  @now
  Scenario: Niepoprawne logowanie do aplikacji (3wersja)
    Given Użytkownik podaje adres https://the-internet.herokuapp.com/login
    When Użytkownik wpisuje "     " w pole username
    And Użytkownik wpisuje "     " w pole password
    And Użytkownik klika przycisk login
    Then Użytkownik nie został poprawnie zalogowany