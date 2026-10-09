class RectangleDriver{
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        r1.setDetails(12.3, 15.0);
        r1.getAllDetails();

        System.out.println("\n");
        
        Rectangle r2=new Rectangle();
        r2.setDetails(10, 21);
        r2.getAllDetails();
    }
}
