class CircleDriver{
    public static void main(String[] args){

        StaticVariableExample circle1=new StaticVariableExample(5);

        // Accessing static variable from class refrence
        System.out.println("\nPi : "+StaticVariableExample.PI);


        System.out.println("\n======= Circle1 Details =======");

        // Accessing static variable from object refrence
        System.out.println("Pi : "+circle1.PI); 
        System.out.println("Area : "+circle1.getArea());
        System.out.println("Circumference : "+ circle1.getCircumference());      

        // more object creation ,
        StaticVariableExample circle2=new StaticVariableExample(8);

        System.out.println("\n======= Circle2 Details =======");
        System.out.println("Pi : "+circle2.PI); 
        System.out.println("Area : "+circle2.getArea());
        System.out.println("Circumference : "+ circle2.getCircumference()); 

        
        StaticVariableExample circle3=new StaticVariableExample(12.2);
        System.out.println("\n======= Circle3 Details =======");
        System.out.println("Pi : "+circle3.PI); 
        System.out.println("Area : "+circle3.getArea());
        System.out.println("Circumference : "+ circle3.getCircumference());
        
        //trying to update a static value ,
        // circle3.PI=2.45;
        // error: cannot assign a value to static final variable PI. (Compilation Error)
        // But in case of our static value is not final then we can assing or update that...
        // And assignment can be achived in both way like with class refrence and object refrence 
        
    }
}