import java.security.KeyStore.Entry;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap <Integer, String> tm = new TreeMap<>();
        tm.put(1, "KSS");
        tm.put(2, "gaurav");
        tm.put(3, "Duttaji");;
        tm.put(4, "abc");
        tm.put(5, "xyz");

        tm.put(5, "MNO");
        System.out.println(tm);

        // for(<Map.Entry<Integer, String>> m : tm.entrySet()){
        //     System.out.println("Key is: "+tm.getKey());
        //     System.out.println("value is: "+tm.getValue());
        // }
    }
}
