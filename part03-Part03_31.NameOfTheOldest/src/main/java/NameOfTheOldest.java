
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int oldest = 0;
         String name = "";

        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }

            String[] splits = string.split(",");

            if (Integer.valueOf(splits[1]) >= oldest) {
                oldest = Integer.valueOf(splits[1]);
                name = splits[0];
            }

        }

        System.out.println("Name of the oldest: " + name);
    }
}
