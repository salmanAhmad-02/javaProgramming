class Bike extends Vehicle{
    private double power;
    private String fuelType;
    private int seatingCapacity;

    public Bike(String brand, String vehicleName, String vehicleCategory, double power, String fuelType, int seatingCapacity){
        super(brand, vehicleName, vehicleCategory);
        this.power=power;
        this.fuelType=fuelType;
        // Preventing user to enter bike seating capacity more than legal Allowence.
        if(seatingCapacity != 1 && seatingCapacity != 2){
            throw new IllegalArgumentException("Bike Seating Capacity Must Be Either 1 or 2");
        }
        this.seatingCapacity=seatingCapacity;
    }
    public void displayBikeDetails(){
        displayVehicleDetails();
        System.out.println("Power: " + power);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seating Capacity: " + seatingCapacity + " Persons");
    }
}