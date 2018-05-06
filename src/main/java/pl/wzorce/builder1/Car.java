package pl.wzorce.builder1;

public class Car {
    private String make;
    private String model;

    private String owner;
    private int year;
    private Color color;

    public Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.owner = builder.owner;
        this.year = builder.year;
        this.color = builder.color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public static class CarBuilder {
        private String make;
        private String model;

        private String owner;
        private int year;
        private Color color;

        public CarBuilder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public CarBuilder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

enum Color {
    WHITE,
    BLACK,
    RED,
    BLUE,
    YELLOW,
    GREEN
}