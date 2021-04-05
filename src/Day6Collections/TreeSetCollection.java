package Day6Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetCollection {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();//ctrl+alt+v
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(30);
//        set.add(null);
//        set.add(null);




        System.out.println(set);


        System.out.println("------------------");



//        System.out.println("using for loop");
//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(set.get(i));
//        }
//
//        System.out.println("using foreach loop");
//
//        for (int numb:set) {
//            System.out.println(numb);
//        }

        System.out.println("using iterator");
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


//        System.out.println("using set iterator-Move Forward");
//        ListIterator<Integer> ListIterator = set.listIterator();
//        while(ListIterator.hasNext()){
//            System.out.println(ListIterator.next());
//        }
//
//        System.out.println("using set iterator-Move Backward");
//        while(ListIterator.hasPrevious()){
//            System.out.println(ListIterator.previous());
//        }


    }
}
