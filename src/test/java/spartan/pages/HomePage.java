package spartan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spartan.utilities.Driver;

import java.util.List;

public class HomePage extends BasePage{

    public WebElement getSpartan(String id){
        return Driver.get().findElement(By.xpath("//tbody//tr//td[.='"+id+"']/../td[5]"));
    }

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> allSpartans;

    @FindBy(xpath = "//tbody//tr//td[1]")
    public List<WebElement> allSpartanIDs;



}
