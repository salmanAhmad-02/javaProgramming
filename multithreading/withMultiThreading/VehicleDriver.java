class VehicleDriver{
    public static void main(String[] args){
        System.out.println("========= Main Strats ==========");

        Vehicle v1=new Vehicle("Truck", 30);
        Vehicle v2=new Vehicle("Bike", 25);
        Vehicle v3=new Vehicle("Auto", 8);
        Vehicle v4=new Vehicle("Car", 20);

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        System.out.println("========= Main Ends ==========");
    }
}