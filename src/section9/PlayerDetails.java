package section9;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> list = new ArrayList<Player>();

        System.out.println("Enter the number of players");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the player name \n");

            String playerName = sc.nextLine();
            System.out.println("Enter the country name \n");

            String countryrName = sc.nextLine();
            System.out.println("Enter the skill \n");

            String skill = sc.nextLine();
            Player p = new Player(playerName, countryrName, skill);
            list.add(p);

        }
        PlayerBO playerBo = new PlayerBO();
        playerBo.displayAllPlayerDetails(list);
        sc.close();

    }

}
