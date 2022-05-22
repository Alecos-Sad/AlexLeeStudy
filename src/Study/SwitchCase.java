package Study;

public class SwitchCase {
    public static void main(String[] args) {

        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not valid number!");
        }

        String dog = "Great Dane";
        switch (dog) {
            case "Pomeranian":
                System.out.println("Small dog");
                break;
            case "Great dane":
                System.out.println("Large dog");
                break;
            default:
                System.out.println("Try a different dog!");
        }
    }
}
