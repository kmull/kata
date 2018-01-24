package pl.kmull.projekt.kmullpierwszy.servlets;

import pl.kmull.projekt.kmullpierwszy.dao.MaxPulseDao;
import pl.kmull.projekt.kmullpierwszy.dao.UserRepositoryDao;
import pl.kmull.projekt.kmullpierwszy.domain.User;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/statistics")
public class StatisticServlet extends HttpServlet {

    @EJB
    UserRepositoryDao userRepositoryDao;

    @EJB
    MaxPulseDao maxPulseDao;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");

        try {
            writer.println("<!DOCTYPE html><html><body>Lista osob w naszym repozytorium: " +
                    "<br/><br/>");
            for (User user1 : userRepositoryDao.getUsersList()) {
                writer.println("imie: " + user1.getName() + "<br/>" +
                        "nazwisko: " + user1.getSurname() + "<br/>" +
                        "login: " + user1.getLogin() + "<br/>" +
                        "wiek: " + user1.getAge() +
                        " id: " + user1.getId() + "<br/>" +
                        " plec: " + user1.getGender() + "<br/>" +
                        " puls: " + maxPulseDao.maxPulse(user1.getGender(), user1.getAge()) +
                        "<br/><br/>");
            }
            writer.println("</body></html>");
        } catch (NullPointerException e) {
            writer.println("blad nr: " + HttpServletResponse.SC_BAD_REQUEST +
                    " - Wprowadzone dane sa niekompletne lub bledne");
            return;
        }

        Map<Integer, User> myMap = new HashMap<>();
        for (User user : userRepositoryDao.getUsersList()) {
            myMap.put(user.getId(), user);
        }
        req.setAttribute("elements" , myMap);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/users-list.jsp");
        requestDispatcher.forward(req, resp);
    }
}
