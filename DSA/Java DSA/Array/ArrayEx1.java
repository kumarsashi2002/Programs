import java.util.Scanner;
public class ArrayEx1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int arr[]=new int[2*n];
        for(i=0;i<2*n;i++){
            arr[i]=sc.nextInt(); 
        }
        
        for(i=0;i<2*n;i++){
            for(j=i+1;j<2*n;j++){
                if ((arr[i]+arr[j])%2!=0){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
        
        
    }
}
