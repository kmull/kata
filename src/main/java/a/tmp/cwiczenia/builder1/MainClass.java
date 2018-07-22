package a.tmp.cwiczenia.builder1;

public class MainClass {

    public static void main(String[] args) {

        User user = new User.UserBuilder(1, "Ala")
                .setSurname("Poznanska")
                .setGender(Gender.WOMAN)
                .setAge(24)
                .build();

        System.out.println(user.getId() + ". " +
                user.getName() + " " +
                user.getGender());
    }
}
