class MethodTypes{
/*
* Methods Can be of two types : 
*   (1) - No Argument Mehod 
*   (2) - Parameterized Method 
*/
    public static final double PI = 3.14159;
    private double radius;

    // No Argument Method
    public double getRadius(){
        return radius;
    }

    // No Argument Method : another example 
    public double getDiameter(){
        return 2*radius;
    }

    // No Argument Method : another example 
    public double getArea(){
        return PI * radius * radius;
    }
    // Parameterized Method  
    public void setRadius(double radius){
        this.radius = radius;
    }

    public static void main(String[] args){
        MethodTypes c1, c2, c3;

        c1 = new MethodTypes(); 
        c2 = new MethodTypes(); 
        c3 = new MethodTypes(); 

        c1.setRadius(5);
        c2.setRadius(10);
        c3.setRadius(20);


        System.out.println("\nFor Redius : "+c1.getRadius());
        System.out.println("Diameter : "+c1.getDiameter());
        System.out.println("Area is : "+c1.getArea());

        System.out.println("\nFor Redius : "+c2.getRadius());
        System.out.println("Diameter : "+c2.getDiameter());
        System.out.println("Area is : "+c2.getArea());

        System.out.println("\nFor Redius : "+c3.getRadius());
        System.out.println("Diameter : "+c3.getDiameter());
        System.out.println("Area is : "+c3.getArea());
    }   
}