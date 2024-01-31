public class Kartik_Mount_Blue {
    public static void main(String[] args) {
        int[] arr={4,14,12,7,14,16,5,13,7,16,11,19};
        // int[] arr={14,9,19,6,13,13,3,2,12};
        int k=4;
        int sum=0;
        int ans=0;
        int i=0;
        int index=0;
        for(int m=0;m<arr.length/k;m++){
            sum=0;
            for(i=m;i<arr.length;i=i+k){
                sum=sum+arr[i];
            }
            if(sum>ans){
                ans=sum;
                index=m+1;
                System.out.println(sum+"-----" +index);
            }
        }
        System.out.println(ans+"..."+index);
        
    }
}
