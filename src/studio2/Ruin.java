import java.util.Scanner;
public class Ruin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your starting amount of money?");
        int startAmount = in.nextInt();
        System.out.println("What is your win chance?");
        double winChance = in.nextDouble();
        System.out.println("What is your win limit?");
        int winLimit = in.nextInt();
        System.out.println("How many days will you play?");
        int totalSimulations = in.nextInt();
        int daysPlayed = 0;
        while (totalSimulations >= daysPlayed) {
            int money = startAmount;
            int daysRuined = 0;
            while (startAmount < winLimit && startAmount > 0) {
                
                double chance = Math.random();
                if ( chance > winChance) {
                    System.out.println("You won!");
                    money++;
                } else {
                    System.out.println("You lost!");
                    money--;
                }
                if (money == winLimit) {
                    System.out.println("You win! You cannot play again.");
                    money = startAmount;
                } else if (money == 0) {
                    System.out.println("You lose! You cannot play anymore.");
                    money = startAmount;
                    daysRuined++;
                } else {
                    System.out.println("You have " + money + " left. Play again.");
                }
                
        }
        daysPlayed++;
        if (totalSimulations == daysPlayed) {
             System.out.println("You have a ruin rate of " + daysRuined/daysPlayed);
        }
        }
        
       
        



    }

}
