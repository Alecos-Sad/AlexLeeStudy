package Study;

import java.util.ArrayList;

public class ForichLoop {
    public static void main(String[] args) {

//        String[] cars = {"BMW", "Veloste", "GTI"};
//        for (int i = 0; i < 3; i++) {
//            System.out.println(cars[i]);
//        }
//
//        for (String car : cars) {
//            System.out.println(car);
//        }

        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        for (int a : numbers) {
            System.out.println(a);
        }
    }
}
