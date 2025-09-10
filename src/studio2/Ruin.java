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
        int daysRuined = 0;
            while (totalSimulations > daysPlayed) {
                int money = startAmount;
                while ((startAmount < winLimit && startAmount > 0)&& (totalSimulations > daysPlayed)) { //these conditions were always true, had to readd initial while loop condition here
                    double chance = Math.random();
                    if ( chance > (1-winChance)) {
                        System.out.println("You won!");
                        money++;
                    } else {
                        System.out.println("You lost!");
                        money--;
                    }
                    if (money == winLimit) {
                        System.out.println("You win! You cannot play again.");
                        money = startAmount;
                        daysPlayed++;
                    } else if (money == 0) {
                        System.out.println("You lose! You cannot play anymore.");
                        money = startAmount;
                        daysRuined++;
                        daysPlayed++;
                    } else {
                        System.out.println("You have " + money + " left. Play again.");
                    }
                }
            }
        System.out.println("You have a ruin rate of " + daysRuined/daysPlayed);
    
        
        
       
        



    }

}
