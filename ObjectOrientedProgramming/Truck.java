class Truck extends Vehicle{
    private double power;
    private String fuelType;
    private double loadCapacity;
    public Truck(String brand, String vehicleName, String vehicleCategory, double power, String fuelType, double loadCapacity){
        super(brand, vehicleName, vehicleCategory);  //for Vehicle class (Super Class)

        this.power = power;
        this.fuelType = fuelType;
        this.loadCapacity=loadCapacity;
    }
    public void displayTruckDetails() {
        displayVehicleDetails();
        System.out.println("Power: " + power);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Load Capacity: " + loadCapacity + " Tons");
    }
}