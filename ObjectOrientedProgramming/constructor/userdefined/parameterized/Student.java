public class Student {

    String name;
    int age;

    public Student(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getDetails(){
        return "Name : "+name+"\tAge : "+age;
    }
}
