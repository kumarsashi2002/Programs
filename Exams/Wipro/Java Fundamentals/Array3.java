public class Array3 {
    public static void main(String[] args) {
        int arr[]={10,26,8,36,19};
        int value=36;
        boolean flag=false;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                index=i;
                flag=true;
            }
        }
        if(flag){
            System.out.println(index);
        }else{
            System.out.println("-1");
        }
    }
}
