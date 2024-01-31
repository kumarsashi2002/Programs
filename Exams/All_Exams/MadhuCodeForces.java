import java.util.Scanner;

public class MadhuCodeForces {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++){
            int n=sc.nextInt();
            int[] c=new int[n];
            int[] d=new int[n];
            for(int i=0;i<n;i++){
                c[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                d[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++){
                if(c[i]>d[i]){
                    int temp=c[i];
                    c[i]=d[i];
                    d[i]=temp;
                }
            }
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(c[i]>max1){
                    max1=c[i];
                }
                if(d[i]>max2){
                    max2=d[i];
                }
            }
            System.out.println(max1*max2);

        }
    }
}
