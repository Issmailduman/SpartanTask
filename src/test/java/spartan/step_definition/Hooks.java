package spartan.step_definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import spartan.utilities.DBUtils;

public class Hooks {

    @Before("@db")
    public void setUpdb(){
        System.out.println("\tConnecting to database...");
        DBUtils.createConnection();
    }

    @After("@db")
    public void closeDb(){
        System.out.println("\tDisconnecting to database...");
        DBUtils.destroy();
    }
}
