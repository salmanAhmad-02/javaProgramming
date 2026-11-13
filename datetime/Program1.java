import java.time.LocalDate;

public class Program1{
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        
        System.out.println("Current Date : "+d1.getDayOfMonth()+"/"+d1.getMonthValue()+"/"+d1.getYear());

        LocalDate doj = LocalDate.of(2025,11,28);

        System.out.println("Joing Date : "+doj.getDayOfMonth()+"/"+doj.getMonthValue()+"/"+doj.getYear());
    }
}