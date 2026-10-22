public class VehicleDriver {
    public static void main(String[] args) {
        Car car = new Car(
            "Honda",
            "Car",
            "Transport",
            119.35,
            "Petrol"
        );

        car.displayCarDetails();
        System.out.print("\n");

        Bike bike=new Bike(
            "Yamaha",
            "Bike",
            "Transport",
            300,
            "Petrol",
            2
        );
        bike.displayBikeDetails();
    }
}