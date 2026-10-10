class Cylinder{
    private double radius;
    private double height;
    private static final double PI=3.14159;

    public Cylinder(double radius, double height){
        if(radius <= 0 || height <= 0){
            throw new IllegalArgumentException("Dimensions Must Be Positive");
        }
        this.radius=radius;
        this.height=height;
    }
    public void setDetails(double radius, double height){
        if(radius <= 0 || height <= 0){
            throw new IllegalArgumentException("Dimensions Must Be Positive");
        }
        this.radius=radius;
        this.height=height;
    }
    public double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getHeight(){
        return height;
    }
    // Base Area
    public double getBaseArea(){
        return PI*radius*radius;
    }
    // Base Circumference
    public double getBaseCircumference(){
        return 2*PI*radius;
    }
    // Volume of Cylinder
    public double getVolume(){
        double volume=PI*(radius*radius)*height;
        return volume;
    }
    // Curved Surface Area (CSA)
    public double getCurvedSurfaceArea(){
        double area=2*PI*radius*height;
        return area;
    }
    // Total Surface Area (TSA) : 2πr(h+r)
    public double getTotalSurfaceArea(){
        double area= 2*PI*radius*(height+radius);
        return area;
    }
    // Sum of the two circular circumferences : 4πr
    public double getSumOfTwoCircularCircumferences(){
        return 2*getBaseCircumference();
    }
    // final Details method
    public void printDetails(){
        System.out.print("\n");
        System.out.println("Radius : "+getRadius());
        System.out.println("Height : "+getHeight());
        System.out.println("Diameter : "+getDiameter());
        System.out.println("Volume : "+getVolume());
        System.out.println("Base Area : "+getBaseArea());
        System.out.println("Base Circumference : "+getBaseCircumference());
        System.out.println("Curved Surface Area : "+getCurvedSurfaceArea());
        System.out.println("Total Surface Area : "+getTotalSurfaceArea());
        System.out.println("Sum of Two Circular Circumference : "+getSumOfTwoCircularCircumferences());
    }
}