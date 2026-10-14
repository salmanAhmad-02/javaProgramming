class VehicleDriver{
    public static void main(String[] args){
        Vehicle v1=new Vehicle("Truck", 30);
        Vehicle v2=new Vehicle("Bike", 25);
        Vehicle v3=new Vehicle("Auto", 8);
        Vehicle v4=new Vehicle("Car", 20);

        v1.travel();
        v2.travel();
        v3.travel();
        v4.travel();

        // here the problem is every Vehicle being paused any other one travelling.
        // We will fix and not let them wait for other to complete travel() by multithreading. 
    }
}