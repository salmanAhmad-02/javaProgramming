import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private LocalDate dateOfBirth;
    private String course;
    private final String university = "Example University";

    public Student(String name, LocalDate dateOfBirth, String course){
        setStudentDetails(name, dateOfBirth, course);
    }
    public void setStudentDetails(String name, LocalDate dateOfBirth, String course){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
    }
    public String getDetails(){

        return "Name : "+name+"\tAge: "+Period.between(dateOfBirth, LocalDate.now()).getYears()+"\tCorse : "+course+"\tUniversity : "+university;
    }
    /*  
        Period.between(dateOfBirth, LocalDate.now()).getYears()  - > Period.between(dateOfBirth, LocalDate.now()) ->
        this will give the positive diffrence like this 'P23Y11M15D' (P = positive ), the entered dateOfBirth is lesser to the current date 
        and we only wanted here to show the age in years so .getYears(), will prvide the years diference only , which will be used as age.
    */

}
