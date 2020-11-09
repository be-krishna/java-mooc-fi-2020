
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();

            String[] splitted = string.split(" ");

            for (String splits : splitted) {
                if (splits.contains("av")) {
                    System.out.println(splits);
                }
            }

            if (string.isEmpty()) {
                return;
            }
        }

    }
}
