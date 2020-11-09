
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        Item laptop = new Item("laptop", 5);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);
        
        Suitcase newCase = new Suitcase(10);
        newCase.addItem(laptop);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
        hold.addSuitcase(newCase);

        System.out.println(hold);
    }

}
