package pl.kmull.projekt.kmullpierwszy.dao;

import pl.kmull.projekt.kmullpierwszy.domain.User;
import pl.kmull.projekt.kmullpierwszy.repository.UsersRepository;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class UserRepositoryDaoBean implements UserRepositoryDao {
    @Override
    public void addUser(User user) {
        UsersRepository.getRepository().add(user);
    }

    @Override
    public User getUserById(int id) {
        List<User> userList = UsersRepository.getRepository();
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        List<User> userList = UsersRepository.getRepository();
        for (User user : userList) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getUsersList() {
        return UsersRepository.getRepository();
    }
}
