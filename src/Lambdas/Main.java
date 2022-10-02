package Lambdas;

public class Main {
    public static void main(String[] args) {
       int total = 0;
        for (int x = 1; x <= 10 ; x++) {
            if (x % 2 == 0){
                total = total + x * 3;
            }
        }
        System.out.println(total);
    }
}
