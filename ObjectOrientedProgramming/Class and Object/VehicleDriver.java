class VehicleDriver{
    public static void main(String[] args){
        Vehicle v1=new Vehicle("Transport", "Car", "Tyota");
        v1.setCarDetails("Innova", 300, 4, "Petrol", 7);
        v1.printCarDetails();
        System.out.print("\n");

        Vehicle v2=new Vehicle("Loading", "Truck", "TATA");
        v2.setTruckDetails("Ahsok Leyland", 320 , 124 , "Diesel", 22 );
        v2.printTruckDetails();
    }
}