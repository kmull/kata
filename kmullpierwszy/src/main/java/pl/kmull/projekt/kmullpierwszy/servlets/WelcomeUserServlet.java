package pl.kmull.projekt.kmullpierwszy.servlets;

import pl.kmull.projekt.kmullpierwszy.dao.UserRepositoryDao;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome-user")
public class WelcomeUserServlet extends HttpServlet {

    @EJB
    UserRepositoryDao userRepositoryDao;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        String setParameterName = req.getParameter("name");

        req.setAttribute("name", req.getParameter("name"));
        req.getSession().setAttribute("sessionName", req.getAttribute("name"));

        req.setAttribute("salaryAtribut", req.getParameter("salary"));
        req.getSession().setAttribute("salarySession", req.getParameter("salary"));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/welcome-user.jsp");
        requestDispatcher.forward(req, resp);


    }
}
