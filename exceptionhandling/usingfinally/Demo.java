package usingfinally;

public class Demo{
    static void demo(int y) {
        try {
            System.out.println("try: start");
            int r = 10 / y;
            System.out.println("try: result " + r);
        } catch (ArithmeticException e) {
            System.out.println("catch: " + e.getMessage());
        } finally {
            System.out.println("finally: always runs");
        }
        System.out.println("after");
    }
    public static void main(String[] args) {
        demo(0);
    }
}
