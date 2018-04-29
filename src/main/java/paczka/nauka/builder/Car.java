package paczka.nauka.builder;

public class Car {
    // required
    private String make;
    private String model;
    private int year;
    // optional
    private FuelEnum fuelEnum;

    public Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.fuelEnum = builder.fuelEnum;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public FuelEnum getFuelEnum() {
        return fuelEnum;
    }

    public static class CarBuilder {
        // required
        private String make;
        private String model;
        private int year;
        // optional
        private FuelEnum fuelEnum;

        public CarBuilder(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public CarBuilder setFuel(FuelEnum fuel) {
            this.fuelEnum = fuel;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
