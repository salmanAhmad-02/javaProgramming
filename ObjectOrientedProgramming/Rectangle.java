class Rectangle{
    double length;
    double width;

    public void setDetails(double l, double w){
        length=l;
        width=w;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
    public void getAllDetails(){
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());

    }
}