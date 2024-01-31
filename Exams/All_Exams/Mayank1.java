import java.util.*;
public class Mayank1 {
    public static void main(String[] args) {
        String str="ajflfdkjsabdevg";
        int k=4;
        int len=str.length();
        char[] arr=new char[len];
        for(int i=0;i<len;i++){
            arr[i]=str.charAt(i);
        }
        Arrays.sort(arr);
        char c='A';
        int count=0;
        for(int i=0;i<len;i++){
            if(i==k-1){
                c=arr[i];
                break;
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i]==c){
                count++;
            }
        }
        System.out.println(c+"...."+count);
    }
}
