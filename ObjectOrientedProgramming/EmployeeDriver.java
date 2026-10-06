class EmployeeDriver{
    public static void main(String[] args){
        int x1=18;
        int x2=23;
        int x3=25;

        // Object Creation
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();

        // Object Initialization
        e1.name="Sahil";
        e1.id=121;
        e1.salary=25000.0;

        System.out.println(x1);     //18
        System.out.println(x2);     //23
        System.out.println(x3);     //25

        System.out.println(e1);     //Employee@SomeHexadecimalNumber
        System.out.println(e1.name);//Sahil
        System.out.println(e2);     //Employee@SomeHexadecimalNumber
        System.out.println(e3);     //Employee@SomeHexadecimalNumber
        System.out.println(e3.name);//null;  default value - null : object not initialized yet.
    }
}