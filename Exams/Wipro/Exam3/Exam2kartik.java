import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.*;

public class Exam2kartik {
    public static void main(String[] args) {
        int input1=1274;
        int input2=5283;
        int input3=1937;
        

        int ans=tens(input1,input2,input3);
        int ans2=ones(input1,input2,input3);

        System.out.println(ans2);

    }

    public static int tens(int input1, int input2, int input3){
        String s1=Integer.toString(input1);
        String s2=Integer.toString(input2);
        String s3=Integer.toString(input3);
        HashMap <Character, Integer> hm= new HashMap<>();
        //TreeSet <Integer> ts = new TreeSet<>(Collections.reverseOrder());
        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue <Integer> pq2=new PriorityQueue<>();

        
        for(int i=0;i<4;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            char c3=s3.charAt(i);
            hm.put(c1,hm.getOrDefault(c1, 0)+1);
            hm.put(c2,hm.getOrDefault(c2, 0)+1);
            hm.put(c3,hm.getOrDefault(c3, 0)+1);
        }
        int max=0;
        int maxfreq=0;

        // To find maxfreq element
        for(char val:hm.keySet()){
            if(hm.get(val)>max){
                max=hm.get(val);
                maxfreq=max;
            }
        }

        for(char val:hm.keySet()){
            if(hm.get(val)==maxfreq){
                String st=String.valueOf(val);
                Integer a1=Integer.parseInt(st);
                pq.add(a1);
            }
        }
        for(int i=0;i<1;i++){
            if(!pq.isEmpty()){
                return pq.peek();
            }
        }
        return 0;
    }


    public static int ones(int input1, int input2, int input3){
        String s1=Integer.toString(input1);
        String s2=Integer.toString(input2);
        String s3=Integer.toString(input3);
        HashMap <Character, Integer> hm= new HashMap<>();
        //TreeSet <Integer> ts = new TreeSet<>(Collections.reverseOrder());
        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue <Integer> pq2=new PriorityQueue<>();

        
        for(int i=0;i<4;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            char c3=s3.charAt(i);
            hm.put(c1,hm.getOrDefault(c1, 0)+1);
            hm.put(c2,hm.getOrDefault(c2, 0)+1);
            hm.put(c3,hm.getOrDefault(c3, 0)+1);
        }
        int min=Integer.MAX_VALUE;
        int minfreq=Integer.MAX_VALUE;

        // To find minfreq element
        for(char val:hm.keySet()){
            if(hm.get(val)<min){
                min=hm.get(val);
                minfreq=min;
            }
        }

        for(char val:hm.keySet()){
            if(hm.get(val)==minfreq){
                String st=String.valueOf(val);
                Integer a1=Integer.parseInt(st);
                pq2.add(a1);
            }
        }
        for(int i=0;i<1;i++){
            if(!pq.isEmpty()){
                return pq.peek();
            }
        }
        return 0;
    }

    

}
