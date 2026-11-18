public class Car {
    String name;
    double hp;
    double stroke;
    
    // No-argument constructor
    public Car(){}

   // Constructor overloading by changing the number of parameters 
    public Car(String name){
        this.name = name;
    }
    
    // Constructor overloading by changing the data type of parameters
    public Car(double hp){
        this.hp = hp;
    }

    // Constructor overloading by changing the number of parameters
    public Car(String name, double hp){
        this.name = name;
        this.hp = hp;
    }

    // Constructor overloading by changing the order (sequence) of parameter types
    public Car(double hp, String name){
        this.hp = hp;
        this.name = name;
    }

      // Constructor overloading by increasing (changing) the number of parameters 
    public Car(String name, double hp, double stroke){
        this.name = name;
        this.hp = hp;
        this.stroke = stroke;
    }
/*
    Ways to achieve constructor overloading  
        1. By Changing perameter size
        2. By Changing the data types of formal arguments
        3. By Changing the sequece of the types
*/

    public String getDetails(){
        return "Name : "+name+"\tHP : "+hp+"\tStrokes : "+stroke+" mm";
    }
}
