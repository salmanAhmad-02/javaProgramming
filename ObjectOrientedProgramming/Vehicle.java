class Vehicle {
    private String brand;
    private String vehicleName;
    private String vehicleCategory;

    public Vehicle(String brand, String vehicleName, String vehicleCategory) {
        this.brand = brand;
        this.vehicleName = vehicleName;
        this.vehicleCategory = vehicleCategory;
    }

    public void displayVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Category: " + vehicleCategory);
    }
}