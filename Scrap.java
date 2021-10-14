import java.util.Scanner;

public class Scrap{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // declaring variables
        String filmTitle;
        int runningTime;
        double averageWebsiteRating;
        double averageFocusRating;
        double averageCriticRating;
        int OverallMR;
        int count = 0;
        double number = 0;

        // averaging & taking inputs
        System.out.println("Please enter the movie name");
        filmTitle = scan.nextLine();

        System.out.println("Please enter the running time in minutes.");
        runningTime = scan.nextInt();
        int runningTimeMinutes = runningTime%60;
        int runningTimeHours = runningTime/60;

        System.out.println("Please enter ratings from the movie review website.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        averageWebsiteRating = (num1 + num2 + num3)/3.0;

        System.out.println("Please enter ratings from the focus group.");
        for (double i = 0; i < 2; i++){
            number += scan.nextDouble();
            count ++;
        }
        averageFocusRating = number/count;

        System.out.println("Please enter the average movie critic rating.");
        averageCriticRating = scan.nextDouble();

        OverallMR = (int) ((int)averageWebsiteRating*0.2 + averageFocusRating*0.3 + averageCriticRating*0.5 + 0.5);

        // outputs
        System.out.println("Title: " + filmTitle);
        System.out.println("Running time: " + runningTimeHours + "h" + runningTimeMinutes);
        System.out.println("Average website rating: " + averageWebsiteRating);
        System.out.println("Average focus group rating: " + averageFocusRating);
        System.out.println("Average movie critic rating: " + averageCriticRating);
        System.out.println("Overall movie rating: " + OverallMR); 
    }
}
