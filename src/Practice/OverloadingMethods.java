package Practice;

public class OverloadingMethods {
    public static void main(String[] args) {

       int x = add(1, 2);
        System.out.println(x);
        int y = add(1, 2, 3);
        System.out.println(y);
    }
    static int add(int a, int b) {
        System.out.println("This is method overloading #1");
        return a + b;
    }
    static int add(int c, int d, int e) {
        System.out.println("This is method overloading #2");
        return c + d + e;
    }
}
