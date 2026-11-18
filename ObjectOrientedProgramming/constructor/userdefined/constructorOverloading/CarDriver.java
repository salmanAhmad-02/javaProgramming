public class CarDriver {
    public static void main(String[] args) {
        
        Car c1 = new Car("City", 400, 12);

        Car c2 = new Car("Scorpio", 340);

        Car c3 = new Car();

        Car c4 = new Car(600, "Harrier");

        Car c5 = new Car("Punch");

        Car c6 = new Car(400);

        //the overloading allows to create the object in multiple ways.


        System.err.println(c1.getDetails());
        System.err.println(c2.getDetails());
        System.err.println(c3.getDetails());
        System.err.println(c4.getDetails());
        System.err.println(c5.getDetails());
        System.err.println(c6.getDetails());

    }
}
