package Day6Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListCollection {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();//ctrl+alt+v
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(null);
        list.add(null);



        System.out.println(list);


        System.out.println("------------------");



        System.out.println("using for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//
//        System.out.println("using foreach loop");
//
//        for (int numb:list) {
//            System.out.println(numb);
//        }

        System.out.println("using iterator");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("using list iterator-Move Forward");
        ListIterator<Integer> ListIterator = list.listIterator();
        while(ListIterator.hasNext()){
            System.out.println(ListIterator.next());
        }

        System.out.println("using list iterator-Move Backward");
        while(ListIterator.hasPrevious()){
            System.out.println(ListIterator.previous());
        }


    }
}
