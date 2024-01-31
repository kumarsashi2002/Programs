import java.util.*;

public class KvOptum {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList<>();
        int N=sc.nextInt();
        int arr1[]=new int[N];
        for(int i=0;i<N;i++){
            arr1[i]=sc.nextInt();
            al.add(arr1[i]);
        }
        int M=sc.nextInt();
        int arr2[] =new int[M];
        for(int i=0;i<M;i++){
            arr2[i]=sc.nextInt();
        }
        int P=sc.nextInt();
        int ans=0;
        for(int i=0;i<M;i++){
            int val=P*arr2[i];
            if(al.contains(arr2[i])){
                ans=ans+val;
                al.remove(al.indexOf(arr2[i]));
            }
            else{
                ans=ans-val;
            }
        }
        System.out.println(ans);
    }
}
