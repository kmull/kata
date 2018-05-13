package a.tmp.cwiczenia.builder;

public class Car {

    private String name;

    private String model;
    private int age;

    public Car(CarBuilder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public static class CarBuilder {

        private String name;

        private String model;
        private int age;

        public CarBuilder(String name) {
            this.name = name;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }
}
