package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logowanie {
    WebDriver driver;

    @Given("Użytkownik otwiera przeglądarkę")
    public void testUzytkownikOtwieraPrzegladarke() {
        System.out.println("Użytkownik otworzył przeglądarkę");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\wituc\\Downloads\\chromedriver_win32\\chromedriver.exe");
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
        driver.findElement(By.id("username")).sendKeys("aaa");//zlokalizuj okno username i wpisz aaa
    }//metoda testowa 3

    @When("Użytkownik wpisuje poprawne haslo")
    public void użytkownik_wpisuje_poprawne_haslo() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Użytkownik wpisuje poprawne hasło");
        driver.findElement(By.id("password")).sendKeys("sss");//zlokalizuj okno password i wpisz sss

    }//metoda testowa 4

    @When("Użytkownik klika przycisk login")
    public void użytkownik_klika_przycisk_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Użytkownik klika przycisk login");
    }//metoda testowa 5

    @Then("Użytkownik został poprawnie zalogowany")
    public void użytkownik_został_poprawnie_zalogowany() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Użytkownik został poprawnie zalogowany");
    }//metoda testowa 6

}
