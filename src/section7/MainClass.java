package section7;

import java.util.Scanner;

public class MainClass {

    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.println(
                "1.Cricket Player Details \r\n" + "2.Hockey Player Details\r\n " + "Enter choice");
        Integer choice = s.nextInt();
        s.nextLine();
        System.out.println("Enter player name");
        String name = s.next();

        System.out.println("Enter team name");
        String teamName = s.next();

        System.out.println("Enter number of matches played");
        Integer noOfMatches = s.nextInt();
        Integer noOfWicketsTaken = 0;
        if (choice == 1) {
            System.out.println("Enter total runs scored");
            Integer totalRunsScored = s.nextInt();
            System.out.println("Enter total number of wickets taken");
            noOfWicketsTaken = s.nextInt();
            IPlayerStatistics cricket = new CricketPlayer(name, teamName, noOfMatches,
                    totalRunsScored, noOfWicketsTaken);
            cricket.displayPlayerStatistics();

        }

        if (choice == 2) {
            System.out.println("Enter the position");
            String position = s.next();
            System.out.println("Enter total number of goals taken");
            Integer noOfGoals = s.nextInt();
            IPlayerStatistics hockey = new HockeyPlayer(name, teamName, noOfMatches, position,
                    noOfGoals);
            hockey.displayPlayerStatistics();

        }
    }
}
