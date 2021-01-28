import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws PersonAlreadyExists {

        Person p1 = new Person("Surname1", "FirstName1", "Patronymic1");
        Person p2 = new Person("Surname2", "FirstName2", "Patronymic2");
        Person p3 = new Person("Surname3", "FirstName3", "Patronymic3");
        Person p4 = new Person("Surname2", "FirstName2", "Patronymic2"); // if you change this
                                                                                                  // to "new Person("Surname4", "FirstName4", "Patronymic4");"
                                                                                                  // exception won't occur

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        LinkedList<Person> list = new LinkedList<>();

        try {
            Person.addPerson(list, people);
        }
        catch (PersonAlreadyExists ex) {
            ex.printStackTrace();
        }
    }
}
