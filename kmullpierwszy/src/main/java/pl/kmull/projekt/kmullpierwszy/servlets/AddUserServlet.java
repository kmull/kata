package pl.kmull.projekt.kmullpierwszy.servlets;


import pl.kmull.projekt.kmullpierwszy.dao.MaxPulseDao;
import pl.kmull.projekt.kmullpierwszy.dao.UserRepositoryDao;
import pl.kmull.projekt.kmullpierwszy.domain.Gender;
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
import java.time.LocalDateTime;
import java.util.List;

@WebServlet("/add-servlet")
public class AddUserServlet extends HttpServlet {

    @EJB
    UserRepositoryDao userRepositoryDao;

    @EJB
    MaxPulseDao maxPulseDao;

    private void giveResponse(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");

        String stringId;
        String name = null;
        String surname = null;
        String login = null;
        String stringAge;
        String stringGender = null;
        int id = 0;
        int age = 0;

        try {
            stringId = req.getParameter("id");
            name = req.getParameter("name");
            surname = req.getParameter("surname");
            login = req.getParameter("login");
            stringAge = req.getParameter("age");
            stringGender = req.getParameter("gender").toUpperCase();

            id = Integer.parseInt(stringId);
            age = Integer.parseInt(stringAge);
        } catch (NullPointerException e) {
//            writer.println("blad nr: " + HttpServletResponse.SC_BAD_REQUEST +
//                    " - Wprowadzone dane sa niekompletne lub bledne");

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(req, resp);
            return;
        } catch (NumberFormatException e) {
            id = 0;
            age = 0;
        }

        List<User> myUser = userRepositoryDao.getUsersList();

        if ((age > 0) && (age < 120) && (id > 0)) {
            for (User tmpUser : myUser) {
                if (tmpUser.getId() == id) {
                    writer.println("blad nr: " + HttpServletResponse.SC_CONFLICT +
                            " - W systemie istnieje juz uzytkownik o tym numerze id");
                    return;
                }
            }
            User user = new User();
            user.setId(id);
            user.setName(name);
            user.setSurname(surname);
            user.setLogin(login);
            user.setAge(age);

            if (!stringGender.equals("WOMAN")) {
                user.setGender(Gender.MAN);
            } else {
                user.setGender(Gender.WOMAN);
            }

            userRepositoryDao.addUser(user);

        } else {
            writer.println("blad nr: " + HttpServletResponse.SC_BAD_REQUEST +
                    " - Wprowadzone dane sa niekompletne lub bledne");
            return;
        }

        try {
            writer.println("<!DOCTYPE html><html><body>Lista osob w naszym repozytorium: " +
                    "<br/><br/>");
            for (User user1 : myUser) {
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
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        giveResponse(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        giveResponse(req, resp);
    }

}
