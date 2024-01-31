import java.util.Scanner;

public class BubbleSortEx {
    public static void main(String args[]){
        int[] arr={5,6,1,9,4};
        int size=arr.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("After sorting: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}






        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of Array: ");
        // int size=sc.nextInt();
        // int arr[] = new int[size];
        // int i=0;
        // System.out.println("Enter the array elements: ");
        // for(i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }


        


        

        

        /* // Modified Bubble Sort .. */
        // int arr[]={1,2,3,6,9};
        // for(int i=0;i<arr.length;i++){
        //     int count=0;
        //     for(int j=0;j<arr.length-1;j++){
        //         System.out.println("here.."+arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
        //         if(arr[j+1]<arr[j]){
        //             int temp=arr[j+1];
        //             arr[j+1]=arr[j];
        //             arr[j]=temp;
        //             count++;
        //         }
        //     }
        //      if(count==0){
        //          break;
        //      }
        // }

        // for(int i:arr){
        //     System.out.println(i);
        // }
