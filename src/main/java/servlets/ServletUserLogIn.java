package servlets;

import controller.UserController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletUserLogIn", urlPatterns = {"/ServletUserLogIn"})
public class ServletUserLogIn extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ServletUserLogIn() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserController user = new UserController();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String result = user.login(username, password);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }  

}
