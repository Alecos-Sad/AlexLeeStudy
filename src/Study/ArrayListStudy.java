package Study;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        System.out.println(fruits);

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");
        fruitList.remove("Strawberry");
        //fruitList.clear();
        System.out.println(fruitList.contains("Apple"));
        System.out.println(fruitList);
    }
}
