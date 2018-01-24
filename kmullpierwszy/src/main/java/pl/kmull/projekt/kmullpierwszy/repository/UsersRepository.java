package pl.kmull.projekt.kmullpierwszy.repository;

import pl.kmull.projekt.kmullpierwszy.domain.Gender;
import pl.kmull.projekt.kmullpierwszy.domain.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersRepository {
    private static List<User> usersRepository = new ArrayList<>();

//    public String myData() {
//        Date data = new Date();
//        SimpleDateFormat sp = new SimpleDateFormat("dd.MM.yy HH:mm");
//        return sp.format(data);
//    }


    public static List<User> getRepository() {
        if (usersRepository.size() == 0) {
            fillRepositoryWithDefaults();
        }
        return usersRepository;
    }

    private static void fillRepositoryWithDefaults() {
        User user1 = new User();
        user1.setId(1);
        user1.setName("Jan");
        user1.setSurname("Kowalski");
        user1.setLogin("janko");
        user1.setAge(21);
        user1.setGender(Gender.MAN);
        usersRepository.add(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setName("Adam");
        user2.setSurname("Nowak");
        user2.setLogin("ano");
        user2.setAge(20);
        user2.setGender(Gender.MAN);
        usersRepository.add(user2);

        User user3 = new User();
        user3.setId(3);
        user3.setName("Anna");
        user3.setSurname("Michalczuk");
        user3.setLogin("anmi");
        user3.setAge(20);
        user3.setGender(Gender.WOMAN);
        usersRepository.add(user3);
    }

}
