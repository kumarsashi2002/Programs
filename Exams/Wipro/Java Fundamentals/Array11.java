public class Array11 {
    public static void main(String[] args) {
        int arr[]={1,4,1,4,5};
        boolean flag=false;
        for(int val:arr){
            if(val!=1 || val!=4){
                flag=true;
                break;
            }
        }

        if(!flag){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
