import java.util.Scanner;
public class pi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many darts would you like to throw?");
        int numOfDarts = in.nextInt();
        int insideCounter = 0;
        for (int d = 0; d<numOfDarts; d++) {
            double x = Math.random();
            double y = Math.random();
            double distance = Math.sqrt((Math.pow((x-0.5),2))+Math.pow((y-0.5),2));
            if (distance < 0.5) {
                insideCounter++;
            }
            
        }
        System.out.println(((double)insideCounter / numOfDarts) * 4);
        

    }
}
