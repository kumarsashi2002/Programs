import java.util.Scanner;

class ArrayMerging{
    public static void main(String args[]){
        int i;
        int arr1[]={23,78,03,17,98,34};
        int arr2[]={12,34,65,19,43};
        int arr3[]=new int[30];

        //Copying Elements from arr1 to arr3
        for(i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }

        //Copying Elements from arr2 to arr3
        for(i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
        }

        //Printing the Merged Array Elements 
        System.out.println("Elements of Arrray3 are:");
        for(i=0;i<30;i++){
            System.out.println("arr3["+i+"]:"+arr3[i]);
        }
        
    }
}