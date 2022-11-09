package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//klasa runwith

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/",//lokalizacja paczki ze scenariuszami
        glue = "Steps",//zadanie ścieżki lokalizacji klasy, gdzie testy są napisane
        tags = "@now"   //uruchomienie otagowanego scenariusza w logowanie.feature
)

public class TestRunner {

}
