import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by jessedavila on 11/21/16.
 */
public class LuckyColor {

    public static void main(String[] args) {
        double totalCost;

        DecimalFormat df = new DecimalFormat("###0.00");
        Scanner input = new Scanner(System.in);

        System.out.println("How much?");
        totalCost = input.nextDouble();
        System.out.println("Today you get a green discount...");
        totalCost = totalCost - Colors.GREEN.applyDiscount(totalCost);
        System.out.println("total: $" + df.format(totalCost));
    }
}
