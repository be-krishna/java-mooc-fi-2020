
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics sAll = new Statistics();
        Statistics sEven = new Statistics();
        Statistics sOdd = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            sAll.addNumber(number);

            if (number % 2 == 0) {
                sEven.addNumber(number);
            }

            if (number % 2 != 0) {
                sOdd.addNumber(number);
            }

        }

        System.out.println("Sum: " + sAll.sum());
        System.out.println("Sum of even numbers: " + sEven.sum());
        System.out.println("Sum of odd numbers: " + sOdd.sum());
    }

}
