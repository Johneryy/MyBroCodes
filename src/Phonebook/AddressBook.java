package Phonebook;

import javax.swing.*;
import java.util.ArrayList;

public class AddressBook {
    static ArrayList persons;

    AddressBook() {
        persons = new ArrayList();
    }
    static void addPersons(){
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

