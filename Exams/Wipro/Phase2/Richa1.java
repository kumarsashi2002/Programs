import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Richa1 {
    static int secondLar(int [] arr){
        int ans=0;
        HashMap <Integer,Integer> hm=new HashMap<>();
        ArrayList <Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        int max=0,max2=0;
        for(int val:hm.keySet()){
            int freq=hm.get(val);
            if(freq>max){
                max=freq;
            }
        }

        int freq2=0;
        for(int val:hm.keySet()){
            int freq=hm.get(val);
            if(freq>0 && freq<max){
                if(freq>=freq2){
                    max2=freq;
                }
                freq2=max2;
            }
        }

        for(int val:hm.keySet()){
            if(hm.get(val)==max2){
                al.add(val);
            }
        }
        ans=Collections.max(al);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={12,2,36,10,217,36,5,36,15,10};
        int ans1=secondLar(arr);
        System.out.println(ans1);

        //String s1=String.valueOf()
    }
}
