package a.tmp.cwiczenia.builder1;

public class User {

    private int id;
    private String name;

    private String surname;
    private Gender gender;
    private int age;

    public User(UserBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.gender = builder.gender;
        this.age = builder.age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final class UserBuilder {
        private int id;
        private String name;

        private String surname;
        private Gender gender;
        private int age;

        public UserBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public UserBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
