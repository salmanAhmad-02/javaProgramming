import java.time.LocalDate;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", LocalDate.of(2002, 11, 29), "B.tech" );
        Student s2 = new Student("Saif", LocalDate.of(1999, 4, 3), "M.Sc" );
        Student s3 = new Student("James", LocalDate.of(2006, 7, 20), "B.tech" );
        Student s4 = new Student("Smith", LocalDate.of(2002, 2, 23), "MCA" );

        System.out.println(s1.getDetails());
        System.out.println(s2.getDetails());
        System.out.println(s3.getDetails());
        System.out.println(s4.getDetails());
    }
}
