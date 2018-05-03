package paczka.nauka.builder;

public class Cat {
    private String name;

    private ColorEnum color;
    private int age;

    public Cat(CatBuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public ColorEnum getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public static class CatBuilder {

        private String name;

        private ColorEnum color;
        private int age;

        public CatBuilder(String name) {
            this.name = name;
        }

        public CatBuilder setColor(ColorEnum color) {
            this.color = color;
            return this;
        }

        public CatBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Cat build() {
            return new Cat(this);
        }
    }
}
