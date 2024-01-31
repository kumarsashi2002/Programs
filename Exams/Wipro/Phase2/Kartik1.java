
import java.util.*;
public class Kartik1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int size=sc.nextInt();
        // int input11[]=new int[size];
        int input1[]={1,2,4,1,2,8};
        int input2=6;
        System.out.println(findRepArray(input1,input1.length));
    }

    public static int findRepArray(int[] input1,int input2){
        boolean flag=false;
        boolean flag2=false;
        int value=0;
        for(int i=0;i<input2;i++){
            if(input1[i]>0){
                flag2=true;
            }
        }
        HashSet <Integer> hs=new HashSet<>();
        for(int i=input2-1;i>=0;i--){
            if(hs.contains(input1[i])){
                if(input1[i]<=0){
                    
                }else{
                    flag=true;
                    value=input1[i];
                    return value;
                }
                
            }else{
                hs.add(input1[i]);
            }
        }
        if(flag2==false){
            return 0;
        }
        if(!flag){
            return input1[input2-1];
        }else{
            return input1[0];
        }
    }
    
}
