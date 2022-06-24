package Practice;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Rice");
        food.add("Yam");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
