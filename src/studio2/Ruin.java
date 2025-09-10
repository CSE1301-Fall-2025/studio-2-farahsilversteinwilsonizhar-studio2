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
        double daysRuined1 = daysRuined * 1000.0/10.0;
        double daysPlayed1 = daysPlayed * 1000.0/1000.0;
        double ruinRate = (daysRuined1/daysPlayed1);
        System.out.println("You have a ruin rate of " + ruinRate);
        double a = ((1-winChance)/winChance);
        if (winChance==0.5) {
            double expectedRuinHalf = ((1-startAmount)/winLimit);
            System.out.println("The expected ruin rate was " + expectedRuinHalf);
        } else {
            double expectedRuin = ((Math.pow(a, startAmount)-Math.pow(a, winLimit))/(1-Math.pow(a, winLimit)));
            System.out.println("The expected ruin rate was " + expectedRuin);
        }
    
        
        
       
        



    }

}
