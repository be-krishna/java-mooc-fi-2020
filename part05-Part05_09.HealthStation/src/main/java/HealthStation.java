
public class HealthStation {

    private int weighingCounter;

    public int weigh(Person person) {
        weighingCounter++;
        return person.getWeight();

    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return weighingCounter;
    }

}
