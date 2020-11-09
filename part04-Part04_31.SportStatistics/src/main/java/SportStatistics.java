
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int teamPlayCount = 0;
        int teamWins = 0;
        int teamLosses = 0;

        try ( Scanner fscanner = new Scanner(Paths.get(file))) {
            while (fscanner.hasNext()) {
                String row = fscanner.nextLine();
                String[] cols = row.split(",");

                int score1 = Integer.valueOf(cols[2]);
                int score2 = Integer.valueOf(cols[3]);

                if (row.contains(team)) {
                    teamPlayCount++;

                    if (cols[0].equalsIgnoreCase(team) && score1 > score2 || cols[1].equalsIgnoreCase(team) && score2 > score1) {
                        teamWins++;
                    } else if (cols[0].equalsIgnoreCase(team) || cols[1].equalsIgnoreCase(team)) {
                        teamLosses++;
                    }
                }
            }

            System.out.println("Games: " + teamPlayCount);
            System.out.println("Wins: " + teamWins);
            System.out.println("Losses: " + teamLosses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
