import java.util.Arrays;

public class MergeTwoSortedArray {
    // static int[] merge(int[] arr1, int[] arr2){
    //     int m=arr1.length;
    //     int n=arr2.length;
    //     int[] ans=new int[m+n];

    //     int k=0;
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(arr1[i]<arr2[j]){
    //                 ans[k]=arr1[i];
    //                 i++;
    //             }
    //             else{
    //                 ans[k]=arr2[j];
    //                 j++;
    //             }
    //             k++;
    //         }
    //     }
    //     return ans;
    // }

    static void merge2(int[] arr1, int[] arr2, int[] ans2){
        int m=arr1.length;
        int n=arr2.length;
        int i=0, j=0 , k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                ans2[k]=arr1[i];
                i++;
            }
            else{
                ans2[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<m){
            ans2[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n){
            ans2[k]=arr2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr1={2,5,7,9,15,17};
        int[] arr2={4,6,9};
        int ans2[]=new int[arr1.length + arr2.length];
        merge2(arr1, arr2, ans2);
        System.out.println(Arrays.toString(ans2));
    }
}
