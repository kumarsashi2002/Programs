import java.util.Scanner;
public class KV_Tcs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] A= new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(i<j && A[i]+A[j]>=A[i]*A[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}