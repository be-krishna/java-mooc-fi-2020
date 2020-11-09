
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + 100);
            System.out.println("Second: " + secondContainer + "/" + 100);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] splits = input.split(" ");
            String command = splits[0];
            int amount = Integer.valueOf(splits[1]);

            if (command.equals("add")) {

                if (amount < 0) {
                    continue;
                }

                if ((firstContainer + amount) > 100) {
                    firstContainer = 100;
                } else {
                    firstContainer += amount;
                }

            }

            if (command.equals("remove")) {
                if (amount > secondContainer) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            }

            if (command.equals("move")) {
                if (amount >= firstContainer) {
                    secondContainer += firstContainer;

                    if (secondContainer > 100) {
                        secondContainer = 100;
                    }
                    firstContainer = 0;
                }

                if (amount < firstContainer) {

                    firstContainer -= amount;
                    secondContainer += amount;

                    if (secondContainer > 100) {
                        secondContainer = 100;
                    }
                }
            }

        }

    }

}
