package Practice;

public class SwitchStatements {
    public static void main(String[] args) {

        String day = "Friday";

        switch (day) {
            case "Sunday" -> System.out.println("It is sunday!");
            case "Monday" -> System.out.println("It is monday!");
            case "Tuesday" -> System.out.println("It is tuesday!");
            case "Wednesday" -> System.out.println("It is wednesday!");
            case "Thursday" -> System.out.println("It is thursday!");
            case "Friday" -> System.out.println("It is friday!");
            case "Saturday" -> System.out.println("It is saturday!");
            default -> System.out.println("That is not a day");
        }
    }
}

