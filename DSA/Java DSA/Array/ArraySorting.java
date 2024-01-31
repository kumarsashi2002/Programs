import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//'''====================    Sorting    ==================================='''
class ArraySorting
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int i,size;
		System.out.println("Enter the size of array:"); 
		size=sc.nextInt();
		int[] arr=new int[size];

        System.out.println("Enter Array Elements:");
		for(i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

        System.out.println("Array Elements are:");
		for(i=0;i<size;i++){
			System.out.println("arr["+i+"] is:"+arr[i]);
		}

		// // ======= Sorting using Array inbuilt methods =======
		// Arrays.sort(arr);
		// String ans=Arrays.toString(arr);
		// System.out.println(ans);
		// //Arrays.sort(arr, Collections.reverseOrder());




        //'''===================Sorting in Ascending Order ======================'''
        for(i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        System.out.println("After sorting in Ascending order:");
		for(i=0;i<size;i++){
			System.out.println("Elements of sorted array are: "+arr[i]);
		}

        //'''=========== Sorting in Descending order===================='''
		for(i=0;i<size;i++){
			for(int k=i+1;k<size;k++){
				if(arr[i]<arr[k]){
					int temp2=arr[i];
					arr[i]=arr[k];
					arr[k]=temp2;
				}
			}
		}
		System.out.println("After Sorting in Descending order: ");
		for(i=0;i<size;i++){
			System.out.println("Elements of Sorted(Desc) array are: "+arr[i]);
		} 

		
    }
}


    
		





// class ArraySorting{
//     int i;
//     //int arr[];
    

//     void addElement(int arr[]){
//         for(i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//     }
//     void displayArray(int arr[]){
//         for(i=0;i<size;i++){
//             System.out.println("Element at index "+i+" is:"+arr[i]);
//         }
//     }

//     void sortingAsc(int arr[]){
//         for(i=0;i<size;i++){
//             for(int j=i+1;j<size;j++){
//                 if(arr[i]>arr[j]){
//                     int x=arr[i];
//                     arr[i]=arr[j];
//                     x=arr[j];
//                 }
//             }
//         }
//         System.out.println("Sorted array Is:");
//         ArraySorting a2= new ArraySorting();
//         a2.displayArray(arr);
//     }

//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]=new int[size];
        
        
//         System.out.println("Enter the size of the array:");
//         ArraySorting a1=new ArraySorting();
//         System.out.println("In Main Method:"+a1.i);
//         a1.addElement(arr);
//         a1.displayArray(arr);
//         System.out.println("After Sorting:");
//         a1.sortingAsc(arr);

//         //sc.close();
//     }

// }