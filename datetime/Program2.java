import java.time.LocalTime;

public class Program2 {
    // LocalTime class to with time related operations
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();

        System.out.println("At run-time : "+currentTime.getHour()+":"+currentTime.getMinute()+":"+currentTime.getSecond());

        LocalTime customTime = LocalTime.of(21, 43, 45);

        System.out.println("At the writing of this line , Time : "+customTime);

    }
}
