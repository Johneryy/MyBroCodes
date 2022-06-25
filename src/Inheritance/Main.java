package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.go();
        Bicycle bicycle = new Bicycle();
//        bicycle.speed();
        System.out.println(bicycle.speed);
        System.out.println(car.doors);
        System.out.println(bicycle.pedals);

    }
}
