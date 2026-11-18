public class Car {

    String name;
    double hp;
    double stroke;
    
// Constructor chaining means calling one constructor from another constructor.
// To invoke a parent class constructor, use super().
// To invoke another constructor of the same class, use this().

    public Car(){}

   
    public Car(String name){
        this.name = name;
    }
    
    
    public Car(double hp){
        this.hp = hp;
    }

    // Constructor chaining using this() to avoid repeating initialization code.
    public Car(String name, double hp){
        this(name);
        this.hp = hp;
    }

    // Constructor chaining by delegating to another constructor.
    public Car(double hp, String name){
        this(name,hp);
    }

    // Reuses the existing constructor to initialize name and hp,
    // avoiding duplicate initialization code.
    public Car(String name, double hp, double stroke){
        this(name,hp);
        this.stroke = stroke;
    }

    public String getDetails(){
        return "Name : "+name+"\tHP : "+hp+"\tStrokes : "+stroke+" mm";
    }
}
