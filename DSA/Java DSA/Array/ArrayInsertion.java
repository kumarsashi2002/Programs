import java.util.Scanner;

class ArrayInsertion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the Size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<size/2;i++){
            arr[i]=sc.nextInt();
        }

        // Adding element 
        arr[size/2]=50;
        arr[size/2+1]=60;

        // Inserting at a particular index
        System.out.println("Enter the element to insert:");
        int value=sc.nextInt();
        System.out.println("Enter the index value:");
        int index=sc.nextInt();
        for(i=index;i<size-1;i++){
            i=i+1;
            arr[i+1]=arr[i];
        }
        arr[index]=value;

        
        // Display the array
        for(i=0;i<size;i++){
            System.out.println("Element at index "+i+" is: "+arr[i]);
        }

    }
}