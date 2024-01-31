import java.util.Scanner;

public class ExamS {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int marks[] =new int[n];
        int i=0;
        int sum=0;
        for(i=0;i<n;i++){
            marks[i]=sc.nextInt();
            sum=sum+marks[i];
        }
        System.out.println("Sum is:"+sum);
       
        int z=0;
        for(i=0;i<n;i++){
            if(sum<k){
                sum=sum-marks[i];
                marks[i]=0;
                marks[i]=marks[n-1];
                sum=sum+(marks[i]);
                z=z+1;
            }
        }
        System.out.println("Here:"+sum);
        System.out.println("Number: "+z);
        if(sum>=k){
            System.out.println(z);
        }else{
            System.out.println("-1");
        }
        sc.close();
    }
}

