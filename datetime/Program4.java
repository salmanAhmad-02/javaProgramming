import java.time.LocalDate;
import java.time.Period;

public class Program4 {
    public static void main(String[] args) {

        LocalDate dob1 = LocalDate.of(2003,11,24);
        LocalDate dob2 = LocalDate.of(2002,1, 12);


        Period p1 = Period.between(dob1, dob2);

        if(p1.isNegative()){
            System.out.println("Age Gap in Minus : "+p1.getYears()+" years");
        }
        else{
            System.out.println("Age Gap"+p1.getYears()+" years");
        }
    }
}
