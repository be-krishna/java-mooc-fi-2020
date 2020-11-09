
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner fscanner = new Scanner(Paths.get(file))) {
            while (fscanner.hasNext()) {
                String row = fscanner.nextLine();
                if (row.contains(searchedFor)) {
                    System.out.println("Found!");
                    break;
                }

                if (fscanner.hasNextLine() == false) {
                    System.out.println("Not found.");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
