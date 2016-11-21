/**
 * Created by jessedavila on 11/21/16.
 */
public enum Colors {
    RED(0),
    BLUE(.1),
    YELLOW(.25),
    GREEN(.35),
    PURPLE(.5),
    PINK(1);

    private final double discountPercentage;

    Colors(double percentage) {
        this.discountPercentage = percentage;
    }

    public double applyDiscount(double payment) {
        return payment * this.discountPercentage;
    }
}
