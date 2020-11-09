
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sumOfNumbers = 0;
        int numberCount = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (input % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            numberCount++;
            sumOfNumbers += input;
        }
        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Numbers: " + numberCount);

        double average = (double) sumOfNumbers / numberCount;

        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
