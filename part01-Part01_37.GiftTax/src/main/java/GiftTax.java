
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());

        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            int taxAtLower = 100;
            double taxRate = 0.08;
            double taxAmount = (taxAtLower + (giftValue - 5000) * taxRate);
            System.out.println("Tax: " + taxAmount);
        } else if (giftValue >= 25000 && giftValue < 55000) {
            int taxAtLower = 1700;
            double taxRate = 0.10;
            double taxAmount = (taxAtLower + (giftValue - 25000) * taxRate);
            System.out.println("Tax: " + taxAmount);
        } else if( giftValue >=55000 && giftValue < 200000){
            int taxAtLower = 4700;
            double taxRate = 0.12;
            double taxAmount = (taxAtLower + (giftValue - 55000) * taxRate);
            System.out.println("Tax: " + taxAmount);
        } else if( giftValue >=200000 && giftValue < 1000000){
            int taxAtLower = 22100;
            double taxRate = 0.15;
            double taxAmount = (taxAtLower + (giftValue - 200000) * taxRate);
            System.out.println("Tax: " + taxAmount);
        } else{
            int taxAtLower = 142100;
            double taxRate = 0.17;
            double taxAmount = (taxAtLower + (giftValue - 1000000) * taxRate);
            System.out.println("Tax: " + taxAmount);
        }

    }
}
