package support;

import nicebank.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class KnowsMyDomain {
    private Account myAccount;
    private Teller teller;
    private CashSlot cashSlot;
    private WebDriver webDriver;

    public Account getMyAccount() {
        if (myAccount == null)
            myAccount = new Account();
        return myAccount;
    }

    public Teller getTeller() {
        if (teller == null)
            teller = new AtmUserInterface();
        return teller;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null)
            cashSlot = new CashSlot();
        return cashSlot;
    }

    public WebDriver getWebDriver() {
        if(webDriver == null)
            webDriver = new FirefoxDriver();
        return webDriver;
    }
}