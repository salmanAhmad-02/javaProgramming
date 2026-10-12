class Bus extends Vehicle{
    private double power;
    private String fuelType;
    private int seatingCapacity;
    public Bus(String brand, String vehicleName, String vehicleCategory, double power, String fuelType, int seatingCapacity){
        super(brand, vehicleName, vehicleCategory);  //for Vehicle class (Super Class)

        this.power = power;
        this.fuelType = fuelType;
        this.seatingCapacity=seatingCapacity;
    }
    public void displayBusDetails() {
        displayVehicleDetails();
        System.out.println("Power: " + power);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seating Capacity: " + seatingCapacity + " Persons");
    }
}