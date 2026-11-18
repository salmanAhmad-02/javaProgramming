public class Car {

    String name;
    double hp;
    double stroke;
    
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

    
    // Copy constructor: Creates a new object by copying the fields of an existing object.
    public Car(Car r){
        // or used this way
        //this(r.name, r.hp, r.stroke); ,<- only when these type constructor is exist
        this.name = r.name;
        this.hp = r.hp;
        this.stroke = r.stroke;
    }

    public String getDetails(){
        return "Name : "+name+"\tHP : "+hp+"\tStrokes : "+stroke+" mm";
    }
}
