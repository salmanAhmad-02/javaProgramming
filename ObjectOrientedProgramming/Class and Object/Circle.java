class Circle{
    private double radius;
    private static final double PI = 3.14159;
    public void setRadius(double r){
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getArea(){
        double area = PI * radius * radius;
        return area;
    }
    public double getCircumference(){
        return 2*PI*radius;
    }
    public void displayDetails(){
        System.out.println("Radius : "+getRadius());
        System.out.println("Diameter : "+getDiameter());
        System.out.println("Area : "+getArea());
        System.out.println("Circumference : "+getCircumference());
    }
}