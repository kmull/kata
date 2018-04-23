package pl.wzorce.builder2;

public class MainClass {

    public static void main(String[] args) {

        Car car = new Car.CarBuilder("VWageg", "Golf")
                .setFuel("Diesel")
                .setCapacity(1.9)
                .setColor(EnumColor.GREEN)
                .build();

        car.getCar();
    }
}
