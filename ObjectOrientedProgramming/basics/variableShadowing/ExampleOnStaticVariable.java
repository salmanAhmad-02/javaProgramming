class ExampleOnStaticVariable{
    static int x=45;
    public static void test(){
        int x=10;
        System.out.println("Local X = "+x);   //this will give local x (10) and shadow the static x(45).

        // to resolve from shadowing the static variable , just refrence the static with it's class name. like below --
        System.out.println("Static X = "+ ExampleOnStaticVariable.x); // X = 45 
    }
    public static void main(String[] args){
        test();
    }
}