class CylinderDriver{
    public static void main(String[] args){
        Cylinder c1=new Cylinder(5, 12);

        c1.printDetails();
        c1.setDetails(9.5,15.0);
        c1.printDetails();
    }
}