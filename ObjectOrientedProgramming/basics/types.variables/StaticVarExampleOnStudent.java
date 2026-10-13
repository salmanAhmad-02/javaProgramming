class StaticVarExampleOnStudent{
    static String universityName = "Cambridge University";
    String studentName;
    int studentAge;

    public StaticVarExampleOnStudent(String studentName, int studentAge){
        this.studentName=studentName;
        this.studentAge=studentAge;
    }
    public void displayStudentDetails(){
        System.out.println("\n");
        System.out.println("University : "+universityName);
        System.out.println("Name : "+studentName);
        System.out.println("Age : "+ studentAge);
    }
}