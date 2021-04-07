package Day6Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollections {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(70);
        list.add(50);
        list.add(40);

        Collections.addAll(list,50,60);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}
