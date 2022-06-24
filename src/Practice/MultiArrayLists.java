package Practice;

import java.util.ArrayList;

public class MultiArrayLists {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Tomato");
        bakeryList.add("Indomie");
        bakeryList.add("Oil");

        ArrayList<String> deviceList = new ArrayList();
        deviceList.add("Mouse");
        deviceList.add("Keyboard");

        groceryList.add(bakeryList);
        groceryList.add(deviceList);


        System.out.println(groceryList);

    }
}
