package nicebank;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AtmServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<html><head><title>Nice Bank ATM</title></head>" +
                "<body><h1>Welcome to our nice bank!</h1></body></html>" +
                "<body><form action=\"/withdraw\" method=\"post\">" +
                "<label for=\"amount\">Amount</label>" +
                "<input type=\"text\" id=\"amount\" name=\"amount\">" +
                "<button type=\"submit\" id=\"withdraw\">Withdraw</button>"
                + "</form></body></html>");
    }
}
