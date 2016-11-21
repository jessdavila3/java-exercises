/**
 * Created by jessedavila on 11/21/16.
 */
public class Traffic {
    public enum TrafficLightColor {
        RED,
        GREEN,
        YELLOW;
    }

    public static void makeDrivingDecision(TrafficLightColor color) {
        if (color == TrafficLightColor.RED) {
            System.out.println("Don't move!");
        } else if (color == TrafficLightColor.GREEN) {
            System.out.println("Lets move!");
        } else if (color == TrafficLightColor.YELLOW) {
            System.out.println("Slow to a stop");
        }
    }

    public static void main(String[] args) {
        TrafficLightColor current = TrafficLightColor.GREEN;
        makeDrivingDecision(current);
    }
}
