package Study;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {

//        int[] a = {3,5,1};
//        System.out.println(a[1]);

        HashSet<String> h = new HashSet<>();
        h.add("lemur");
        h.add("orangatang");
        h.add("spider monkey");
        h.add("silverback gorilla");

        h.remove("orangatang");

        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.contains("spider monkey"));
        System.out.println(h.isEmpty());

        HashSet<Integer> hashBrowns = new HashSet();
        hashBrowns.add(13);
        hashBrowns.add(24);
        hashBrowns.add(5);

        //hashBrowns.clear();
        Object[] has = hashBrowns.toArray();
        System.out.println(has[0]);

        System.out.println(hashBrowns.hashCode());

        Iterator<Integer> it = hashBrowns.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
