import java.util.Scanner;

class ArrayLinearSearch{
    public static void main(String args[]){

        int arr[]={12,36,85,16};
        int x=85;
        int index=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                index=i;
                flag=true;
            }
        }
        if(flag){
            System.out.println(x +" is found at index : "+index);
        }else{
            System.out.println(x +" is not found");
        }


        /* // == By using User Input ==// */
        // Scanner sc =new Scanner(System.in);
        // int i;
        // System.out.println("Enter the size of the array:");
        // int size=sc.nextInt();
        // int arr[]=new int[size];

        // System.out.println("Enter the elements of the array:");
        // for(i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }

        // for(i=0;i<size;i++){
        //     System.out.println("Element at index "+i+" is: "+arr[i]);
        // }
        // // //======= Method to search====
        // System.out.println("Enter the element to search:");
        // int x=sc.nextInt();
        // boolean flag=false;
        // int index=0;
        // for(i=0;i<size;i++){
        //     if(arr[i]==x){
        //         flag=true;
        //         index=i;
        //     }
        // }
        // if(flag){
        //     System.out.println(x+" is at index "+index);
        // }else{
        //     System.out.println(x+" is not in the array");
        // }
        // sc.close();
    }
}