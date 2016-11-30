/**
 * Created by jessedavila on 11/30/16.
 */
import java.text.DecimalFormat;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String getFormattedCircumference() {
        return "Circumference is: " + formatNumber(getCircumference());
    }

    public double getArea() {
        return Math.PI * (radius*radius);
    }

    public String getFormattedArea() {
        return "Area is: " + formatNumber(getArea());
    }

    private String formatNumber(double x) {
        DecimalFormat f = new DecimalFormat("##.00");
        return f.format(x);
    }

    public static int getObjectCount() {
        return 0;
    }

}


