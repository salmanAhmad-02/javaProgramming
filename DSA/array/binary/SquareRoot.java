import java.util.Scanner;

public class SquareRoot {
    public static int mySqrt(int n) {
        if (n < 2) {
            return n;
        }
        int st = 1, end = n/2;
        int ans = 0;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid <= n / mid) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end; 
    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num=sc.nextInt();

        System.out.println("Square Root of : "+num+" is : "+mySqrt(num));
    }
}