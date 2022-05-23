package Study;

import java.util.LinkedList;
import java.util.Queue;

public class BBQ {
    public static void main(String[] args) {

//        Queue<String> bbqLine = new LinkedList();
//
//        bbqLine.add("Jackson");
//        bbqLine.add("Tyreek");
//        bbqLine.add("Susan");
//
//        //bbqLine.poll();
//        System.out.println(bbqLine.poll());
//
//        System.out.println(bbqLine);

        Queue<String> q = new LinkedList<>();

        q.add("A");
        q.add("B");
        q.add("C");

        //System.out.println(q.contains("C"));
        //System.out.println(q.toArray()[1]);
        System.out.println(q.poll());
    }
}
