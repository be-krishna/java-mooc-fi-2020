
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String string = scanner.nextLine();
            
            String[] splits = string.split(" ");
            
            System.out.println(splits[0]);
            
            if(string.isEmpty()){
                return;
            }
        }

    }
}
