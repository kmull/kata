package paczka.nauka.builder;

public class Person {
    // required
    private String name;
    private String surname;
    private Gender gender;
    // optional
    private int age;
    private String pesel;

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.gender = builder.gender;
        this.age = builder.age;
        this.pesel = builder.pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        if (gender.equals(null)) {
            return Gender.NOT_DEFINED;
        }
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    public static class PersonBuilder {
        // required
        private String name;
        private String surname;
        private Gender gender;
        // optional
        private int age;
        private String pesel;

        public PersonBuilder(String name, String surname, Gender gender) {
            this.name = name;
            this.surname = surname;
            this.gender = gender;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setPesel(String pesel) {
            this.pesel = pesel;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
