package Steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;

public class Logowanie {
    static WebDriver driver;
    @BeforeAll
    public static void setDriver() {
        System.out.println("Uruchomienie przed każdym scenariuszem testowym");
        driver = new ChromeDriver();    //otwieranie przegladarki chrome
        driver.manage().window().maximize();        //maksymalizacja okna

    }       //musi byc metoda publiczna, nie zwraca wartosci//
@Before
    public void before() {
        System.out.println("Hakuna matata");
    }

    @Given("Użytkownik otwiera przeglądarkę")
    public void testUzytkownikOtwieraPrzegladarke() {
        System.out.println("Użytkownik otworzył przeglądarkę");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\wituc\\Downloads\\chromedriver_win32\\chromedriver.exe");


    }    //metoda testowa 1
    @Given("Użytkownik podaje adres {string}")
    public void użytkownik_podaje_adres(String url) {
        driver.navigate().to(url);
    }

    @Given("Użytkownik podaje adres https:\\/\\/the-internet.herokuapp.com\\/login")
    public void użytkownik_podaje_adres_https_the_internet_herokuapp_com_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Użytkownik wpisuje adres strony internetowej");
        driver.navigate().to("https://the-internet.herokuapp.com/login"); //wpisywanie adresu strony w chromie
    }//metoda testowa 2

    @When("Użytkownik wpisuje poprawny username")
    public void użytkownik_wpisuje_poprawny_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Użytkownik wpisuje poprawny login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");//zlokalizuj okno username i wpisz aaa
    }//metoda testowa 3

    @When("Użytkownik wpisuje {string} w pole username")
    public void użytkownik_wpisuje_w_pole_username(String nazwaUzytkownika) {
        driver.findElement(By.id("username")).sendKeys(nazwaUzytkownika);
    }

    @When("Użytkownik wpisuje {string} w pole password")
    public void użytkownik_wpisuje_w_pole_password(String hasloUzytkownika) {
        driver.findElement(By.id("password")).sendKeys(hasloUzytkownika);
    }

    @When("Użytkownik wpisuje poprawne haslo")
    public void użytkownik_wpisuje_poprawne_haslo() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Użytkownik wpisuje poprawne hasło");
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("SuperSecretPassword!");
        //driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");//zlokalizuj okno password i wpisz hasło
    }//metoda testowa 4
    @When("Użytkownik wpisuje niepoprawne haslo")
    public  void uzytkownikWpisujeNiepoprawneHaslo(){
        System.out.println("Użytkownik wpisuje niepoprawne hasło");
        driver.findElement(By.id("password")).sendKeys("Ptaki_Latają_Kluczem");
    }
    @When("Użytkownik klika przycisk login")
    public void użytkownik_klika_przycisk_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Użytkownik klika przycisk login");
        driver.findElement(By.tagName("button")).click();
    }//metoda testowa 5

    @Then("Użytkownik został poprawnie zalogowany")
    public void użytkownik_został_poprawnie_zalogowany() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Użytkownik został poprawnie zalogowany");
        Assert.assertEquals("https://the-internet.herokuapp.com/secure",driver.getCurrentUrl());
        //driver.close();
    }//metoda testowa 6

    @Then("Użytkownik niezostał poprawnie zalogowany")
    public void uzytkownikNiezostalPoprawnieZalogowany() {
        System.out.println("Użytkownik nie został poprawnie zalogowany");
        Assert.assertEquals("https://the-internet.herokuapp.com/login",driver.getCurrentUrl());
        //driver.close();
    }
    @When("^Użytkownik wpisuje (.+) w pole username$")
    public void uytkownik_wpisuje_w_pole_username2(String nazwauzytkownika2)
    }

    @And("^Użytkownik wpisuje (.+) w pole password$")
    public void uytkownik_wpisuje_w_pole_password2(String haslo2)
}
        @AfterAll
    public static void tearDown(){
       driver.close();
}
}
