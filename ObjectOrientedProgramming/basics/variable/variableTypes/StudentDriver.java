class StudentDriver{
    public static void main(String[] args){
        // Static variable acces via class Refrence 
        System.out.println("\nUniversity : "+StaticVarExampleOnStudent.universityName);

        StaticVarExampleOnStudent student1=new StaticVarExampleOnStudent("James" , 25);
        student1.displayStudentDetails();
    
        StaticVarExampleOnStudent student2=new StaticVarExampleOnStudent("Smith" , 24);
        student2.displayStudentDetails();

        //updating university name via object refrence
        student2.universityName = "Standford University";

        /* Can be updated through class refrence also - 
        StaticVarExampleOnStudent.universityName= "Standford University";
        */
        StaticVarExampleOnStudent student3=new StaticVarExampleOnStudent("Stokes" , 24);
        student3.displayStudentDetails();

        StaticVarExampleOnStudent student4=new StaticVarExampleOnStudent("Bob" , 22);
        student4.displayStudentDetails();
    }
}