package san.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddingServlet extends HttpServlet
{

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Servet is initilized");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("Service method Called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println("Get method is called to call add.jsp");
        resp.sendRedirect("add.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("Post method is called");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Finally destroy is called"); //when tomcat is closed..
    }
}
