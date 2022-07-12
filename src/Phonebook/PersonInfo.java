package Phonebook;

import javax.swing.*;

public class PersonInfo {
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

