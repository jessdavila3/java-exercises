import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by jessedavila on 11/21/16.
 */
public class LuckyColor {
    public static void main(String[] args) {
        double totalCost,discount;

        DecimalFormat df = new DecimalFormat("###0.00");
        Scanner input = new Scanner(System.in);

        int random = (int) Math.ceil(Math.random() * 6);

        System.out.println("How much?");
        totalCost = input.nextDouble();
        if (random == 1) {
            discount = Colors.RED.applyDiscount(totalCost);
        } else if (random == 2) {
            discount = Colors.BLUE.applyDiscount(totalCost);
        } else if (random == 3) {
            discount = Colors.YELLOW.applyDiscount(totalCost);
        } else if (random == 4) {
            discount = Colors.GREEN.applyDiscount(totalCost);
        } else if (random == 5) {
            discount = Colors.PURPLE.applyDiscount(totalCost);
        } else if (random == 6) {
            discount = Colors.PINK.applyDiscount(totalCost);
        } else {
            discount = 0;
        }
        totalCost -= discount;
        System.out.println("total: $" + df.format(totalCost));

        input.close();
    }
}
