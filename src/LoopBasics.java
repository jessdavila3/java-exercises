/**
 * Created by jessedavila on 11/14/16.
 */
public class LoopBasics {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        for (int num = 100; num >= -10; num-=5) {
            System.out.println(num);
        }

        for (long squareNum = 2; squareNum <= 1000000; squareNum = squareNum * squareNum) {
            System.out.println(squareNum);
        }
    }
}