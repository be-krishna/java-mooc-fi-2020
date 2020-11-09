
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author be-krishna
 */
public class Suitcase {

    private final ArrayList<Item> items;
    private final int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item addItem) {

        int tWeight = totalWeight();

        if (tWeight < this.maxWeight) {
            if (!((tWeight + addItem.getWeight()) > this.maxWeight)) {

                this.items.add(addItem);
            }
        }
        tWeight = this.totalWeight();
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : this.items) {
            total += item.getWeight();
        }
        return total;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item returnHeaviest = this.items.get(0);

        for (Item item : items) {
            if (item.getWeight() > returnHeaviest.getWeight()) {
                return item;
            }
        }
        return returnHeaviest;
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" + this.items.get(0).getWeight() + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }

}
