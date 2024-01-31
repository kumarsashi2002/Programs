import java.util.HashMap;
import java.util.Scanner;

public class StringsEx {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1="Gaurav";
        String s = new String("Shekhar");
        System.out.println(s);
        String s2="Dutta";
        //String s3=sc.nextLine();
        System.out.println(s1+"\n"+s2);
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        
        System.out.println("Concatenate s1 and s2: "+ s1+" "+s2);
        System.out.println("Concatenate using concat method "+ s1.concat(s2));
        System.out.println("After replacing s2: "+ s2.replace("Dutta", "Duttaji"));
        System.out.println(s2);

        System.out.println("s1 in UpperCase: "+ s1.toUpperCase());
        System.out.println("s1 in lower case: " + s1.toLowerCase());
        System.out.println("First occurence of a in s1 is at index: " + s1.indexOf("au"));
        System.out.println("Last occurence of a in s1 is at index: "+ s1.lastIndexOf("a"));

        System.out.println(s1.contains("aur"));
        System.out.println(s1.substring(0, 4));
        System.out.println((s1.isEmpty()));
        sc.close();

        // String s="Duttau";
        // String s2="Kumaru";
        // String s3="Suryau";
        // HashMap <Character, Integer> hm = new HashMap<>();

        // for(int i=0;i<s.length();i++){
        //     hm.put(s.charAt(i),1);
        // }
        // for(int i=0;i<s2.length();i++){
        //     //hm.put(s2.charAt(i),hm.getOrDefault(s2.charAt(i), 0)+1);
        //     if(hm.containsKey(s2.charAt(i))){
        //         hm.put(s2.charAt(i),2);
        //     }
        // }
        // for(int i=0;i<s3.length();i++){
        //     if(hm.containsKey(s3.charAt(i))){
        //         hm.put(s3.charAt(i),3);
        //     }
        // }

        // for(char val:hm.keySet()){
        //     //System.out.println(val+","+hm.get(val));
        //     if(hm.get(val)>2){
        //         System.out.println("Ans:"+val);
        //     }
        // }

        String s5="";
        s5=s5+"C";
        s5=s5+"abc";
        s5=s5+5/2;
        System.out.println(s5);
        
    }
}
