import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//In Java numele clasei, prin conventie, trebuie sa fie denumit cu litere mari la inceput,
// de aceea, numele fisierului trebuie sa fie scris tot cu litera mare, pt ca numele fisierului trebuie sa fie identic cu numele

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:/Curs SDA/chromedriver_win32/chromedriver.exe" );
        // la linia 6 am spus sistemului unde sa gaseasca driverul
        WebDriver driver = new ChromeDriver();//Aici am creat un nou obiect al clasei chrome driver care se numeste driver si care are tipul de date webdriver.
        driver.get("https://formy-project.herokuapp.com/autocomplete");// aici am deschis linkul specificat intre paranteze
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));//aici identificam prin intermediul id-ului elementul textbox in care se poate pune// elementul identificat este salvat intr-o variabila numita autocomplete care
        autocomplete.sendKeys("strada lalelelor nr.5");
        Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div[2]/div/table/tr/td[2]/button")).click();


    /* -O variabila este o adresa de memorie la care sunt stocate informatii
       -O functie reprezinta un set de instructiuni grupate sub un singur nume
       -O clasa reprezinta un tipar care defineste atributele pe care le are un obiect si actiunulie pe care trebuie sa le faca
       - un obiect este o instanta a unei clase adica o reprezentare reala creata pe baza tiparului definita in clasa
       - un tip de data este o proprietate a unei variabile sau functii care specifica ce informatie poate fi stocata in variabila sau returnata de catre functie
       - putem spune ca o functie returneaza ceva, atunci cand trimite rezultatul actiunii pe care o face, catre exterior
     */


    }
}
