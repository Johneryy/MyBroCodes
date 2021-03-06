package Phonebook;

import javax.swing.*;

public class Main {
        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();
            String input, s;
            int command;

            while(true) {
                input = JOptionPane.showInputDialog("""
                    1.Enter 1 to Add
                    2.Enter 2 to Search
                    3.Enter 3 to Delete
                    4.Enter 4 to Exit
                    """);
                command = Integer.parseInt(input);

                switch (command) {
                    case 1 -> AddressBook.addPersons();
                    case 2 -> {
                        s = JOptionPane.showInputDialog("Enter name to Search: ");
                        addressBook.searchPerson(s);
                    }
                    case 3 -> {
                        s = JOptionPane.showInputDialog("Enter name to Delete");
                        addressBook.deletePerson(s);
                    }
                    case 4 -> {
                        addressBook.savePersons();
                        System.exit(0);
                    }
                }
            }
        }
    }

