class Cube{
    private double side;
    // Consrtuctor to create and intialize object
    public Cube(double s){
        side=s;
    }
    // setter to modify and re-use object
    public void setSide(double side){
        this.side=side;
    }
    public double getSide(){
        return side;
    }
    public double getVolume(){
        return side*side*side;
    }
    public double getTotalSurfaceArea(){
        return 6*(side*side);
    }
    public double getLateralSurfaceArea(){
        return 4*(side*side);
    }
    public void printCubeDetails(){
        System.out.println("Side : "+getSide());
        System.out.println("Volume : "+getVolume());
        System.out.println("Total Surface Area : "+getTotalSurfaceArea());
        System.out.println("Lateral Surface Area : "+getLateralSurfaceArea());
    }
}