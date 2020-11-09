
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
public class Room {

    private final ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person returnPerson = this.persons.get(0);

        for (Person person : this.persons) {
            if (returnPerson.getHeight() > person.getHeight()) {
                returnPerson = person;
            }
        }
        return returnPerson;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person person = this.shortest();
        this.persons.remove(this.persons.indexOf(this.shortest()));
        return person;
    }
}
