package PhoneBook;

import javax.swing.*;
import java.util.*;

class PersonInfo {
    String name;
    String phoneNumber;


    PersonInfo(String n, String p) {
        name = n;
        phoneNumber = p;
    }

    void display() {
        JOptionPane.showMessageDialog(null, "Name: " + name + "PhoneNumber: " + phoneNumber);
    }
}

class AddressBook {
    ArrayList persons;

    AddressBook() {
        persons = new ArrayList();
    }
    void addPersons(){
        String name = JOptionPane.showInputDialog("Enter name: ");
        String phoneNumber = JOptionPane.showInputDialog("Enter PhoneNumber: ");
        PersonInfo personInfo = new PersonInfo(name, phoneNumber);
        persons.add(personInfo);
    }
    void searchPerson(String name) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo personInfo = (PersonInfo) persons.get(i);
            if(name.equals(personInfo.name)) {
                personInfo.display();
            }
        }
    }
    void deletePerson(String name) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo personInfo = (PersonInfo) persons.get(i);
            if(name.equals(personInfo.name)) {
                persons.remove(i);
            }
        }
    }
}

public class Test {

}
