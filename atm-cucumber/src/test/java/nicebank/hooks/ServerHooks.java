package nicebank.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import nicebank.AtmServer;
import support.KnowsMyDomain;

public class ServerHooks {

    public static final int PORT = 8887;
    private AtmServer server;
    private KnowsMyDomain helper;

    public ServerHooks(KnowsMyDomain helper) {
        this.helper = helper;
    }

    @Before
    public void startServer() throws Exception {
        server = new AtmServer(PORT, helper.getCashSlot(), helper.getMyAccount());
        server.start();
    }

    @After
    public void stopServer() throws Exception {
        server.stop();
    }
}
