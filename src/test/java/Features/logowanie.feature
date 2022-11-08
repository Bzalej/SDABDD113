Feature: Logowanie do aplikacji

  Jako użytkownik chcę mieć możliwość zalogowania
  do aplikacji móc korzystać z zaawansowanych
  funkcji systemu

  Scenario: Poprawne logowanie do aplikacji
    Given Użytkownik otwiera przeglądarkę
      And Użytkownik podaje adres https://the-internet.herokuapp.com/login
    When Użytkownik wpisuje poprawny username
      And Użytkownik wpisuje poprawne haslo
      And Użytkownik klika przycisk login
    Then Użytkownik został poprawnie zalogowany
    #komentarze robimy poprzez hasz i tekst :)
    #given=preconditions(warunki poczatkowe)
    #When=kroki
    #then=sprawdzenie