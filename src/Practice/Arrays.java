package Practice;

public class Arrays {
    public static void main(String[] args) {

        String[] cars = new String[3];
        cars[0] = "Ferrari";
        cars[1] = "Camaro";
        cars[2] = "Ferrari";

        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
