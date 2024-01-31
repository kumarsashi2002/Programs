import java.util.Scanner;
public class TcsRicha {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String H=sc.nextLine();
        String W=sc.nextLine(); 
        int N=sc.nextInt();
        String[] B=new int[N];
        String B1="";
        for(int i=0;i<N;i++){
            B[i]=sc.nextLine();
            B1=B1+B[i];
        }
    }
}
