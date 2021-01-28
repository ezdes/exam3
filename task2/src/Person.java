import java.util.ArrayList;

import java.util.LinkedList;

public class Person {

    private String surname;
    private String firstName;
    private String patronymic;

    public Person() {
    }

    public Person(String surname, String firstName, String patronymic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public static void addPerson(LinkedList<Person> list, ArrayList<Person> people) throws PersonAlreadyExists {

        list.addAll(people);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (!list.get(i).equals(list.get(j))) {
                    System.out.println("No duplicate!");
                }
                else {
                    list.remove(j);
                    throw new PersonAlreadyExists("This person " + list.get(i).getSurname()
                            + " " + list.get(i).getFirstName()
                            + " " + list.get(i).getPatronymic() + " is already exists!");
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (o == null || o.getClass() != this.getClass()) return false;

        Person person = (Person) o;

        return surname.equals(person.getSurname()) &&
                firstName.equals(person.firstName) &&
                patronymic.equals(person.getPatronymic());

    }

    @Override
    public String toString() {
        return surname + " " + firstName + " " + patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
