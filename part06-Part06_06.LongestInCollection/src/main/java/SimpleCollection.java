
import java.util.ArrayList;

public class SimpleCollection {

    private final String name;
    private final ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String returnString = this.elements.get(0);

        for (String string : this.elements) {
            if (returnString.length() < string.length()) {
                return string;
            }
        }

        return returnString;
    }
}
