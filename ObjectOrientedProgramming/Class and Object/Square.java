class Square{
    private double side;

    public void setSide(double s){
        side=s;
    }
    public double getSide(){
        return side;
    }
    public double getArea(){
        return side*side;
    }
    public double getParimeter(){
        return 4*side;
    }
    public void printAllDetails(){
        System.out.println("Side : "+getSide());
        System.out.println("Area : "+getArea());
        System.out.println("Parimeter : "+getParimeter());
    }
}