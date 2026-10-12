class Bike extends Vehicle{
    private double power;
    private String fuelType;
    private static int seatingCapacity=2;

    public Bike(String brand, String vehicleName, String vehicleCategory, double power, String fuelType){
        super(brand, vehicleName, vehicleCategory);
        this.power=power;
        this.fuelType=fuelType;
    }
    public void displayBikeDetails(){
        displayVehicleDetails();
        System.out.println("Power: " + power);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seating Capacity: " + seatingCapacity + " Persons");
    }
}