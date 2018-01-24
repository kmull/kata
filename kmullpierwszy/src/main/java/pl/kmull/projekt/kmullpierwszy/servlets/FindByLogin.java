package pl.kmull.projekt.kmullpierwszy.servlets;

import pl.kmull.projekt.kmullpierwszy.dao.MaxPulseDao;
import pl.kmull.projekt.kmullpierwszy.dao.UserRepositoryDao;
import pl.kmull.projekt.kmullpierwszy.domain.User;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("find-by-login")
public class FindByLogin extends HttpServlet {

    @EJB
    UserRepositoryDao userRepositoryDao;

    @EJB
    MaxPulseDao maxPulseDao;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");

        User user = null;
        String login = req.getParameter("login");

        for (User userTmp : userRepositoryDao.getUsersList()) {
            if (userTmp.getLogin().equals(login)) {
                user = userTmp;
            }
        }

        try {
            writer.println("<!DOCTYPE html><html><body>" +
                    "<br/><br/> imie: " + user.getName() + "<br/>" +
                    "nazwisko: " + user.getSurname() + "<br/>" +
                    "login: " + user.getLogin() + "<br/>" +
                    "wiek: " + user.getAge() +
                    " id: " + user.getId() + "<br/>" +
                    " plec: " + user.getGender() + "<br/>" +
                    " puls: " + maxPulseDao.maxPulse(user.getGender(), user.getAge()) +
                    "</body></html>");
        } catch (NullPointerException e) {
            writer.println("blad nie ma takiego loginu: " + HttpServletResponse.SC_BAD_REQUEST);
        }

    }

}
