
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String string = scanner.nextLine();
            
            if(string.isEmpty()){
                return;
            }
            
            String[] splits = string.split(" ");
            
            System.out.println(splits[splits.length - 1]);
        }
    }
}
