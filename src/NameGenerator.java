/**
 * Created by jessedavila on 11/22/16.
 */
public class NameGenerator {
    public static void main(String[] args) {
        String serverName = adjectiveGen(randomizer()) +" " +nounGen(randomizer());
        System.out.println("Server name is: " + serverName);
    }
    public static String adjectiveGen(int rand) {
        String[] adjectives = {"Quirky", "Funny", "Silly", "Slow", "Helpful", "Enlightened", "Hateful", "Cursed", "Hungry", "Damned"};
        return adjectives[rand];
    }

    public static String nounGen(int rand) {
        String[] nouns = {"Rabbit", "Snake", "Bear", "Tiger", "Bunny", "Hand", "Leg", "Head", "Arm", "Foot"};
        return nouns[rand];
    }

    public static int randomizer() {
        return (int) Math.ceil(Math.random() * 10);
    }
}
