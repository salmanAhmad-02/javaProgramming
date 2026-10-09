class CubeDriver{
    public static void main(String[] aegs){
        // Creating object and initializing value via constroctor
        Cube c1=new Cube(5);
        c1.printCubeDetails();
        System.out.println("\n");

        // modifying and using same object with other value
        c1.setSide(10);
        c1.printCubeDetails();
    }
}