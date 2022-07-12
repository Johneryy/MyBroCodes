package Phonebook;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class AddressBook {
    static ArrayList persons;

    AddressBook() {
        persons = new ArrayList();
        loadPersons();
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
    void savePersons() {
        try{
            PersonInfo personInfo;
            String line;
            FileWriter fileWriter = new FileWriter("Persons.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i < persons.size(); i++) {
               personInfo = (PersonInfo) persons.get(i);
               line = personInfo.name + "," + personInfo.phoneNumber + ",";
               printWriter.println(line);
            }
            printWriter.flush();
            printWriter.close();
            fileWriter.close();
        }catch (IOException ioException) {
            System.out.println(ioException);
        }
    }
    void loadPersons() {
        String token[] = null;
        String name,phoneNumber;
        try{
            FileReader fileReader = new FileReader("Persons.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                token = line.split(",");
                name = token[0];
                phoneNumber = token[1];
                PersonInfo personInfo = new PersonInfo(name, phoneNumber);
                persons.add(personInfo);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        }catch(IOException ioException) {
            System.out.println(ioException);
        }
    }
}

