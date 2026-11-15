import java.time.LocalDate;

public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("MAH102", "Scorpio");
        Car c2 = new Car("MAT101", "Harrier", LocalDate.of(2025, 8, 24));

        System.out.println(c1.getCarDetails());
        System.err.println(c2.getCarDetails());
    }
}
