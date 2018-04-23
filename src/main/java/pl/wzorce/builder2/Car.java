package pl.wzorce.builder2;

public class Car {
    //    requierd
    private String make;
    private String model;
    //    optional
    private String fuel;
    private double capacity;
    private String color;

    public Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.fuel = builder.fuel;
        this.capacity = builder.capacity;
        this.color = builder.color;
    }

    public static class CarBuilder {

        //    requierd
        private String make;
        private String model;
        //    optional
        private String fuel;
        private double capacity;
        private String color;

        public CarBuilder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public CarBuilder setFuel(String fuel) {
            this.fuel = fuel;
            return this;
        }

        public CarBuilder setCapacity(double capacity) {
            this.capacity = capacity;
            return this;
        }

        public CarBuilder setColor(Enum color) {
            this.color = color.toString().toLowerCase();
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public void getCar() {
        System.out.println("make:\t" + make +
                "\nmodel:\t" + model +
                "\nfuel:\t" + fuel +
                "\ncapacity:\t" + capacity +
                "\ncolor:\t" + color);
    }
}
