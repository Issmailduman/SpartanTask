package spartan.pages;

import org.openqa.selenium.support.PageFactory;
import spartan.utilities.Driver;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
}
