class SquareDriver{
    public static void main(String[] args){
        Square s1=new Square();
        Square s2=new Square();

        System.out.println("\n");
        s1.setSide(12);
        s1.printAllDetails();

        System.out.println("\n");
        s2.setSide(15.6);
        s2.printAllDetails();
    }
}