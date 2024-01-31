import java.util.*;
public class Richa2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array1=new int[n];
        for(int k=0;k<n;k++){
            array1[k]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            int num=array1[j];
            String s=String.valueOf(num);
            int len=s.length();
            int[] arr=new int[len];
            int i=0;
            while(num>0){
                int rem=num%10;
                arr[i]=rem;
                i++;
                num=num/10;
            }
            if(isInc(arr) || isDec(arr)){
                System.out.println("Not a Special Chemical");
            }else{
                System.out.println("Special Chemical");
            }
        }
        
    }
    static boolean isInc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
    static boolean isDec(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
