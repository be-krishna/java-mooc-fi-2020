
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
public class Hold {

    private final int maxWeight;
    private final ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() > this.maxWeight) {
            return;
        }
        this.suitcases.add(suitcase);
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase scase : this.suitcases) {
            total += scase.totalWeight();
        }
        return total;
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

}
