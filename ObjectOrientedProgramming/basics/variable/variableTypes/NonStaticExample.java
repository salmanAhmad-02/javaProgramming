class NonStaticExample{
    String name;
    double height;
    double weight;
    
    NonStaticExample(String name, double height, double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    public void printDetails(){
        System.out.print("\n");
        System.out.println(name+" details.");
        System.out.println("Height : "+height);
        System.out.println("Weight : "+weight);
    }
    public static void main(String[] args){
        NonStaticExample p1=new NonStaticExample("Mosn", 5.6, 60);
        NonStaticExample p2=new NonStaticExample("Ahmd", 5.9, 55.5);

        p1.printDetails();
        p2.printDetails();
    }
}