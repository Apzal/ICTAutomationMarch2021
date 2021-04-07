package Day6Collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableCollection {

    public static void main(String[] args) {
        Hashtable<String,Integer> table=new Hashtable<>();

        table.put("sneha",852);
        table.put("apzal",456);
        table.put("varsha",789);
        //table.put("Reshmi",null);
        table.put("varsha",456);



        System.out.println("--Key set--");
        Set<String> keys = table.keySet();
        for (String key:keys) {
            System.out.println(key+":"+ table.get(key));
        }

        System.out.println("--Entry set--");
        Set<Map.Entry<String, Integer>> entrySet = table.entrySet();
        for (Map.Entry<String, Integer> eS:entrySet) {
            System.out.println(eS.getKey()+":"+ eS.getValue());
        }



    }
}
