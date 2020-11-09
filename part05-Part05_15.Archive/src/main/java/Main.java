
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier?(empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive item = new Archive(identifier, name);

            archive.add(item);
        }

        ArrayList<Archive> uniqueItems = new ArrayList<>();

        for (Archive item : archive) {
            if(uniqueItems.contains(item)){
                continue;
            }
            uniqueItems.add(item);
        }
        
        System.out.println("==Items==");
        
        uniqueItems.forEach((item) -> {
            System.out.println(item);
        });

    }
}
