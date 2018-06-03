package pl.wzorce.builder3;

public class Person {

    private int id;
    private String name;

    private String surname;
    private String height;

    public Person(PersonBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.height = builder.height;
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

    public String getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height.toString();
    }

    public static class PersonBuilder {
        private int id;
        private String name;

        private String surname;
        private String height;

        public PersonBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setHeight(Height height) {
            this.height = height.toString().toLowerCase();
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

enum Height {
    TALL,
    MEDIUM,
    SMALL

}
