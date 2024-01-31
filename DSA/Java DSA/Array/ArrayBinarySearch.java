import java.util.Arrays;
import java.util.Scanner;

public class ArrayBinarySearch {
    public static void main(String args[]){
        int arr[]={25,36,12,81,9};
        Arrays.sort(arr);
        // After Sorting elements of array 
        System.out.println("After Sorting elements of array are:");
        for(int val:arr){
            System.out.println(val);
        }
        int x=12;
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        boolean flag=false;
        int index=0;
        while(low<=mid){
            if(x==arr[mid]){
                index=mid;
                flag=true;
                break;
            }
            else if(x>arr[mid]){
                low=mid+1;
                mid=(low+high)/2;
            }
            else if(x<arr[mid]){
                high=mid-1;
                mid=(low+high)/2;
            }
        }
        if(flag){
            System.out.println(x +" is found at index: "+index);
        }else{
            System.out.println("x is not found");
        }


        // // By taking User Input 
        //Scanner sc =new Scanner(System.in);
        // int i;

        // System.out.println("Enter the size of the array:");
        // int size=sc.nextInt();
        // int[] arr=new int[size];
        // System.out.println("Enter the elements of array:");
        // for(i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }

        // System.out.println("Array elements are:");
        // for(i=0;i<size;i++){
        //     System.out.println("Element at index "+i+" is: "+arr[i]);
        // }

        // // // === Sorting the array elements ===
        // for(i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
                
        //     }
        // }

        // System.out.println("Enter the element to search:");
        // int x=sc.nextInt();
        // int low=0;
        // int high=size-1;
        // int mid=(low+high)/2;
        // boolean flag=false;
        // int index=0;
        // while(low<=mid){
        //     if(x==arr[mid]){
        //         //System.out.println("Found at:"+mid);
        //         index=mid;
        //         flag=true;
        //         break;
                
        //     }
        //     else if(x>arr[mid]){
        //         low=mid+1;
        //         mid=(low+high)/2;
        //     }
        //     else if(x<arr[mid]){
        //         high=mid-1;
        //         mid=(low+high)/2;
        //     }
        //     else{
        //         System.out.println("Not Found");
        //     }
        // }
        // if(flag){
        //     System.out.println(x+" Found at index: "+index);
        // }else{
        //     System.out.println("Element Not Found");
        // }
        // sc.close();
        
    }   
}
