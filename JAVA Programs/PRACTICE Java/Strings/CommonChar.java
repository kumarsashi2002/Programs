import java.util.HashMap;

public class CommonChar {
    public static void main(String[] args) {
        String s="Duttau";
        String s2="Kumaru";
        String s3="Suryau";
        HashMap <Character, Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),1);
        }
        for(int i=0;i<s2.length();i++){
            //hm.put(s2.charAt(i),hm.getOrDefault(s2.charAt(i), 0)+1);
            if(hm.containsKey(s2.charAt(i))){
                hm.put(s2.charAt(i),2);
            }
        }
        for(int i=0;i<s3.length();i++){
            if(hm.containsKey(s3.charAt(i))){
                hm.put(s3.charAt(i),3);
            }
        }

        for(char val:hm.keySet()){
            //System.out.println(val+","+hm.get(val));
            if(hm.get(val)>2){
                System.out.println("Ans:"+val);
            }
        }
    }
}
