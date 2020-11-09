
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfYear = 0;
        int counter = 0;
        String longestName = "";

        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }

            String[] splits = string.split(",");

            counter = counter + 1;

            sumOfYear += Integer.valueOf(splits[1]);
            for (int i = 0; i < splits.length; i++) {
                if (splits[0].length() > longestName.length()) {
                    longestName = splits[0];
                }
            }

        }
        double average = (double) sumOfYear / counter;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
