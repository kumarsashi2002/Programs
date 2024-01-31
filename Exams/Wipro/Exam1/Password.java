import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Password {
    public static void main(String[] args) {
        int input1=12;
        int input2=1313;
        int input3=122;
        int input4=678;
        int input5=898;

        int arr[]={12,1313,122,678,898};
        HashMap <Integer,Integer> hm = new HashMap<>();
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        ArrayList <Integer> al = new ArrayList<>();
        boolean flag=true;
        for(int i=0;i<5;i++){
            int n=arr[i];
            int fr=0;
            while(n>0){
                int rem=n%10;
                if(n<10){
                    hm.put(rem,hm.getOrDefault(rem, 0)+1);
                }
                n=n/10;
                hm.put(rem,hm.getOrDefault(rem, 0)+1);
                fr=hm.get(rem);
                System.out.println(n+",,,,"+rem);
            }
            
            for(int val:hm.keySet()){
                if(fr!=hm.get(val)){
                    flag=false;
                }
            }
            if(flag){
                pq.add(n);
            }
        }
        
        for(int i:pq){
            al.add(i);
        }
        int max=al.get(0);
        int min=al.get(0);
        for(int i:al){
            if(al.get(i)>max){
                max=al.get(i);
            }
            if(al.get(i)<min){
                min=al.get(i);
            }
        }

        int password=max-min;
        System.out.println(password);
        
    }
}
