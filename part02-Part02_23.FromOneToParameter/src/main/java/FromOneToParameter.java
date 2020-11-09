
public class FromOneToParameter {
    
    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int times) {
        int i = 1;
        while (i <= times) {
            System.out.println(i);
            i++;
        }
    }
}
