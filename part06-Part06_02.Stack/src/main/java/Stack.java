
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
public class Stack {

    ArrayList<String> strings;

    public Stack() {
        this.strings = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.strings.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.strings.add(0, value);
    }

    public ArrayList<String> values() {
        return this.strings;
    }

    public String take() {
        String string = this.strings.get(0);
        this.strings.remove(0);
        return string;
    }
}
