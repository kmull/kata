package pl.kmull.projekt.kmullpierwszy.dao;

import pl.kmull.projekt.kmullpierwszy.domain.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UserRepositoryDao {

    void addUser(User user);

    User getUserById(int id);

    User getUserByLogin(String login);

    List<User> getUsersList();

}
