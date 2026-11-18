public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("Innova", 250, 10);

        Car c2 = new Car(c1);

        System.out.println(c1.getDetails());
        System.out.println(c2.getDetails());
    }
}
