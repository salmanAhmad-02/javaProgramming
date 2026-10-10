class CuboidDriver{
    public static void main(String[] args){
        Cuboid cb1=new Cuboid(12, 10, 4);
        cb1.printAllDetails();

        cb1.setDetails(18, 6, 8);
        cb1.printAllDetails();
    }
}