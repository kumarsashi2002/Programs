public class MergeSort {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;  // same as (si+ei)/2. But useful for bigger size

        mergeSort(arr, si, mid);  // left part
        mergeSort(arr, mid+1, ei);  // right part
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si , int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;  // Iterator for left part
        int j=mid+1;  // Iterator for right part
        int k=0;  // Iterator for temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int[] arr ={5,2,4,9,3,6};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
    }
}
