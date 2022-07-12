package Phonebook;

import javax.swing.*;

public class Main {
        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();
            String input, s;
            int ch;

            while(true) {
                input = JOptionPane.showInputDialog("""
                    1.Enter 1 to Add
                    2.Enter 2 to Search
                    3.Enter 3 to Delete
                    4.Enter 4 to Exit
                    """);
                ch = Integer.parseInt(input);

                switch (ch) {
                    case 1:
                        addressBook.addPersons();
                        break;
                    case 2:
                        s = JOptionPane.showInputDialog("Enter name to Search: ");
                        addressBook.searchPerson(s);
                        break;
                    case 3:
                        s = JOptionPane.showInputDialog("Enter name to Delete");
                        addressBook.deletePerson(s);
                        break;
                    case 4:
                        addressBook.savePersons();
                        System.exit(0);
                }
            }
        }
    }

