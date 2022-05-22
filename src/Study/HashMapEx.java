package Study;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
//        int a = 10;
//        String b = "hello";
//        int[] c = {1, 2, 3};

//        int a = 10;
//        int b = 3;
//        int c = 88;
//
//        HashMap<String, Integer> happy = new HashMap<String, Integer>();
//        happy.put("a",10);
//        happy.put("b",3);
//        happy.put("c",88);
//
//        System.out.println(happy);
//        System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap<>();
        fun.put("bobbyJoe1996", "FluffyP0nies!");
        fun.put("helloKittyFan21", "AloeVera?");
        fun.put("coolGuySwag", "password123");

       // fun.remove("helloKittyFan21");

        System.out.println(fun.containsValue("password123"));
        System.out.println(fun.containsKey("helloKittyFan21"));

        System.out.println(fun.replace("bobbyJoe1996", "b3tt3rp@password"));
        System.out.println(fun);

        System.out.println(fun.keySet());

    }
}
