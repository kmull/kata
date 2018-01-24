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

@WebServlet("/find-by-id")
public class FindUserByIdServlet extends HttpServlet {

    @EJB
    UserRepositoryDao userRepositoryDao;

    @EJB
    MaxPulseDao maxPulseDao;

    private void giveResponse(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");

        String sId = null;
        int id = 0;

        try {
            sId = req.getParameter("id");
            id = Integer.parseInt(sId);
        } catch (NumberFormatException e) {
            writer.println("blad nie ma takiego id: " + HttpServletResponse.SC_BAD_REQUEST);
        } catch (NullPointerException e) {
            writer.println("blad nie ma takiego id: " + HttpServletResponse.SC_BAD_REQUEST);
        }

        User user = null;

        for (User userTmp : userRepositoryDao.getUsersList()) {
            if (userTmp.getId() == id) {
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

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        giveResponse(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        giveResponse(req, resp);
    }
}
