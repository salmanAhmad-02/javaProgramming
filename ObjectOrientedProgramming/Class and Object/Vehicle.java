class Vehicle{
    private String vehicleCategory; //it either Loading , Tansport
    private String vehicleName; //like car or bus bike , trick pickup
    private String brand;   //modeling company like Honda, Hundai, Tyota , Tata , Suzuki, etc
    public Vehicle(String vehicleCategory,String vehicleName, String brand){
        this.vehicleCategory=vehicleCategory;
        this.vehicleName=vehicleName;
        this.brand=brand;
    }
    public void setVehicleDetails(String vehicleCategory,String vehicleName, String brand){
        this.vehicleCategory=vehicleCategory;
        this.vehicleName=vehicleName;
        this.brand=brand;
    }
    // I don't find this as good approach , so we will move to inheritance and polymorphism very soon....
    String model;
    double power;
    int  stroke;
    String fuelType;
    private int seatCapacity;
    public void setCarDetails(String model, double power, int stroke, String fuelType, int seatCapacity) {
        if (vehicleName.equalsIgnoreCase("Car")) {
            this.model=model;
            this.power=power;
            this.stroke=stroke;
            this.fuelType=fuelType;
            this.seatCapacity=seatCapacity;
        }
    }
    public void printCarDetails(){
        System.out.println("Brnad Name : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Power : "+power+"HP");
        System.out.println("Stroke : "+stroke+" mm");
        System.out.println("Fuel Type : "+fuelType);
        System.out.println(seatCapacity+" Seater ");
    }
    public void setBikeDetails(String model, double power, int stroke, String fuelType) {
        if (vehicleName.equalsIgnoreCase("Bike")) {
            this.model = model;
            this.power = power;
            this.stroke = stroke;
            this.fuelType = fuelType;
            this.seatCapacity=2;
        }
    }
    public void printBikeDetails() {
        System.out.println("Brand Name : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Power : " + power + " HP");
        System.out.println("Stroke : " + stroke + " mm");
        System.out.println("Fuel Type : " + fuelType);
        System.out.println(seatCapacity+" Seating Max Allowed  ");
    }
    public void setBusDetails(String model, double power, int stroke, String fuelType, int seatCapacity) {
        if (vehicleName.equalsIgnoreCase("Bus")) {
            this.model = model;
            this.power = power;
            this.stroke = stroke;
            this.fuelType = fuelType;
            this.seatCapacity=seatCapacity;
        }
    }
    public void printBusDetails() {
        System.out.println("Brand Name : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Power : " + power + " HP");
        System.out.println("Stroke : " + stroke + " mm");
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Max Seat Capacity : "+seatCapacity);
    }
    private double loadCapacity;
    public void setTruckDetails(String model, double power, int stroke, String fuelType, double loadCapacity) {
        if (vehicleName.equalsIgnoreCase("Truck")) {
            this.model = model;
            this.power = power;
            this.stroke = stroke;
            this.fuelType = fuelType;
            this.loadCapacity=loadCapacity;
        }
    }
    public void printTruckDetails() {
        System.out.println("Brand Name : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Power : " + power + " HP");
        System.out.println("Stroke : " + stroke + " mm");
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Max Load Capacity : "+loadCapacity+" Ton");
    }
    public void setPickupDetails(String model, double power, int stroke, String fuelType) {
        if (vehicleName.equalsIgnoreCase("Pickup")) {
            this.model = model;
            this.power = power;
            this.stroke = stroke;
            this.fuelType = fuelType;
            this.loadCapacity=loadCapacity;
        }
    }
    public void printPickupDetails() {
        System.out.println("Brand Name : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Power : " + power + " HP");
        System.out.println("Stroke : " + stroke + " mm");
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Max Load Capacity : "+loadCapacity+" Quintels ");
    }
}