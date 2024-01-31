import java.util.Scanner;

public class EvenOddElements{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int i=0;
        int arr[]=new int[size];
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        ////======== To print Even elements ==========
        System.out.println("Even Array elements are:");
        for(i=0;i<size;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }

        ////======== To print Odd Elements ============
        System.out.println("Odd Array elements are:");
        for(i=0;i<size;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }

        ////======== To find sum of all even elements in an array 
        int sum=0;
        for(i=0;i<size;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of even elemnts is:"+sum);


        ////======== To find sum of all even elements in an array
        sum=0;
        for(i=0;i<size;i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of odd elements is:"+sum);


        ////========= To find frequency of an element in an array
        System.out.println("Enter the element to find the frequency:");
        int x=sc.nextInt();
        int count=0;
        for(i=0;i<size;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("Frequency of "+x+" in the array is:"+count);


        
    }
}
