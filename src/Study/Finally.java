package Study;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 0;
//        int c = a / b;
//        System.out.println(c);

//        try {
//            int a = 5 / 1;
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("This is finally, it always gets runs");
//        }

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(scanner.next());
        } catch (Exception e){
            System.out.println(e);
        } finally {
            scanner.close();
        }


    }
}
