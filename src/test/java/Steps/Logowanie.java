package Steps;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;

public class Logowanie {
    WebDriver driver;
    @BeforeAll
    public void setDriver()        //musi byc metoda publiczna, nie zwracac wartosci

    @Given("Użytkownik otwiera przeglądarkę")
    public void testUzytkownikOtwieraPrzegladarke() {
        System.out.println("Użytkownik otworzył przeglądarkę");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\wituc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();//otwieranie przegladarki chrome
        driver.manage().window().maximize();//maksymalizacja okna

    }    //metoda testowa 1

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
        driver.close();
    }//metoda testowa 6

    @Then("Użytkownik niezostał poprawnie zalogowany")
    public void uzytkownikNiezostalPoprawnieZalogowany() {
        System.out.println("Użytkownik nie został poprawnie zalogowany");
        Assert.assertEquals("https://the-internet.herokuapp.com/login",driver.getCurrentUrl());
        driver.close();
    }

}
