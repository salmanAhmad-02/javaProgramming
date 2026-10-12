class Car extends Vehicle{
    private double power;
    private String fuelType;
    public Car(String brand, String vehicleName, String vehicleCategory, double power, String fuelType){
        super(brand, vehicleName, vehicleCategory);  //for Vehicle class (Super Class)

        this.power = power;
        this.fuelType = fuelType;
    }
    public void displayCarDetails() {
        displayVehicleDetails();
        System.out.println("Power: " + power);
        System.out.println("Fuel Type: " + fuelType);
    }
}