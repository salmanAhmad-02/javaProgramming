import java.time.LocalDateTime;
public class Program3 {
    //to work on both date and time 
    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();

        LocalDateTime t2 = LocalDateTime.of(2026,11,13,21,50,32);

        System.out.println(t1.getHour()+":"+t1.getMinute()+"\t"+t1.getMonthValue()+"/"+t1.getYear());
        System.out.println(t2.getHour()+":"+t2.getMinute()+":"+t2.getSecond()+"\t"+t2.getDayOfMonth()+"/"+t2.getMonthValue()+"/"+t2.getYear());
    }
    
}
