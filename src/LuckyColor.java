import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by jessedavila on 11/21/16.
 */
public class LuckyColor {

    public enum Colors {
        RED(0),
        BLUE(.1),
        YELLOW(.25),
        GREEN(.35),
        PURPLE(.5),
        PINK(1);

        private double discountPercentage;

        Colors(double percentage) {
            this.discountPercentage = percentage;
        }

        public double applyDiscount(double payment) {
            return payment * discountPercentage;
        }
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###0.00");
        double totalCost;
        Scanner input = new Scanner(System.in);
        System.out.println("How much?");
        totalCost = input.nextDouble();
        totalCost = totalCost - Colors.GREEN.applyDiscount(totalCost);
        System.out.println("total: $" + df.format(totalCost));
    }
}
