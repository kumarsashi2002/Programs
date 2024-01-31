import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap <Integer, String> hm = new HashMap<>();
        hm.put(1,"KSS");
        hm.put(2,"Gaurav");
        hm.put(3,"abc");
        hm.put(4,"xyz");
        
        System.out.println(hm);

        // updating the value of a kay
        hm.put(3,"Duttaji");
        hm.remove(4);
        System.out.println(hm); 

        for(int key:hm.keySet()){
            String val=hm.get(key);
            System.out.println(key+"  "+val);
        }

        // // To access or print Elements of map using Iterator entrySet
        for(Map.Entry<Integer, String> m: hm.entrySet()){
            System.out.println("Key is:"+m.getKey() +" Value is:"+m.getValue());
        }

        // Set <Map.Entry<Integer,String>> set = hm.entrySet();
        // for(Map.Entry<Integer,String> me: set){
        //     System.out.println("Key is: "+me.getKey());
        //     System.out.println("Value is: "+me.getValue());
        // }


        HashMap <Integer, Integer> fhm = new HashMap<>();
        int arr[]={12,15,12,87,99,12,15,8};
        for(int val:arr){
            if(fhm.containsKey(val)){
                int of=fhm.get(val);
                int nf=of+1;
                fhm.put(val,nf);
            }else{
                fhm.put(val,1);
            }
        }

        for(int val:arr){
            fhm.put(val,fhm.getOrDefault(val,0)+1);
            //System.out.println("Here is:"+fhm.get(val));
        }
        // for(int i=0;i<arr.length;i++){
        //     fhm.put(arr[i],fhm.getOrDefault(arr[i],0)+1);
        // }

        System.out.println("frequency hashmap data : "+fhm);
    }
}
