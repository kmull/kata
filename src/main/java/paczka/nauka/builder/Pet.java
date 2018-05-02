package paczka.nauka.builder;

public class Pet {

    private String name;
    private String owner;

    private String color;
    private int age;
    private boolean smallOrBig;

    public Pet(PetBuilder builder) {
        this.name = builder.name;
        this.owner = builder.owner;
        this.color = builder.color;
        this.age = builder.age;
        this.smallOrBig = builder.smallOrBig;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public boolean isSmallOrBig() {
        return smallOrBig;
    }

    public static class PetBuilder {
        private String name;
        private String owner;

        private String color;
        private int age;
        private boolean smallOrBig;

        public PetBuilder(String name, String owner) {
            this.name = name;
            this.owner = owner;
        }

        public PetBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PetBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PetBuilder setSmallOrBig(boolean smallOrBig) {
            this.smallOrBig = smallOrBig;
            return this;
        }

        public Pet build() {
            return new Pet(this);
        }

    }
}
