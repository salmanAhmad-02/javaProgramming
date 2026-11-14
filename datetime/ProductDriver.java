import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class ProductDriver {
    public static void main(String[] args) {
        Product faceWash1 = new Product("f101", "Acne Fight");
        Product cream1 = new Product("P101", "Safaya", "medicated", "manice", new BigDecimal(199.99), LocalDate.of(2026,10, 24), Period.ofMonths(18));

        System.out.println(cream1.getProductDetails());
        System.out.println("\n\n");
        System.out.println(faceWash1.getProductDetails());
    }
}
