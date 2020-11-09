
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try ( Scanner fscanner = new Scanner(Paths.get(file))) {
            while (fscanner.hasNext()) {
                String row = fscanner.nextLine();
                String[] cols = row.split(",");

                System.out.println(cols[0] + ", age: " + cols[1] + " years");
            }

        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
        }

    }
}
