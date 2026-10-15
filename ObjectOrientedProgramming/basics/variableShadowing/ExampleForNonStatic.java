class ExampleForNonStatic{
    int age;
    public void printAge(){
        int age=28;
        System.out.println("Age is : "+age);    // op = 28 

        // to resolve that we use a special keyword 'this' , 'this' will get the refrence form the object refrence
        // variable and refer exact same object for thet it been used. e.g :
        System.out.println("refernce or address of the object by this : "+ this);
        System.out.println("instance Age is "+this.age);
    }
    public static void main(){
        ExampleForNonStatic person1 = new ExampleForNonStatic();
        ExampleForNonStatic person2 = new ExampleForNonStatic();
        ExampleForNonStatic person3 = new ExampleForNonStatic();

        person1.age = 23;
        person2.age = 21;
        person3.age = 32;

        person1.printAge();  //getting shadowing result as local
        System.out.println("In main by variable : "+person1);    
        //just for validation the 'person1' and 'this' have exact same refrence of object

        /*Output , refrence matched : 
            instance Age is 23
            refernce or address of the object by this : ExampleForNonStatic@146044d7
            In main by variable : ExampleForNonStatic@146044d7
        */
    }
}